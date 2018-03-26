package aplicacion.serenity.verificacionUsuario.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class verificacionUsuarioPages extends PageObject {

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



    public WebDriver driver;

    public verificacionUsuarioPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void clicNuevoUsuario() {
        esperar(2);
        btnNuevoUsuario.click();
    }

    public  void checkUsuario(ExamplesTable datos){
        esperar(2);
        txtUsuario.type(datos.getRow(0).get("usuario"));
    }

    public  void checkNombres(ExamplesTable datos){
        esperar(2);
        txtNombres.type(datos.getRow(0).get("nombres"));
    }

    public  void checkPrimerApellido(ExamplesTable datos){
        esperar(2);
        txtPrimerApellido.type(datos.getRow(0).get("primerApellido"));
    }

    public  void checkRol(ExamplesTable datos){
        esperar(2);
        cmbRol.click();
        txtRol.typeAndEnter(datos.getRow(0).get("rol"));

    }

    public  void checkFechaInicio(ExamplesTable datos){
        esperar(2);
        txtFechaInicio.type(datos.getRow(0).get("fechaInicio"));
    }


    public  void checkEmail(ExamplesTable datos){
        esperar(2);
        txtEmail.type(datos.getRow(0).get("email"));
    }

    public  void checkSede(ExamplesTable datos){
        esperar(2);
        btnSeleccionarSede.click();
        btnTodasSedes.click();
        String sedePredeterminada= datos.getRow(0).get("sede");
        String xpathOriginalSedePredeterminada= "//*[@id='simContainer']//table/tbody/tr[contains(.,'comodin')]/td[3]/label";
        String xpatSedePredeterminada=xpathOriginalSedePredeterminada.replace("comodin",sedePredeterminada);
        $(xpatSedePredeterminada).click();
        btnAceptarSede.click();
    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
