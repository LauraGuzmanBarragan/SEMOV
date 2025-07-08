package semov.steps;

import io.cucumber.datatable.DataTable;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.util.EnvironmentVariables;
import semov.ui.LoginPage;
import semov.utils.Util;

import java.util.List;
import java.util.Map;

public class LoginSteps {

    LoginPage page;

    EnvironmentVariables environmentVariables;

    @Step
    public void abrirWeb(){
        page.openUrl(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("semov.base.url"));
        page.esperarCargaLogin();
    }
    @Step
    public void abrirLinkDePagos(){
        page.openUrl(EnvironmentSpecificConfiguration.from(environmentVariables).getProperty("semov.pagos.url"));
        Util.waitTime(4);
    }

    @Step
    public void autenticarseEnLogin(DataTable table){
        List<Map<String, String>> list = table.asMaps(String.class, String.class);
        page.autenticarseEnSemov(list.get(0).get("email"),list.get(0).get("clave"));
    }

    @Step
    public void ingresarCodigoValidacion(String codigo){
        page.ingresarCodigoValidacion(codigo);
    }

}
