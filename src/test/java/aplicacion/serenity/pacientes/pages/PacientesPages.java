package aplicacion.serenity.pacientes.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import javax.swing.*;
import org.openqa.selenium.Keys;


public class PacientesPages extends PageObject {

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[1]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmbTipoId;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[1]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtTipoId;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[2]/div[2]/input")
    WebElementFacade txtIdentificacion;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[3]/div[2]/input")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[5]/div[2]/input")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[7]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmbGenero;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[7]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtGenero;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[8]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmbEstadoCivil;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[8]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEstadoCivil;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[9]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmdRH;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[9]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRH;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[10]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmdCodigoOcupacion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[10]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtCodigoOcupacion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[11]/div[2]/p-calendar/span/div/div/div/select[1]")
    WebElementFacade txtFechaNacimiento;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[12]/div[2]/input")
    WebElementFacade txtEdad;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[13]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmdEscolaridad;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[13]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEscolaridad;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[14]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmdRegimen;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[14]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRegimen;



    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[30]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade modeloAtencion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[31]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade medicoTratante;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[32]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade programa;

    @FindBy(xpath = "//*[@id=\'simContainer\']//div[@name='patientResponsible.ResponsibleName']")
    WebElementFacade drNombres;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[3]/div/div/div[2]/form/div[2]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade drParentesco;

    @FindBy(xpath = "//*[@id=\'simContainer\']//div[@name='email']")
    WebElementFacade drTelefono;



    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[15]/div[2]/ngl-virtual-select/a[1]")
    WebElementFacade TipoAfiliacion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[15]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtTipoAliciacion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[16]/div[2]/ngl-virtual-select/a[1]")
    WebElementFacade Empresa;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[16]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEmpresa;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[17]/div[2]/ngl-virtual-select/a[1]")
    WebElementFacade Ips;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[17]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtIps;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[18]/div[2]/ngl-virtual-select/a[1]")
    WebElementFacade GrupoPoblacional;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[18]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtGrupoPoblacional;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[19]/div[2]/ngl-virtual-select/a[1]")
    WebElementFacade Etnia;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[19]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEtnia;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[20]/div[2]/input")
    WebElementFacade txtTelefono;


    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[25]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbReligion;

    @FindBy(xpath = " //*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[25]/div[2]/ngl-virtual-select/ngl-virtual-select-menu/div/ngl-virtual-scroll/div[2]/div[5]")
    WebElementFacade txtReligion;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[26]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbMuncipioResidencia;

    @FindBy(xpath = " //*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[26]/div[2]/ngl-virtual-select/ngl-virtual-select-menu/div/ngl-virtual-scroll/div[2]/div[2]")
    WebElementFacade txtMunicipioRes;

    @FindBy(xpath = " //*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[27]/div[2]/input")
    WebElementFacade txtDireccionDomicilio;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[28]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbSede;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[28]/div[2]/ngl-virtual-select/ngl-virtual-select-menu/div/ngl-virtual-scroll/div[2]/div[2]")
    WebElementFacade txtSede;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[29]/div[2]/select")
    WebElementFacade cmbZona;

    @FindBy(xpath = " //*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[29]/div[2]/select")
    WebElementFacade txtZona;

    public WebDriver driver;


    public  void  ingresarRH(ExamplesTable datos){
    cmdRH.click();
    txtRH.type(datos.getRow(0).get("rh"));
    txtRH.sendKeys(Keys.ENTER);
    waitEvent(2);
    }

    public  void  ingresarCodigoOcupacion(ExamplesTable datos){
        cmdCodigoOcupacion.click();
        txtCodigoOcupacion.type(datos.getRow(0).get("cod_ocupacion"));
        txtCodigoOcupacion.sendKeys(Keys.ENTER);
        waitEvent(2);
    }

    public  void  ingresarFechaNacimiento(ExamplesTable datos){
        txtFechaNacimiento.type(datos.getRow(0).get("fecha_nacimiento"));
        waitEvent(2);
    }

    public  void  ingresarEdad(ExamplesTable datos){
        Assert.assertEquals(datos.getRow(0).get("edad"), txtEdad.getValue());
    }

    public  void  ingresarEscolaridad(ExamplesTable datos){
        cmdEscolaridad.click();
        txtEscolaridad.type(datos.getRow(0).get("escolaridad"));
        txtEscolaridad.sendKeys(Keys.ENTER);
        waitEvent(2);
    }

    public  void  ingresarRegimen(ExamplesTable datos){
        cmdRegimen.click();
        txtRegimen.type(datos.getRow(0).get("regimen"));
        txtRegimen.sendKeys(Keys.ENTER);
        waitEvent(2);
    }




    private void waitEvent(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public PacientesPages(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public  void ingresarTipoId(ExamplesTable datos){
        cmbTipoId.click();
        txtTipoId.type(datos.getRow(0).get("tipo_id"));
        txtTipoId.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

    public  void ingresarIdentificacion(ExamplesTable datos){
        waitEvent(2);
        txtIdentificacion.type(datos.getRow(0).get("id"));
    }

    public  void ingresarPrimerNombre(ExamplesTable datos){
        waitEvent(2);
        txtPrimerNombre.type(datos.getRow(0).get("primer_nombre"));
    }

    public  void ingresarPrimerApellido(ExamplesTable datos){
        waitEvent(2);
        txtPrimerApellido.type(datos.getRow(0).get("primer_apellido"));
    }

    public  void ingresarGenero(ExamplesTable datos){
        cmbGenero.click();
        txtGenero.type(datos.getRow(0).get("genero"));
        txtGenero.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

    public  void ingresarEstadoCivil(ExamplesTable datos){
        cmbEstadoCivil.click();
        txtEstadoCivil.type(datos.getRow(0).get("estado_civil"));
        txtEstadoCivil.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

    public void setDrParentesco(ExamplesTable data) {
        drParentesco.click();
        drParentesco.type(data.getRow(0).get("dr_parentesco"));
        drParentesco.sendKeys(Keys.ENTER);
        waitEvent(1);
    }


    public void setDrTelefono(ExamplesTable data) {
        drTelefono.click();
        drTelefono.type(data.getRow(0).get("dr_telefono"));
        drTelefono.sendKeys(Keys.ENTER);
        waitEvent(1);
    }


    public void setTipoAfiliacion(ExamplesTable datos){
        waitEvent(2);
        TipoAfiliacion.click();
        txtTipoAliciacion.typeAndEnter(datos.getRow(0).get("tipo_afiliacion"));

    }

    public void setEmpresa(ExamplesTable datos){
        waitEvent(2);
        Empresa.click();
        txtEmpresa.typeAndEnter(datos.getRow(0).get("empresa"));

    }

    public  void setIps(ExamplesTable datos){
        waitEvent(2);
        Ips.click();
        txtIps.typeAndEnter(datos.getRow(0).get("ips"));

    }

    public  void setGrupoPoblacional(ExamplesTable datos){
        waitEvent(2);
        GrupoPoblacional.click();
        txtGrupoPoblacional.typeAndEnter(datos.getRow(0).get("grupo_poblacional"));

    }

    public  void setEtnia(ExamplesTable datos){
        waitEvent(2);
        Etnia.click();
        txtEtnia.typeAndEnter(datos.getRow(0).get("etnia"));
    }

    public  void setTxtTelefono(ExamplesTable datos){
        waitEvent(2);
        txtTelefono.typeAndEnter(datos.getRow(0).get("telefono"));
    }

    public  void ingresarReligion(ExamplesTable datos){
        cmbReligion.click();
        txtReligion.type(datos.getRow(0).get("religion"));
        txtReligion.sendKeys(Keys.ENTER);
        esperar(1);
    }

    public  void ingresarMuncipioResidencia(ExamplesTable datos){
        cmbMuncipioResidencia.click();
        txtMunicipioRes.type(datos.getRow(0).get("municipio_residencia"));
        txtMunicipioRes.sendKeys(Keys.ENTER);
        esperar(1);
    }

    public  void ingresarDireccionDomicilio(ExamplesTable datos){
        esperar(2);
        txtDireccionDomicilio.typeAndTab(datos.getRow(0).get("direccion_domicilio"));
    }

    public  void ingresarSede(ExamplesTable datos){
        cmbSede.click();
        txtSede.type(datos.getRow(0).get("sede"));
        txtSede.sendKeys(Keys.ENTER);
        esperar(1);
    }


    public  void ingresarZona(ExamplesTable datos){
        cmbZona.click();
        txtZona.type(datos.getRow(0).get("zona"));
        txtZona.sendKeys(Keys.ENTER);
        esperar(1);
    }


    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setMedicoTratante(ExamplesTable data) {
        medicoTratante.click();
        medicoTratante.type(data.getRow(0).get("medico_tratante"));
        medicoTratante.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

    public void setPrograma(ExamplesTable data) {
        programa.click();
        programa.type(data.getRow(0).get("programa"));
        programa.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

    public void setDrNombres(ExamplesTable data) {
        drNombres.click();
        drNombres.type(data.getRow(0).get("dr_nombres"));
        drNombres.sendKeys(Keys.ENTER);
        waitEvent(1);
    }
}
