package aplicacion.serenity.verificacionUsuario.steps;

import aplicacion.serenity.verificacionUsuario.pages.verificacionUsuarioPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class verificacionUsuarioSteps extends ScenarioSteps {

    verificacionUsuarioPages verificacionUsuarioPages=new verificacionUsuarioPages(getDriver());

    public verificacionUsuarioSteps(Pages pages){
        super(pages);
    }



    @Step
    public void nuevoFormulario(){
        verificacionUsuarioPages.clicNuevoUsuario();
    }

    @Step
    public void crearUsuario(ExamplesTable datos){
        verificacionUsuarioPages.checkNombres(datos);
        verificacionUsuarioPages.checkPrimerApellido(datos);
    }
}
