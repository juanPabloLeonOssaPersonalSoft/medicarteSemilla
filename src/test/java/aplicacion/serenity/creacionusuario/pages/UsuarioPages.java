package aplicacion.serenity.creacionusuario.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.Keys;


public class UsuarioPages extends PageObject {

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[5]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbRol;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[5]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRol;

    @FindBy(xpath = "//*[@id=\'simContainer\']/ng-component/div[1]/div/div[2]/form/div[5]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade selectRol;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[1]/div[2]/input")
    WebElementFacade txtUsuario;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[2]/div[2]/input")
    WebElementFacade txtNombres;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[3]/div[2]/input")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[6]/div[2]/p-calendar/span/input")
    WebElementFacade txtFechaInicio;

    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElementFacade txtContrasena;

    @FindBy(xpath = "//*[@id=\"ConfirmPassword\"]")
    WebElementFacade txtConfirmarContrasena;

    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElementFacade txtEmail;

    @FindBy(xpath = "//*[@id=\"btnSelectLocations\"]")
    WebElementFacade btnSeleccionarSede;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[2]/div/div/div[2]/div[2]/button[1]")
    WebElementFacade btnAceptarSede;

    @FindBy(xpath = "//*[@id=\'simContainer\']/ng-component/div[2]/div/div/div[2]/div[2]/button[2]")
    WebElementFacade btnCancelarSede;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/div/button[1]")
    WebElementFacade btnGuardarUsuario;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[2]/div/div/div[2]/div[1]/table/thead/tr/th[2]/a[1]")
    WebElementFacade btnTodasSedes;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[1]/div[2]/div")
    WebElementFacade lblTexto;

    @FindBy(xpath = "//*[@id=\'simContainer\']/ng-component/div[2]/div/div/div[2]/div[1]/table/tbody/tr[1]/td[1]")
    WebElementFacade sedeEscogida;

    @FindBy(xpath = "//*[@id=\'toast-container\']/div/div[1]/div[2]/div")
    WebElementFacade divConfirmSave;


    public WebDriver driver;

    public UsuarioPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public  void ingresarUsuario(ExamplesTable datos){
        esperar(2);
        txtUsuario.typeAndTab(datos.getRow(0).get("usuario"));
    }

    public  void ingresarNombres(ExamplesTable datos){
        esperar(2);
        txtNombres.type(datos.getRow(0).get("nombres"));
    }

    public  void ingresarPrimerApellido(ExamplesTable datos){
        esperar(2);
        txtPrimerApellido.type(datos.getRow(0).get("primerApellido"));
    }

    public  void ingresarRol(ExamplesTable datos){
        cmbRol.click();
        txtRol.type(datos.getRow(0).get("rol"));
        txtRol.sendKeys(Keys.ENTER);
        esperar(1);
    }

    public  void ingresarFechaInicio(ExamplesTable datos){
        esperar(2);
        txtFechaInicio.type(datos.getRow(0).get("fechaInicio"));
    }

    public  void ingresarContrasena(ExamplesTable datos){
        esperar(2);
        txtContrasena.type(datos.getRow(0).get("contrasena"));
    }

    public  void ingresarConfirmarContrasena(ExamplesTable datos){
        esperar(2);
        txtConfirmarContrasena.type(datos.getRow(0).get("contrasena")); }

    public  void ingresarEmail(ExamplesTable datos){
        esperar(2);
        txtEmail.type(datos.getRow(0).get("email"));
    }

    public  void SeleccionarSede(ExamplesTable datos){
        esperar(2);
        btnSeleccionarSede.click();
        btnTodasSedes.click();
        String sedePredeterminada= datos.getRow(0).get("sede");
        String xpathOriginalSedePredeterminada= "//*[@id='simContainer']//table/tbody/tr[contains(.,'comodin')]/td[3]/label";
        String xpatSedePredeterminada=xpathOriginalSedePredeterminada.replace("comodin",sedePredeterminada);
        $(xpatSedePredeterminada).click();
        btnAceptarSede.click();
    }

    public  void guardarUsuario( ){
        esperar(2);
        btnGuardarUsuario.click();
    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void verificarPaso () {
        Assert.assertEquals("Se almacenó la información correctamente.", lblTexto.getText());
    }

    public void setVerificarNombre(ExamplesTable datos) {
        txtNombres.click();
        esperar(2);
        Assert.assertEquals(datos.getRow(0).get("nombres"),txtNombres.getValue());
    }

    public void setVerificarApellido(ExamplesTable datos) {
        esperar(2);
        String apellidoDefault = datos.getRow(0).get("primerApellido");
        String apellidoIngresado = txtPrimerApellido.getValue();
        Assert.assertEquals(datos.getRow(0).get("primerApellido"),txtPrimerApellido.getValue());
        System.out.println("Apellido default: "+apellidoDefault+" - Apellido ingresado: "+apellidoIngresado+" - El apellido es correcto");
    }

    public void setVerificarFechaInicio(ExamplesTable datos) {
        Assert.assertEquals(datos.getRow(0).get("fechaInicio"),txtFechaInicio.getValue());
        esperar(1);
    }

    public void setVerificarEmail(ExamplesTable datos) {
        Assert.assertEquals(datos.getRow(0).get("email"),txtEmail.getValue());
        esperar(1);

    }

    public void setVerificarRol(ExamplesTable datos) {
        Assert.assertEquals(datos.getRow(0).get("rol"), selectRol.getValue());
        esperar(1);
    }

    public  void  setVerificarSede(ExamplesTable datos) {
        btnSeleccionarSede.click();
        Assert.assertEquals(datos.getRow(0).get("sede"), sedeEscogida.getTextValue());
        esperar(1);
        btnCancelarSede.click();
        esperar(1);
    }


    public  void  setEditarRol(ExamplesTable datos) {
        String rolData = datos.getRow(0).get("rol");
        if(rolData!=null){
           ingresarRol(datos);
        }
        esperar(1);
    }


    public  void  setEditarEmail(ExamplesTable datos) {
       esperar(2);
        if(datos.getRow(0).get("email")!=null){
            ingresarEmail(datos);
        }
    }
    public void setEditarFechaInicio(ExamplesTable datos) {
        esperar(2);
        if(datos.getRow(0).get("fechaInicio")!=null){
            ingresarFechaInicio(datos);
        }
    }


    public  void  setEditarPrimerApellido(ExamplesTable datos) {
        esperar(2);
        if (datos.getRow(0).get("primerApellido") != null) {
            ingresarPrimerApellido(datos);
        }
    }

    public void setEditarSede(ExamplesTable datos) {
        esperar(2);
        if(datos.getRow(0).get("sede")!=null){
            SeleccionarSede(datos);

        }
    }
    public  void  setEditarNombre(ExamplesTable datos) {
        String nombreData = datos.getRow(0).get("nombres");
        if(nombreData!=null){
            ingresarNombres(datos);
        }
        esperar(1);
    }

    public void setCheckSaveUser(){
        String dataMessage = "Se almacenó la información correctamente.";
        if(divConfirmSave != null){
            Assert.assertEquals(dataMessage, divConfirmSave.getTextValue());
        }
    }

}
