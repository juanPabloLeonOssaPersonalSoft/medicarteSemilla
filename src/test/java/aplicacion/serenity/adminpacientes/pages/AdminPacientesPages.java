package aplicacion.serenity.adminpacientes.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdminPacientesPages extends PageObject {

    @FindBy(xpath = "//*[@id=\"simContainer\"]/admin-patients/div[1]/div/div[2]/form/search-patients/div[1]/div/div/div/form/div[2]/button[2]")
    WebElementFacade btnNuevoPaciente;

    public WebDriver driver;

    public AdminPacientesPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    private void waitEvent(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void clicNuevoPaciente() {
        waitEvent(2);
        btnNuevoPaciente.click();
    }

}
