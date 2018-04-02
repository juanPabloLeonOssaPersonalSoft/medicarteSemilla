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
       /* pacientesPages.ingresarTipoId(datos);
        pacientesPages.ingresarIdentificacion(datos);
        pacientesPages.ingresarPrimerNombre(datos);
        pacientesPages.ingresarPrimerApellido(datos);
        pacientesPages.ingresarGenero(datos);
        pacientesPages.ingresarFechaNacimiento(datos);
        pacientesPages.ingresarEdad(datos);
        pacientesPages.ingresarEstadoCivil(datos);
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
        pacientesPages.ingresarZona(datos);*/
        pacientesPages.setMedicoTratante(datos);
        pacientesPages.setPrograma(datos);
    }

    public void addDatosResponsable(ExamplesTable data){
        pacientesPages.setDrNombres(data);
        pacientesPages.setDrParentesco(data);
        pacientesPages.setDrTelefono(data);
    }

    @Step
    public void checkSavePaciente(){
        pacientesPages.setCheckSaveUser();
    }
}
