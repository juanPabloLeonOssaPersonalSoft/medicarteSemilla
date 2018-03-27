package aplicacion.serenity.verificacionUsuario.definitions;

import aplicacion.serenity.creacionusuario.steps.UsuarioSteps;
import aplicacion.serenity.verificacionUsuario.steps.verificacionUsuarioSteps;
import aplicacion.serenity.menu.steps.MenuPrimerNivelSteps;
import aplicacion.serenity.menu.steps.MenuPrincipalSteps;
import aplicacion.serenity.menu.steps.MenuSegundoNivelSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class verificacionUsuarioDefinitions {

    @Steps
    UsuarioSteps usuarioSteps;

    @Steps
    MenuPrincipalSteps menuPrincipalSteps;

    @Steps
    MenuPrimerNivelSteps menuPrimerNivelSteps;

    @Steps
    MenuSegundoNivelSteps menuSegundoNivelSteps;

    @Steps
    verificacionUsuarioSteps verificacionUsuarioSteps;

    @When("ingreso las datos del usuario a verificar:$usuario")
    public void crearUsuarioNoProfesional(ExamplesTable usuario){
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuSegundoNivel();
        usuarioSteps.nuevoFormulario();
        verificacionUsuarioSteps.ingresarUsuario(usuario);
        verificacionUsuarioSteps.verificarUsuario(usuario);

    }
    @Then("verifico el usuario")
    public void  verificarIngreso(){
    }
}
