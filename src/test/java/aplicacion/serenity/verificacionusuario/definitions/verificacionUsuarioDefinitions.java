package aplicacion.serenity.verificacionusuario.definitions;

import aplicacion.serenity.verificacionusuario.steps.verificacionUsuarioSteps;
import aplicacion.serenity.menu.steps.MenuPrimerNivelSteps;
import aplicacion.serenity.menu.steps.MenuPrincipalSteps;
import aplicacion.serenity.menu.steps.MenuSegundoNivelSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class verificacionUsuarioDefinitions {

    @Steps
    verificacionUsuarioSteps verificacionUsuarioSteps;

    @Steps
    MenuPrincipalSteps menuPrincipalSteps;

    @Steps
    MenuPrimerNivelSteps menuPrimerNivelSteps;

    @Steps
    MenuSegundoNivelSteps menuSegundoNivelSteps;

    @When("ingreso las datos del usuario a verificar:$usuario")
    public void verificacionUsuarios(ExamplesTable usuario){
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuSegundoNivel();
        verificacionUsuarioSteps.nuevoFormulario();
        verificacionUsuarioSteps.ingresarUsuario(usuario);
        verificacionUsuarioSteps.verificarNombre(usuario);
    }
    @Then("verifico el usuario")
    public void  verificarDatos(){

    }
}
