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
