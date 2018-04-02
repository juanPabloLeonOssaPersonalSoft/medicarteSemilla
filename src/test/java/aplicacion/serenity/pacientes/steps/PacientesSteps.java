package aplicacion.serenity.pacientes.steps;

import aplicacion.serenity.creacionusuario.pages.UsuarioPages;
import net.thucydides.core.steps.ScenarioSteps;
import aplicacion.serenity.pacientes.pages.PacientesPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class PacientesSteps extends ScenarioSteps {
    PacientesPages pacientesPages=new PacientesPages(getDriver());

    public PacientesSteps(Pages pages){
        super(pages);
    }

    @Step
    public void addPaciente(ExamplesTable datos){
        pacientesPages.ingresarTipoId(datos);
        pacientesPages.ingresarIdentificacion(datos);
        pacientesPages.ingresarPrimerNombre(datos);
        pacientesPages.ingresarPrimerApellido(datos);
        pacientesPages.ingresarGenero(datos);
        pacientesPages.ingresarEstadoCivil(datos);
        pacientesPages.setMedicoTratante(datos);
        pacientesPages.setPrograma(datos);
        pacientesPages.setDrNombres(datos);
        pacientesPages.setDrParentesco(datos);
        pacientesPages.setDrTelefono(datos);
    }

    @Step
    public void checkPaciente(ExamplesTable datos){
        pacientesPages.ingresarTipoId(datos);
        pacientesPages.ingresarIdentificacion(datos);
        pacientesPages.ingresarPrimerNombre(datos);
        pacientesPages.ingresarPrimerApellido(datos);
        pacientesPages.ingresarGenero(datos);
        pacientesPages.ingresarEstadoCivil(datos);
        pacientesPages.setMedicoTratante(datos);
        pacientesPages.setPrograma(datos);
        pacientesPages.setDrNombres(datos);
        pacientesPages.setDrParentesco(datos);
        pacientesPages.setDrTelefono(datos);
    }
}
