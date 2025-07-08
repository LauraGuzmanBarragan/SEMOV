package semov.ui;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import semov.utils.Util;

public class ReasignarPage extends PageObject {

    @FindBy(xpath = "//tbody/tr[1]/td[10]//img")
    private WebElement tdDetalle;
    @FindBy(xpath = "//div[@class='q-list']/div[3]//i")
    private WebElement itemReasignar;
    @FindBy(xpath = "//div[@class='row q-col-gutter-lg']/div[1]//i[@role='presentation'][normalize-space()='arrow_drop_down']")
    private WebElement listAsignar;
    @FindBy(xpath = "//span[contains(text(),'Eloy García Hernández')]")
    private WebElement itemUserAsignado;
    @FindBy(xpath = "//div[@class='row q-col-gutter-lg']/div[2]//i[@role='presentation'][normalize-space()='arrow_drop_down']")
    private WebElement listMotivo;
    @FindBy(xpath = "//span[contains(text(),'Otros')]")
    private WebElement itemMotivo;
    @FindBy(xpath = "//span[contains(text(),'Guardar cambios')]")
    private WebElement buttonGuardarCambios;

    private void seleccionarTramiteEnBandeja(){
        Util.waitTime(2);
        tdDetalle.click();
        Util.waitTime(1);
        itemReasignar.click();
        Util.waitTime(2);
        listAsignar.click();
        Util.waitTime(1);
        itemUserAsignado.click();
        Util.waitTime(2);
        listMotivo.click();
        itemMotivo.click();
        Util.waitTime(2);
        buttonGuardarCambios.click();
        Util.waitTime(10);
    }


    public void reasignarTramiteProrroga(){
        seleccionarTramiteEnBandeja();
    }
}
