package semov.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import semov.steps.LoginSteps;

public class LoginSD {

    @Steps
    LoginSteps steps;

    @Given("que ingreso a la plataforma de SEMOV")
    public void abrirWebDemoshop(){
        steps.abrirWeb();
    }

    @When("ingreso el email y clave en el login")
    public void autenticarseEnLogin(DataTable table){
        steps.autenticarseEnLogin(table);
    }

    @And("ingreso el código de verificación {string}")
    public void ingresarCodigoValidacion(String codigo){
        steps.ingresarCodigoValidacion(codigo);
    }


}
