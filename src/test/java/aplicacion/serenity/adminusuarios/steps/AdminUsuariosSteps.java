package aplicacion.serenity.adminusuarios.steps;

import aplicacion.serenity.adminusuarios.pages.AdminUsuariosPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AdminUsuariosSteps extends ScenarioSteps {

    AdminUsuariosPages adminUsuariosPages = new AdminUsuariosPages(getDriver());

    public AdminUsuariosSteps(Pages pages){
        super(pages);
    }


    @Step
    public void nuevoFormulario(){
        adminUsuariosPages.clicNuevoUsuario();
    }
}
