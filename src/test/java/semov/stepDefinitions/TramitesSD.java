package semov.stepDefinitions;

import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;
import semov.steps.TramitesServiciosSteps;

public class TramitesSD {

    @Steps
    TramitesServiciosSteps steps;

    @And("se dirige a Tramites de Prorroga de Permisos")
    public void dirigirseATramiteDeProrrogaPermisos(){
        steps.dirigirseATramiteDeProrrogaPermisos();
    }
    @And("se dirige a revisar tramite")
    public void dirigirseRevisionTramite(){
        steps.dirigirseRevisionTramite();
    }
    @And("realiza la aprobacion de documentos")
    public void aprobarDocumentos(){
        steps.aprobarDocumentos();
    }
    @And("se reasigna la solicitud")
    public void reasignarSolicitud(){
        steps.reasignarSolicitud();
    }


}
