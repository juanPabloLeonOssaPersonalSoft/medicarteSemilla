package aplicacion.serenity.creacionusuario.steps;

import aplicacion.serenity.creacionusuario.pages.UsuarioPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class UsuarioSteps extends ScenarioSteps {

    UsuarioPages usuarioPages=new UsuarioPages(getDriver());

    public UsuarioSteps(Pages pages){
        super(pages);
    }



    @Step
    public void nuevoFormulario(){
        usuarioPages.clicNuevoUsuario();
    }

    @Step
    public void crearUsuario(ExamplesTable datos){
        usuarioPages.ingresarUsuario(datos);
        usuarioPages.ingresarNombres(datos);
        usuarioPages.ingresarPrimerApellido(datos);
        usuarioPages.ingresarRol(datos);
        usuarioPages.ingresarFechaInicio(datos);
        usuarioPages.ingresarContrasena(datos);
        usuarioPages.ingresarConfirmarContrasena(datos);
        usuarioPages.ingresarEmail(datos);
        usuarioPages.SeleccionarSede(datos);
        usuarioPages.guardarUsuario();
    }

    @Step
    public void verificarErrorPage(){
        usuarioPages.VerificarErrorPage();

    }
}
