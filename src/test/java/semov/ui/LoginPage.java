package semov.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import semov.utils.Util;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//div[@class='general-style dark title-6-rounded w-100 q-pa-none text-center q-mb-sm']")
    private WebElement lblBienvenido;
    @FindBy(xpath = "//img[@class='q-img__image q-img__image--with-transition q-img__image--loaded']")
    private WebElement lblImagen;
    @FindBy(xpath = "//input[@placeholder='Correo electrónico']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@placeholder='Contraseña']")
    private WebElement inputClave;

    @FindBy(xpath = "//span[contains(text(),'Iniciar sesión')]")
    private WebElement buttonLogin;

    @FindBy(xpath = "//span[contains(text(),'Verificar')]")
    private WebElement buttonVerificar;

    public void esperarCargaLogin(){
        Util.waitTime(2);
        lblBienvenido.isDisplayed();
        lblImagen.isDisplayed();
        Util.waitTime(5);
    }

    private void ingresarEmail(String email){
        inputEmail.sendKeys(email);
    }

    private void ingresarClave(String clave){
        inputClave.sendKeys(clave);
    }

    private void presionarBotonLogin(){
        buttonLogin.click();
    }

    private void ingresarCodigo(String codigo){
        try {
            for (int i = 0; i < codigo.length(); i++) {
                char c = codigo.charAt(i);

                WebElement input = getDriver().findElement(By.xpath("//div[@class='flex justify-center']/label[" + (i + 1) + "]//input"));
                input.sendKeys(Character.toString(c));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void presionarBotonVerificar(){
        buttonVerificar.click();
    }

    public void autenticarseEnSemov(String email, String clave){
        ingresarEmail(email);
        Util.waitTime(1);
        ingresarClave(clave);
        Util.waitTime(1);
        presionarBotonLogin();
        Util.waitTime(2);
    }

    public void ingresarCodigoValidacion(String codigo){
        ingresarCodigo(codigo);
        Util.waitTime(1);
        presionarBotonVerificar();
        Util.waitTime(4);
    }

}
