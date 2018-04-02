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

    @FindBy(xpath = "//*[@id=\'simContainer\']/admin-patients/div[2]/div/div[2]/form/div[30]/div[2]/ngl-virtual-select/a[1]/input")
    WebElementFacade modeloAtencion;


    public WebDriver driver;

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

    public void setModeloAtencion(ExamplesTable data) {
        modeloAtencion.click();
        modeloAtencion.type(data.getRow(0).get("rol"));
        modeloAtencion.sendKeys(Keys.ENTER);
        waitEvent(1);
    }

}
