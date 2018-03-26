package aplicacion.serenity.creacionusuario.definitions;

import aplicacion.serenity.creacionusuario.steps.UsuarioSteps;
import aplicacion.serenity.menu.steps.MenuPrimerNivelSteps;
import aplicacion.serenity.menu.steps.MenuPrincipalSteps;
import aplicacion.serenity.menu.steps.MenuSegundoNivelSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class UsuarioDefinitions {

    @Steps
    UsuarioSteps usuarioSteps;

    @Steps
    MenuPrincipalSteps menuPrincipalSteps;

    @Steps
    MenuPrimerNivelSteps menuPrimerNivelSteps;

    @Steps
    MenuSegundoNivelSteps menuSegundoNivelSteps;

    @When("ingreso las datos del nuevo usuario:$usuario")
    //public void crearUsuarioNoProfesional(ExamplesTable usuario){
        //menuPrincipalSteps.ingresarMenuPrincipal();
        //menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        //menuSegundoNivelSteps.ingresarMenuSegundoNivel();
        //usuarioSteps.nuevoFormulario();
        //usuarioSteps.crearUsuario(usuario);
    //}
    @Then("guardo el usuario")
    public void  verificarIngreso(){
    }
}
