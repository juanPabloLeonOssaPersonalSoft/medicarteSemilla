package aplicacion.serenity.login.definitions;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;
import aplicacion.serenity.login.steps.LoginSteps;

public class LoginDefinitions {

    @Steps
    LoginSteps loginSteps;

    @Given("como usuario ingreso a la pagina de Medicarte")
    public void ingresarSitio(){
        loginSteps.ingresar();
    }

    @When("ingreso las credenciales:$logueo")
    public void ingresarDatosLogueo(ExamplesTable logueo){
        loginSteps.ingresarDatosLogin(logueo);
    }
    @Then("ingreso a la pagina principal del sitio")
    public void  verificarIngreso(){

    }
}

