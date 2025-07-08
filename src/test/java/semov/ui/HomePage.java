package semov.ui;

import net.thucydides.core.pages.PageObject;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import semov.utils.Util;

public class HomePage extends PageObject {

    @FindBy(xpath = "//img[@class='cursor-pointer']")
    private WebElement buttonMenu;

    @FindBy(xpath = "//div[@class='q-scrollarea__content absolute']/section/section[2]//img")
    private WebElement optionTramiteServicios;
    @FindBy(xpath = "//div[@class='q-scrollarea__content absolute']/section/section[5]//img")
    private WebElement optionConsultaTramites;
    @FindBy(xpath = "//*[@id='app']/div/div[1]/div/aside/div/div[1]/div[1]/div/section/section[2]/div[2]/div/div[2]/img")
    private WebElement subOptionSeguimiento;
    @FindBy(xpath = "//div[@class='q-avatar__content row flex-center overflow-hidden']")
    private WebElement iconAvatar;
    @FindBy(xpath = "//div[@class='general-style dark subtitle-2'][normalize-space()='Cerrar Sesión']")
    private WebElement buttonCerrarSesion;
    private void cerrarSesion(){
        iconAvatar.click();
        buttonCerrarSesion.click();
    }

    private void seleccionarMenu(){
        buttonMenu.click();
    }

    private void seleccionarTramiteServicios(){
        optionTramiteServicios.click();
    }
    private void seleccionarMenuReasignacion(){
        //seleccionarMenu();
        System.out.println("0");
        Util.waitTime(2);
        optionTramiteServicios.click();
        Util.waitTime(2);
        System.out.println("1");
        subOptionSeguimiento.click();
        System.out.println("2");
    }


    public void dirigirseTramitesServicios(){
        //seleccionarMenu();
        seleccionarTramiteServicios();
        Util.waitTime(5);
    }
    public void dirigirseModuloConsultas(){
        optionConsultaTramites.click();
    }
    public void dirigirseBandejaReasignacion(){
        seleccionarMenuReasignacion();
        Util.waitTime(3);
    }
    public void cerrarSesionUsuario(){
        cerrarSesion();
    }

}
