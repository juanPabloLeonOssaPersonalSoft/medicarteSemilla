package aplicacion.serenity.adminpacientes.steps;

import aplicacion.serenity.adminpacientes.pages.AdminPacientesPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AdminPacientesSteps extends ScenarioSteps {

    AdminPacientesPages adminPacientesPages = new AdminPacientesPages(getDriver());

    public AdminPacientesSteps(Pages pages){
        super(pages);
    }


    @Step
    public void nuevoFormularioPacientes(){
        adminPacientesPages.clicNuevoPaciente();
    }
}
