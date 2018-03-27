package aplicacion.serenity.creacionusuario.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;


public class UsuarioPages extends PageObject {

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[5]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade cmbRol;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/form/div[5]/div[2]/ngl-virtual-select/a[2]/input")
    WebElementFacade txtRol;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div/div/div/div[2]/div[2]/button[2]")
    WebElementFacade btnNuevoUsuario;

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

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[1]/div/div[2]/div/button[1]")
    WebElementFacade btnGuardarUsuario;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div[2]/div/div/div[2]/div[1]/table/thead/tr/th[2]/a[1]")
    WebElementFacade btnTodasSedes;

    @FindBy(xpath = "//*[@id=\"toast-container\"]/div/div[1]/div[2]/div")
    WebElementFacade lblTexto;

    public WebDriver driver;

    public UsuarioPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void clicNuevoUsuario() {
        esperar(3);
        btnNuevoUsuario.click();
    }

    public  void ingresarUsuario(ExamplesTable datos){
        esperar(3);
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
        esperar(2);
        cmbRol.click();
        txtRol.typeAndEnter(datos.getRow(0).get("rol"));

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

    public void VerificarErrorPage () {
        Assert.assertEquals("Se almacenó la información correctamente.", lblTexto.getText());
        System.out.println("Usuario correcto");
    }

    public void verificarUsuarioNoProfesional(ExamplesTable datos)
    {   esperar(2);
        Assert.assertEquals(datos.getRow(0).get("nombres"),txtNombres.getValue());
    }

    public void VerificarApellido(ExamplesTable datos) {
        esperar(2);
        String apellidoDefault = datos.getRow(0).get("primerApellido");
        String apellidoIngresado = txtPrimerApellido.getValue();
        Assert.assertEquals(datos.getRow(0).get("primerApellido"),txtPrimerApellido.getValue());
        System.out.println("Apellido default: "+apellidoDefault+" - Apellido ingresado: "+apellidoIngresado+" - El apellido es correcto");
    }

}
