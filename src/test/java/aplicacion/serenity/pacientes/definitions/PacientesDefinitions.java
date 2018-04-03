package aplicacion.serenity.pacientes.definitions;

import aplicacion.serenity.pacientes.steps.PacientesSteps;
import aplicacion.serenity.menu.steps.MenuPrimerNivelSteps;
import aplicacion.serenity.menu.steps.MenuPrincipalSteps;
import aplicacion.serenity.menu.steps.MenuSegundoNivelSteps;
import aplicacion.serenity.adminpacientes.steps.AdminPacientesSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.model.ExamplesTable;

public class PacientesDefinitions {
    @Steps
    PacientesSteps pacientesSteps;

    @Steps
    MenuPrincipalSteps menuPrincipalSteps;

    @Steps
    MenuPrimerNivelSteps menuPrimerNivelSteps;

    @Steps
    MenuSegundoNivelSteps menuSegundoNivelSteps;

    @Steps
    AdminPacientesSteps adminPacientesSteps;

    @When("ingreso las datos del nuevo paciente:$paciente")
    public void addPaciente(ExamplesTable paciente) {
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuPacientes();
        adminPacientesSteps.nuevoFormularioPacientes();
        pacientesSteps.addPaciente(paciente);
        pacientesSteps.addDatosResponsable(paciente);
        pacientesSteps.savePaciente();
    }

    @Then("guardo el paciente")
    public void verificarIngreso() {
        pacientesSteps.checkSavePaciente();
    }

    @When("ingreso las datos a editar del paciente:$paciente")
    public void EditPaciente(ExamplesTable paciente) {
        menuPrincipalSteps.ingresarMenuPrincipal();
        menuPrimerNivelSteps.ingresarMenuPrimerNivel();
        menuSegundoNivelSteps.ingresarMenuPacientes();
        adminPacientesSteps.nuevoFormularioPacientes();
        pacientesSteps.ingresarIdentificacion(paciente);
        pacientesSteps.EditPaciente(paciente);
        pacientesSteps.EditDatosResponsable(paciente);
        pacientesSteps.editPaciente();
    }

    @Then("verificar")
    public void verificarEdicion() {
        pacientesSteps.checkSavePaciente();
    }
}

