package semov.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import semov.utils.Util;

public class TramitesServiciosPage extends PageObject {

    @FindBy(xpath = "//tbody/tr[1]/td[6]//img")
    private WebElement tdDetalle;
    @FindBy(xpath = "//div[@role='menu']//i")
    private WebElement itemVerDetalle;
    @FindBy(xpath = "//span[contains(text(),'Iniciar Trámite')]")
    private WebElement buttonIniciarTramite;
    @FindBy(xpath = "//span[contains(text(),'Sí, soy yo')]")
    private WebElement buttonSiSoyYo;
    @FindBy(xpath = "//i[@class='q-icon notranslate material-icons q-select__dropdown-icon']")
    private WebElement listConcesion;
    @FindBy(xpath = "//span[normalize-space()='CAS1-6DGI1']")
    private WebElement itemConcesion;
    @FindBy(xpath = "//span[contains(text(),'Continuar')]")
    private WebElement buttonContinuar;
    @FindBy(xpath = "//span[normalize-space()='Iniciar captura']")
    private WebElement buttonIniciarCaptura;
    @FindBy(xpath = "//div[@class='w-90 q-mx-auto q-mb-xl']/div[1]/div[1]/div[2]/div[9]//div[@class='q-field__control relative-position row no-wrap text-negative']/div[3]/i")
    private WebElement inputOficinaAtencion;
    @FindBy(xpath = "//span[normalize-space()='Oficina Toluca']")
    private WebElement itemOficinaAtencion;
    @FindBy(xpath = "//i[@class='q-icon notranslate material-icons q-select__dropdown-icon']")
    private WebElement listAñosProrroga;
    @FindBy(xpath = "//span[normalize-space()='4']")
    private WebElement itemAñosProrroga;
    @FindBy(xpath = "//tbody/tr[1]/td[3]//div")
    private WebElement linkSubirDocumentoPoliza;
    @FindBy(xpath = "//tbody/tr[2]/td[3]//div")
    private WebElement linkSubirDocumentoIdentificacion;
    @FindBy(xpath = "//tbody/tr[3]/td[3]//div")
    private WebElement linkFormatosUniversales;
    @FindBy(xpath = "//tbody/tr[4]/td[3]//div")
    private WebElement linkFormatosTarjetaCirculacion;
    @FindBy(xpath = "//tbody/tr[6]/td[3]//div")
    private WebElement linkFormatosTitularConcesionario;
    @FindBy(xpath = "//tbody/tr[10]/td[3]//div")
    private WebElement linkFormatosLineaPago;
    @FindBy(xpath = "//tbody/tr[11]/td[3]//div")
    private WebElement linkTemporada2024;
    @FindBy(xpath = "//tbody/tr[12]/td[3]//div")
    private WebElement linkTemporada2023;
    @FindBy(xpath = "//tbody/tr[13]/td[3]//div")
    private WebElement linkTemporada2022;
    @FindBy(xpath = "//tbody/tr[14]/td[3]//div")
    private WebElement linkTemporada2021;
    @FindBy(xpath = "//div[@name='Subir desde mi equipo']/div")
    private WebElement linkSubirDesdeMiEquipo;
    @FindBy(xpath = "//span[normalize-space()='Seleccionar documentos']/span")
    private WebElement buttonSeleccionarDocumentos;
    @FindBy(xpath = "//div[@class='q-mt-xl']/div/input")
    private WebElement inputSubirFile;
    @FindBy(xpath = "//span[contains(@class,'q-btn__content')]//span[normalize-space()='Agregar archivos']")
    private WebElement buttonAgregarArchivos;
    @FindBy(xpath = "//div[@class='q-gutter-sm']//div[2]//div[@class='q-radio__inner relative-position q-radio__inner--falsy']")
    private WebElement radiobuttonEnLinea;
    @FindBy(xpath = "//span[normalize-space()='Generar línea de captura']/span")
    private WebElement buttonGenerarLineaCaptura;
    @FindBy(xpath = "//span[normalize-space()='Finalizar registro']")
    private WebElement buttonFinalizarRegistro;
    //aprobar
    @FindBy(xpath = "//tbody/tr[1]/td[8]//img")
    private WebElement tdRevisionDetalle;
    private void seleccionarTramite(){
        Util.waitTime(2);
        tdDetalle.click();
        tdRevisionDetalle.click();
        Util.waitTime(2);
    }
    private void iniciarRevision(){
        buttonIniciarRevision.click();
        Util.waitTime(2);
    }
    private void aprobarDocumentos(){
        aprobacionDocumento1.click();
        Util.waitTime(5);
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement btnAprobar1 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[1]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar1.click();
        Util.waitTime(5);
        WebElement btnAprobar2 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[2]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar2.click();
        Util.waitTime(5);
        desglosar3.click();
        WebElement btnAprobar3 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[3]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar3.click();
        Util.waitTime(5);
        desglosar4.click();
        WebElement btnAprobar4 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[4]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar4.click();
        Util.waitTime(5);
        desglosar5.click();
        WebElement btnAprobar5 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[5]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar5.click();
        Util.waitTime(5);
        desglosar6.click();
        WebElement btnAprobar6 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-pa-md']/div[6]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
        ));
        btnAprobar6.click();
        Util.waitTime(5);
        /*aprobacion7.click();
        System.out.println("8");*/
        Util.waitTime(5);
    }
    private void aprobarDocumentosDefinidos(){
        System.out.println("---");
        listDocumentos.click();
        Util.waitTime(1);
        opcion2.click();
        Util.waitTime(2);
        buttonAprobarDocumento.click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement btnAprobar1 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='Close']")
        ));
        btnAprobar1.click();
        Util.waitTime(5);
        System.out.println("0");

        listDocumentos.click();
        Util.waitTime(1);
        opcion3.click();
        Util.waitTime(2);
        buttonAprobarDocumento.click();
        WebElement btnAprobar2 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='Close']")
        ));
        btnAprobar2.click();
        Util.waitTime(5);
        System.out.println("1");

        listDocumentos.click();
        Util.waitTime(1);
        opcion4.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar3 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar3.click();
        Util.waitTime(5);
        System.out.println("2");

        listDocumentos.click();
        Util.waitTime(1);
        opcion5.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar4 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar4.click();
        Util.waitTime(5);
        System.out.println("3");

        listDocumentos.click();
        Util.waitTime(1);
        opcion6.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar5 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar5.click();
        Util.waitTime(5);
        System.out.println("4");

        listDocumentos.click();
        Util.waitTime(1);
        opcion7.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar6 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar6.click();
        Util.waitTime(5);
        System.out.println("5");

        listDocumentos.click();
        Util.waitTime(1);
        opcion8.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar7 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar7.click();
        Util.waitTime(5);
        System.out.println("6");

        listDocumentos.click();
        Util.waitTime(1);
        opcion9.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar8 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar8.click();
        Util.waitTime(5);
        System.out.println("7");

        listDocumentos.click();
        Util.waitTime(1);
        opcion10.click();
        Util.waitTime(1);
        buttonAprobarDocumento.click();
        WebElement btnAprobar9 = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@role='alert']//following-sibling::button[@aria-label='close']")
        ));
        btnAprobar9.click();
        Util.waitTime(5);
        System.out.println("8");

        buttonAprobacionFinal.click();
        Util.waitTime(5);
    }
    private void validarMensajeAprobacion(){
        System.out.println(labelMensajeAutorizado.getText());
    }
    public void realizarAprobacionDocumentos(){
        //seleccionarTramite();
        iniciarRevision();
        aprobarDocumentos();
        aprobarDocumentosDefinidos();
        validarMensajeAprobacion();
    }
    @FindBy(xpath = "//span[normalize-space()='Iniciar revisión']/span")
    private WebElement buttonIniciarRevision;
    @FindBy(xpath = "//div[@class='q-pr-md']//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacionDocumento1;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[1]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion1;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[1]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar1;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[2]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion2;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[2]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar2;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[3]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion3;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[3]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar3;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[4]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion4;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[4]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar4;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[5]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion5;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[5]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar5;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[6]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion6;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[6]//div[@class='q-item__section column q-item__section--side justify-center q-focusable relative-position cursor-pointer']")
    private WebElement desglosar6;
    @FindBy(xpath = "//div[@class='q-pa-md']/div[7]//button[@class='q-btn q-btn-item non-selectable no-outline q-btn--flat q-btn--rectangle q-btn--rounded text-primary q-btn--actionable q-focusable q-hoverable rounded-semov text-capitalize button-semov approve-button text-button-mont-blod-xs size-button-sections w-auto']/span[2]/span")
    private WebElement aprobacion7;
    @FindBy(xpath = "//div[@class='q-pr-md']//div[@class='col-12']/label//div[@class='q-field__inner relative-position col self-stretch']//i")
    private WebElement listDocumentos;
    @FindBy(xpath = "//div[@class='q-item__section column q-item__section--main justify-center option-pending-text'][normalize-space()='Identificación oficial vigente del titular.pdf']")
    private WebElement opcion2;
    @FindBy(xpath = "//div[contains(text(),'Formatos universales de pago.pdf')]")
    private WebElement opcion3;
    @FindBy(xpath = "//div[contains(text(),'Tarjeta de circulación.pdf')]")
    private WebElement opcion4;
    @FindBy(xpath = "//div[@class='q-item__section column q-item__section--main justify-center option-pending-text'][normalize-space()='Identificación oficial vigente del titular de la concesión.pdf']")
    private WebElement opcion5;
    @FindBy(xpath = "//div[contains(text(),'Línea de pago de tenencia del 2025.pdf')]")
    private WebElement opcion6;
    @FindBy(xpath = "//div[contains(text(),'Línea de pago de tenencia del 2024.pdf')]")
    private WebElement opcion7;
    @FindBy(xpath = "//div[contains(text(),'Línea de pago de tenencia del 2023.pdf')]")
    private WebElement opcion8;
    @FindBy(xpath = "//div[contains(text(),'Línea de pago de tenencia del 2022.pdf')]")
    private WebElement opcion9;
    @FindBy(xpath = "//div[contains(text(),'Línea de pago de tenencia del 2021.pdf')]")
    private WebElement opcion10;
    @FindBy(xpath = "//div[@class='col-12']//span[contains(text(),'Aprobar')]")
    private WebElement buttonAprobarDocumento;
    @FindBy(xpath = "//button[@type='button']//span[contains(text(),'Aprobar')]")
    private WebElement buttonAprobacionFinal;
    @FindBy(xpath = "//span[normalize-space()='Autorizado por validador']")
    private WebElement labelMensajeAutorizado;
    @FindBy(xpath = "//div[@class='general-style dark subtitle-1-disabled'][normalize-space()='Autorizado']")
    private WebElement tabAutorizado;
    private void concluirTramite(){
        tabAutorizado.click();
        Util.waitTime(2);
        tdRevisionDetalle.click();
        itemConcluir.click();
        Util.waitTime(2);
        buttonConfirmarConclusion.click();
    }
    private void validarEstadoTramite(){
        tdRevisionDetalle.click();
        itemVerDetalleConcluido.click();
        Util.waitTime(2);
        System.out.println(labelMensajeTramiteConcluido.getText());
    }
    public void concluirTramiteProrroga(){
        concluirTramite();
    }
    public void validarTramiteConcluido(){
        validarEstadoTramite();
    }
    @FindBy(xpath = "//div[@class='q-list']/div[2]//i")
    private WebElement itemConcluir;
    @FindBy(xpath = "//span[contains(text(),'Sí, concluir')]")
    private WebElement buttonConfirmarConclusion;
    @FindBy(xpath = "//div[@class='q-list']/div[1]//i")
    private WebElement itemVerDetalleConcluido;
    @FindBy(xpath = "//span[@class='q-pa-sm q-ma-sm']")
    private WebElement labelMensajeTramiteConcluido;

    private void seleccionarVerMas() {
        tdDetalle.click();
    }

    private void seleccionarVerDetalle() {
        itemVerDetalle.click();
    }

    private void presionarBotonIniciarTramite() {
        buttonIniciarTramite.click();
    }

    private void presionarBotonSiSoyYo() {
        buttonSiSoyYo.click();
        Util.waitTime(2);
    }

    private void seleccionarConcesion() {
        Util.waitTime(2);
        listConcesion.click();
        itemConcesion.click();
        Util.waitTime(2);
    }

    private void presionarBotonContinuar() {
        buttonContinuar.click();
        Util.waitTime(2);
    }

    private void presionarBotonIniciarCaptura() {
        buttonIniciarCaptura.click();
        Util.waitTime(5);
    }

    private void seleccionarOficinaAtencion() {
        Util.waitTime(2);
        inputOficinaAtencion.click();
        itemOficinaAtencion.click();
        Util.waitTime(2);
    }

    private void seleccionarAñosProrroga() {
        listAñosProrroga.click();
        itemAñosProrroga.click();
        Util.waitTime(2);
    }

    private void presionarSubirDocumentoPoliza() {
        linkSubirDocumentoPoliza.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumentoIdentificacion() {
        linkSubirDocumentoIdentificacion.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumentoFormatosUniversales() {
        linkFormatosUniversales.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumentoTarjetaCirculacion() {
        linkFormatosTarjetaCirculacion.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumentoTitularConcesionario() {
        linkFormatosTitularConcesionario.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumentoLineaPago() {
        linkFormatosLineaPago.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumento2024() {
        linkTemporada2024.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumento2023() {
        linkTemporada2023.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumento2022() {
        linkTemporada2022.click();
        Util.waitTime(1);
    }

    private void presionarSubirDocumento2021() {
        linkTemporada2021.click();
        Util.waitTime(1);
    }

    private void subirDocumentoEnModal() {
        linkSubirDesdeMiEquipo.click();
        Util.waitTime(2);

        String rootFile = "";
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
        WebElement inputFile = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='q-mt-xl']/div/input")
        ));
        js.executeScript("arguments[0].removeAttribute('style');", inputFile);
        inputFile.sendKeys(rootFile);

        Util.waitTime(1);
        buttonAgregarArchivos.click();
        Util.waitTime(4);
    }
    private void subirDocumento1(){
        presionarSubirDocumentoPoliza();
        subirDocumentoEnModal();
    }
    private void subirDocumento2(){
        presionarSubirDocumentoIdentificacion();
        subirDocumentoEnModal();
    }
    private void subirDocumento3(){
        presionarSubirDocumentoFormatosUniversales();
        subirDocumentoEnModal();
    }
    private void subirDocumento4(){
        presionarSubirDocumentoTarjetaCirculacion();
        subirDocumentoEnModal();
    }
    private void subirDocumento5(){
        presionarSubirDocumentoTitularConcesionario();
        subirDocumentoEnModal();
    }
    private void subirDocumento6(){
        presionarSubirDocumentoLineaPago();
        subirDocumentoEnModal();
    }
    private void subirDocumento7(){
        presionarSubirDocumento2024();
        subirDocumentoEnModal();
    }
    private void subirDocumento8(){
        presionarSubirDocumento2023();
        subirDocumentoEnModal();
    }
    private void subirDocumento9(){
        presionarSubirDocumento2022();
        subirDocumentoEnModal();
    }
    private void subirDocumento10(){
        presionarSubirDocumento2021();
        subirDocumentoEnModal();
    }
    private void finalizarTramite(){
        radiobuttonEnLinea.click();
        Util.waitTime(1);
        buttonGenerarLineaCaptura.click();
        Util.waitTime(8);
        buttonFinalizarRegistro.click();
        Util.waitTime(8);
    }
    private void verDetalleDeTramite(){
        tdRevisionDetalle.click();
        itemVerDetalle.click();
        Util.waitTime(2);
    }
    private void realizarRevision(){
        buttonIniciarRevision.click();

    }


    public void dirigirseVerDetalleProrrogaDePermiso(){
        seleccionarVerMas();
        seleccionarVerDetalle();
    }
    public void completarDatosPreliminares(){
        presionarBotonIniciarTramite();
        Util.waitTime(4);
        presionarBotonSiSoyYo();
        seleccionarConcesion();
        Util.waitTime(2);
        presionarBotonContinuar();
        presionarBotonIniciarCaptura();
        Util.waitTime(5);
    }
    public void completarInformacionGeneral(){
        seleccionarOficinaAtencion();
        presionarBotonContinuar();
        presionarBotonContinuar();
    }
    public void completarPolizaSeguro(){
        presionarBotonContinuar();
    }
    public void completarDatosProrroga(){
        seleccionarAñosProrroga();
        presionarBotonContinuar();
    }

    public void subirDocumentosRequeridos(){
        subirDocumento1();
        subirDocumento2();
        subirDocumento3();
        subirDocumento4();
        subirDocumento5();
        subirDocumento6();
        subirDocumento7();
        subirDocumento8();
        subirDocumento9();
        subirDocumento10();
        Util.waitTime(2);
        presionarBotonContinuar();
        Util.waitTime(6);
    }
    public void finalizarRegistroTramite(){
        finalizarTramite();
    }
    //aprobar
    public void verDetalleTramite(){
        verDetalleDeTramite();
        Util.waitTime(2);
    }


}
