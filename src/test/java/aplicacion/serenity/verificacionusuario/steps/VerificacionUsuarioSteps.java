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

        user.verificarUsuarioNoProfesional(datos);
        user.VerificarApellido(datos);
    }

}
