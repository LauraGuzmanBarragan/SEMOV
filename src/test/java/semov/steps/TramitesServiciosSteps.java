package semov.steps;

import net.thucydides.core.annotations.Step;
import semov.ui.HomePage;
import semov.ui.ReasignarPage;
import semov.ui.TramitesServiciosPage;

public class TramitesServiciosSteps {

    HomePage homePage;
    TramitesServiciosPage tramitesPage;
    ReasignarPage reasignarPage;

    @Step
    public void dirigirseATramiteDeProrrogaPermisos(){
        homePage.dirigirseTramitesServicios();
        tramitesPage.dirigirseVerDetalleProrrogaDePermiso();
        //otros steps
        tramitesPage.completarDatosPreliminares();
        tramitesPage.completarInformacionGeneral();
        tramitesPage.completarPolizaSeguro();
        tramitesPage.completarDatosProrroga();
        tramitesPage.subirDocumentosRequeridos();
        tramitesPage.finalizarRegistroTramite();
    }

    @Step
    public void dirigirseRevisionTramite(){
        homePage.dirigirseTramitesServicios();
        tramitesPage.verDetalleTramite();
    }
    @Step
    public void aprobarDocumentos(){
        tramitesPage.realizarAprobacionDocumentos();
        homePage.dirigirseTramitesServicios();
        tramitesPage.concluirTramiteProrroga();
        homePage.dirigirseModuloConsultas();
        tramitesPage.validarTramiteConcluido();
    }
    @Step
    public void reasignarSolicitud(){
        homePage.dirigirseBandejaReasignacion();
        reasignarPage.reasignarTramiteProrroga();
        homePage.cerrarSesionUsuario();
    }

}
