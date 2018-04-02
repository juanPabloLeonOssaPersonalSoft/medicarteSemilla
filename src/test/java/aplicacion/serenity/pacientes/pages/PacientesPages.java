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

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[2]/div[2]/input")
    WebElementFacade txtIdentificacion;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[3]/div[2]/input")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[5]/div[2]/input")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[7]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmbGenero;

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[2]/div/div[2]/form/div[8]/div[2]/ngl-virtual-select/a[1]/span")
    WebElementFacade cmbEstadoCivil;


}
