package aplicacion.serenity.verificacionusuario.steps;

import aplicacion.serenity.verificacionusuario.pages.verificacionUsuarioPages;
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
    public void ingresarUsuario(ExamplesTable datos){
        verificacionUsuarioPages.setIngresarUsuario(datos);
    }

    @Step
    public void verificarNombre(ExamplesTable datos){
        verificacionUsuarioPages.setVericarNombre(datos);
    }
}
