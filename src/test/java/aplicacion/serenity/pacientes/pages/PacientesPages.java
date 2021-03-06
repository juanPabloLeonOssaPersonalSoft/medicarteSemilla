package aplicacion.serenity.pacientes.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.hamcrest.MatcherAssert;

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

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[7]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbGenero;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[7]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtGenero;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[10]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbEstadoCivil;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[10]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEstadoCivil;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[2]/button")
    WebElementFacade clicCerrarTooltip;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[11]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmdRH;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[11]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRH;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[12]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmdCodigoOcupacion;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[12]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtCodigoOcupacion;

    @FindBy(xpath = "//*[@id=\'inputFechaNacimiento\']")
    WebElementFacade clickInput;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[8]/div[2]/p-calendar/span/div/table/tbody/tr[2]/td[1]/a")
    WebElementFacade clickDia;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[13]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmdEscolaridad;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[13]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtEscolaridad;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[14]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmdRegimen;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[14]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRegimen;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[31]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade clickMedicoTratante;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[31]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade textMedicoTratante;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[32]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade clickPrograma;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[32]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade textPrograma;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[3]/div/div/div[2]/form/div[1]/div[2]/input")
    WebElementFacade drNombres;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[3]/div/div/div[2]/form/div[2]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade clickDrParentesco;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[3]/div/div/div[2]/form/div[2]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade textDrParentesco;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[3]/div/div/div[2]/form/div[3]/div[2]/input")
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

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[25]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtReligion;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[26]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbMuncipioResidencia;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[26]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtMunicipioRes;

    @FindBy(xpath = " //*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[27]/div[2]/input")
    WebElementFacade txtDireccionDomicilio;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[28]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbSede;

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[28]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtSede;

    @FindBy(xpath = "//*[@id='simContainer']/admin-patients/div[2]/div/div[2]/form/div[29]/div[2]/select")
    WebElementFacade SelZona;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[4]/button[1]")
    WebElementFacade btnGuardarPaciente;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[5]/button[1]")
    WebElementFacade btnEditarPaciente;

    @FindBy(xpath = "//*[@id=\'toast-container\']/div[1]/div[1]/div[2]/div")
    WebElementFacade tooltipConfirmSave;

    @FindBy(xpath = "//*[@id='modal-medico-tratante']/div/div/div[1]/button")
    WebElementFacade clicCerrarVentana;

    @FindBy(xpath = "//*[@id=\'inputFechaNacimiento\']")
    WebElementFacade txtFechaNacimiento;

    public WebDriver driver;

    public PacientesPages(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    private void waitEvent(int timeInMilliseconds) {
        try {
            Thread.sleep(timeInMilliseconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   public void ingresarRH(ExamplesTable datos) {
       if(datos.getRow(0).get("rh")!=null) {
           cmdRH.click();
           txtRH.type(datos.getRow(0).get("rh"));
           txtRH.sendKeys(Keys.ENTER);
       }
    }

    public void ingresarCodigoOcupacion(ExamplesTable datos) {
        if(datos.getRow(0).get("cod_ocupacion")!=null) {
            cmdCodigoOcupacion.click();
            txtCodigoOcupacion.type(datos.getRow(0).get("cod_ocupacion"));
            txtCodigoOcupacion.sendKeys(Keys.ENTER);
        }
    }

    public void ingresarFechaNacimiento() {
        waitEvent(1);
        clickInput.click();
        waitEvent(1);
        clickDia.click();
        waitEvent(1);
        setClicCerrarTooltip();
        waitEvent(1);
        setClicCerrarTooltip();
        waitEvent(1);
        setClicCerrarVentana();
    }

   public void ingresarEscolaridad(ExamplesTable datos) {
       if(datos.getRow(0).get("escolaridad")!=null) {
           cmdEscolaridad.click();
           txtEscolaridad.type(datos.getRow(0).get("escolaridad"));
           txtEscolaridad.sendKeys(Keys.ENTER);
       }
    }

    public void ingresarRegimen(ExamplesTable datos) {
        if (datos.getRow(0).get("regimen") != null) {
            cmdRegimen.click();
            txtRegimen.type(datos.getRow(0).get("regimen"));
            txtRegimen.sendKeys(Keys.ENTER);
        }
    }

    public void setClicCerrarTooltip(){
        waitEvent(2);
        try {
            if (clicCerrarTooltip.isDisplayed()) {
                clicCerrarTooltip.click();
                waitEvent(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setClicCerrarVentana(){
        waitEvent(2);
            try {
                if (clicCerrarVentana.isDisplayed()) {
                    clicCerrarVentana.click();
                    waitEvent(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
    }

    public void ingresarTipoId(ExamplesTable datos) {
        if(datos.getRow(0).get("tipo_id")!=null) {
            cmbTipoId.click();
            txtTipoId.type(datos.getRow(0).get("tipo_id"));
            txtTipoId.sendKeys(Keys.ENTER);
        }
    }

    public void ingresarIdentificacion(ExamplesTable datos) {
        txtIdentificacion.typeAndTab(datos.getRow(0).get("id"));
    }

    public void ingresarPrimerNombre(ExamplesTable datos) {
        if(datos.getRow(0).get("primer_nombre")!=null) {
            txtPrimerNombre.type(datos.getRow(0).get("primer_nombre"));
        }
    }

    public void ingresarPrimerApellido(ExamplesTable datos) {
        if(datos.getRow(0).get("primer_apellido")!=null) {
            txtPrimerApellido.type(datos.getRow(0).get("primer_apellido"));
            waitEvent(4);
        }
    }

    public void ingresarGenero(ExamplesTable datos) {
        if(datos.getRow(0).get("genero")!=null) {
            cmbGenero.click();
            waitEvent(1);
            txtGenero.type(datos.getRow(0).get("genero"));
            txtGenero.sendKeys(Keys.ENTER);
        }
    }


   public void setEstadoCivil(ExamplesTable datos) {
       if(datos.getRow(0).get("estado_civil")!=null) {
           cmbEstadoCivil.click();
           txtEstadoCivil.type(datos.getRow(0).get("estado_civil"));
           txtEstadoCivil.sendKeys(Keys.ENTER);
       }
    }

    public void setTipoAfiliacion(ExamplesTable datos) {
        if(datos.getRow(0).get("tipo_afiliacion")!=null){
            TipoAfiliacion.click();
            txtTipoAliciacion.typeAndEnter(datos.getRow(0).get("tipo_afiliacion"));
        }

    }

    public void setEmpresa(ExamplesTable datos) {
        if(datos.getRow(0).get("empresa")!=null){
            Empresa.click();
            txtEmpresa.typeAndEnter(datos.getRow(0).get("empresa"));
        }
    }

    public void setIps(ExamplesTable datos) {
        if(datos.getRow(0).get("ips")!=null){
            Ips.click();
            txtIps.typeAndEnter(datos.getRow(0).get("ips"));
            setClicCerrarVentana();
        }
    }

    public void setGrupoPoblacional(ExamplesTable datos) {
        if(datos.getRow(0).get("grupo_poblacional")!=null){
            GrupoPoblacional.click();
            txtGrupoPoblacional.typeAndEnter(datos.getRow(0).get("grupo_poblacional"));
        }
    }

    public void setEtnia(ExamplesTable datos) {
        if(datos.getRow(0).get("etnia")!=null){
            Etnia.click();
            txtEtnia.typeAndEnter(datos.getRow(0).get("etnia"));
        }
    }

    public void setTxtTelefono(ExamplesTable datos) {
        if(datos.getRow(0).get("telefono")!=null){
            txtTelefono.typeAndEnter(datos.getRow(0).get("telefono"));
            setClicCerrarVentana();
        }
    }

    public void ingresarReligion(ExamplesTable datos) {
        if(datos.getRow(0).get("religion")!=null){
            cmbReligion.click();
            txtReligion.typeAndEnter(datos.getRow(0).get("religion"));
        }
    }

    public void ingresarMuncipioResidencia(ExamplesTable datos) {
        if(datos.getRow(0).get("municipio_residencia")!=null){
            cmbMuncipioResidencia.click();
            txtMunicipioRes.typeAndEnter(datos.getRow(0).get("municipio_residencia"));
        }
    }

    public void ingresarDireccionDomicilio(ExamplesTable datos) {
        if(datos.getRow(0).get("direccion_domicilio")!=null){
            txtDireccionDomicilio.typeAndEnter(datos.getRow(0).get("direccion_domicilio"));
            waitEvent(1);
            setClicCerrarVentana();
        }
    }

    public void ingresarSede(ExamplesTable datos) {
        if(datos.getRow(0).get("sede")!=null){
            cmbSede.click();
            txtSede.typeAndEnter(datos.getRow(0).get("sede"));
        }
    }

    public void ingresarZona(ExamplesTable datos) {
        if(datos.getRow(0).get("zona")!=null){
            String Zona=datos.getRow(0).get("zona");
            Select dropdown = new Select(SelZona);
            dropdown.selectByVisibleText(Zona);
        }
    }

    public void setMedicoTratante(ExamplesTable data) {
        if(data.getRow(0).get("medico_tratante")!=null) {
            clickMedicoTratante.click();
            textMedicoTratante.type(data.getRow(0).get("medico_tratante"));
            textMedicoTratante.sendKeys(Keys.ENTER);
        }
    }

    public void setPrograma(ExamplesTable data) {
        if(data.getRow(0).get("programa")!=null) {
            clickPrograma.click();
            textPrograma.type(data.getRow(0).get("programa"));
            textPrograma.sendKeys(Keys.ENTER);
            setClicCerrarVentana();
        }
    }

    public void setDrNombres(ExamplesTable data) {
        if(data.getRow(0).get("dr_nombres")!=null) {
            drNombres.type(data.getRow(0).get("dr_nombres"));
        }
    }

    public void setDrParentesco (ExamplesTable data){
        if(data.getRow(0).get("dr_parentesco")!=null) {
            clickDrParentesco.click();
            textDrParentesco.type(data.getRow(0).get("dr_parentesco"));
            textDrParentesco.sendKeys(Keys.ENTER);
        }
    }

    public void setDrTelefono (ExamplesTable data){
        if(data.getRow(0).get("dr_telefono")!=null) {
            drTelefono.type(data.getRow(0).get("dr_telefono"));
        }
    }


    public  void  setEditarFechaNacimiento(ExamplesTable datos) {
        txtFechaNacimiento.typeAndEnter(datos.getRow(0).get("fecha_nacimiento"));
        waitEvent(2);
        setClicCerrarTooltip();
        setClicCerrarVentana();
    }

    public void guardarPaciente() {
        waitEvent(1);
        btnGuardarPaciente.click();
        waitEvent(2);
    }

    public void editarPaciente() {
        waitEvent(1);
        btnEditarPaciente.click();
        waitEvent(2);

    }

    public void setCheckSaveUser () {
        waitEvent(1);
        MatcherAssert.assertThat("no se almaceno la información",!"Se almacenó la información correctamente.".equals(tooltipConfirmSave.getTextValue()));
    }

}


