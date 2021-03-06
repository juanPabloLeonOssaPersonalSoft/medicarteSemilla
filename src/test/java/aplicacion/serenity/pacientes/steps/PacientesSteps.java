package aplicacion.serenity.pacientes.steps;

import net.thucydides.core.steps.ScenarioSteps;
import aplicacion.serenity.pacientes.pages.PacientesPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
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
        pacientesPages.ingresarFechaNacimiento();
        pacientesPages.setEstadoCivil(datos);
        pacientesPages.ingresarRH(datos);
        pacientesPages.ingresarCodigoOcupacion(datos);
        pacientesPages.ingresarEscolaridad(datos);
        pacientesPages.ingresarRegimen(datos);
        pacientesPages.setTipoAfiliacion(datos);
        pacientesPages.setEmpresa(datos);
        pacientesPages.setIps(datos);
        pacientesPages.setGrupoPoblacional(datos);
        pacientesPages.setEtnia(datos);
        pacientesPages.setTxtTelefono(datos);
        pacientesPages.ingresarReligion(datos);
        pacientesPages.ingresarMuncipioResidencia(datos);
        pacientesPages.ingresarDireccionDomicilio(datos);
        pacientesPages.ingresarSede(datos);
        pacientesPages.ingresarZona(datos);
        pacientesPages.setMedicoTratante(datos);
        pacientesPages.setPrograma(datos);
    }

    @Step
    public void addDatosResponsable(ExamplesTable data){
        pacientesPages.setDrNombres(data);
        pacientesPages.setDrParentesco(data);
        pacientesPages.setDrTelefono(data);
    }

    @Step
    public void EditPaciente(ExamplesTable datos){
        pacientesPages.ingresarPrimerNombre(datos);
        pacientesPages.ingresarPrimerApellido(datos);
        pacientesPages.ingresarGenero(datos);
        pacientesPages.setEditarFechaNacimiento(datos);
        pacientesPages.setClicCerrarVentana();
        pacientesPages.setEstadoCivil(datos);
        pacientesPages.ingresarRH(datos);
        pacientesPages.ingresarCodigoOcupacion(datos);
        pacientesPages.ingresarEscolaridad(datos);
        pacientesPages.ingresarRegimen(datos);
        pacientesPages.setTipoAfiliacion(datos);
        pacientesPages.setEmpresa(datos);
        pacientesPages.setIps(datos);
        pacientesPages.setGrupoPoblacional(datos);
        pacientesPages.setEtnia(datos);
        pacientesPages.setTxtTelefono(datos);
        pacientesPages.ingresarReligion(datos);
        pacientesPages.ingresarMuncipioResidencia(datos);
        pacientesPages.ingresarDireccionDomicilio(datos);
        pacientesPages.ingresarSede(datos);
        pacientesPages.ingresarZona(datos);
        pacientesPages.setMedicoTratante(datos);
        pacientesPages.setPrograma(datos);


    }

    @Step
    public void EditDatosResponsable(ExamplesTable data){
        pacientesPages.setDrNombres(data);
        pacientesPages.setDrParentesco(data);
        pacientesPages.setDrTelefono(data);
    }

    @Step
    public void savePaciente(){
        pacientesPages.guardarPaciente();
    }

    @Step
    public void editPaciente(){
        pacientesPages.editarPaciente();
    }

    @Step
    public void checkSavePaciente(){
        pacientesPages.setCheckSaveUser();
    }

    @Step
    public void ingresarIdentificacion(ExamplesTable paciente) {
        pacientesPages.ingresarIdentificacion(paciente);
    }
}
