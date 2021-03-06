package aplicacion.serenity.verificacionusuario.definitions;

import aplicacion.serenity.creacionusuario.steps.UsuarioSteps;
import aplicacion.serenity.verificacionusuario.steps.VerificacionUsuarioSteps;
import aplicacion.serenity.menu.steps.MenuPrimerNivelSteps;
import aplicacion.serenity.menu.steps.MenuPrincipalSteps;
import aplicacion.serenity.menu.steps.MenuSegundoNivelSteps;
import aplicacion.serenity.adminusuarios.steps.AdminUsuariosSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class VerificacionUsuarioDefinitions {

    @Steps
    VerificacionUsuarioSteps verificacionUsuarioSteps;

    @Steps
    MenuPrincipalSteps menuPrincipalSteps;

    @Steps
    MenuPrimerNivelSteps menuPrimerNivelSteps;

    @Steps
    MenuSegundoNivelSteps menuSegundoNivelSteps;

    @Steps
    AdminUsuariosSteps adminUsuariosSteps;

    @Steps
    UsuarioSteps usuarioSteps;

    @When("ingreso las datos del usuario a verificar:$usuario")
    public void crearUsuarioNoProfesional(ExamplesTable usuario) {
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuSegundoNivel();
        adminUsuariosSteps.nuevoFormulario();
        verificacionUsuarioSteps.ingresarUsuario(usuario);

    }
    @Then("verifico el usuario:$usuario")
    public void ThenVerificarUsuario(ExamplesTable usuario){
        verificacionUsuarioSteps.verificarUsuario(usuario);
    }
    @When("ingreso las datos a modificar:$usuario")
    public void ModificacionUsuario(ExamplesTable usuario) {
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuSegundoNivel();
        adminUsuariosSteps.nuevoFormulario();
        verificacionUsuarioSteps.ingresarUsuario(usuario);
        verificacionUsuarioSteps.editarUsuario(usuario);
        verificacionUsuarioSteps.editarEmail(usuario);
        verificacionUsuarioSteps.editarFechaInicio(usuario);
        verificacionUsuarioSteps.editarSede(usuario);
        verificacionUsuarioSteps.editarPrimerApellido(usuario);

    }
    @Then("verifico el usuario modificado")
    public void ThenVerificacion( ){
        verificacionUsuarioSteps.checkSaveUser();
    }
}