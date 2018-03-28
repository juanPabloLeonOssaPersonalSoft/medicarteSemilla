package aplicacion.serenity.verificacionusuario.steps;

import aplicacion.serenity.creacionusuario.pages.UsuarioPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class VerificacionUsuarioSteps extends ScenarioSteps {

    UsuarioPages user=new UsuarioPages(getDriver());

    public VerificacionUsuarioSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarUsuario(ExamplesTable datos){
        user.ingresarUsuario(datos);

    }

    @Step
    public void verificarUsuario(ExamplesTable datos) {
        user.setVerificarNombre(datos);
        user.setVerificarApellido(datos);
        user.setVerificarFechaInicio(datos);
        user.setVerificarEmail(datos);
        user.setVerificarRol(datos);
        user.setVerificarSede(datos);
    }

    @Step
    public void editarUsuario(ExamplesTable datos) {
        user.setEditarRol(datos);
    }

    @Step
    public void editarEmail(ExamplesTable datos) {
        user.setEditarEmail(datos);
    }

    public void editarFechaInicio(ExamplesTable usuario) {
        user.setEditarFechaInicio(usuario);
    }

    public  void editarPrimerApellido(ExamplesTable datos) {
        user.setEditarPrimerApellido(datos);
    }
}
