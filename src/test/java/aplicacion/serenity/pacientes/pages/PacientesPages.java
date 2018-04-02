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

    public WebDriver driver;

    public  void  ingresarRH(ExamplesTable datos){
    cmdRH.click();
    txtRH.type(datos.getRow(0).get("rh"));
    txtRH.sendKeys(Keys.ENTER);
    }

    public  void  ingresarCodigoOcupacion(ExamplesTable datos){
        cmdCodigoOcupacion.click();
        txtCodigoOcupacion.type(datos.getRow(0).get("cod_ocupacion"));
        txtCodigoOcupacion.sendKeys(Keys.ENTER);
    }

    public  void  ingresarFechaNacimiento(ExamplesTable datos){
        txtFechaNacimiento.type(datos.getRow(0).get("fecha_nacimiento"));
    }

    public  void  ingresarEdad(ExamplesTable datos){
        Assert.assertEquals(datos.getRow(0).get("edad"), txtEdad.getValue());
    }

    public  void  ingresarEscolaridad(ExamplesTable datos){
        cmdEscolaridad.click();
        txtEscolaridad.type(datos.getRow(0).get("escolaridad"));
        txtEscolaridad.sendKeys(Keys.ENTER);
    }

    public  void  ingresarRegimen(ExamplesTable datos){
        cmdRegimen.click();
        txtRegimen.type(datos.getRow(0).get("regimen"));
        txtRegimen.sendKeys(Keys.ENTER);
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


    public void setModeloAtencion(ExamplesTable data) {
        modeloAtencion.click();
        modeloAtencion.type(data.getRow(0).get("rol"));
        modeloAtencion.sendKeys(Keys.ENTER);
        waitEvent(1);
    }


    public void setTipoAfiliacion(ExamplesTable datos){
        esperar(2);
        TipoAfiliacion.click();
        txtTipoAliciacion.typeAndEnter(datos.getRow(0).get("tipo_afiliacion"));

    }

    public void setEmpresa(ExamplesTable datos){
        esperar(2);
        Empresa.click();
        txtEmpresa.typeAndEnter(datos.getRow(0).get("empresa"));

    }

    public  void setIps(ExamplesTable datos){
        esperar(2);
        Ips.click();
        txtIps.typeAndEnter(datos.getRow(0).get("ips"));

    }

    public  void setGrupoPoblacional(ExamplesTable datos){
        esperar(2);
        GrupoPoblacional.click();
        txtGrupoPoblacional.typeAndEnter(datos.getRow(0).get("grupo_poblacional"));

    }

    public  void setEtnia(ExamplesTable datos){
        esperar(2);
        Etnia.click();
        txtEtnia.typeAndEnter(datos.getRow(0).get("etnia"));

    }

    public  void setTxtTelefono(ExamplesTable datos){
        esperar(2);
        txtTelefono.typeAndEnter(datos.getRow(0).get("telefono"));

    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
