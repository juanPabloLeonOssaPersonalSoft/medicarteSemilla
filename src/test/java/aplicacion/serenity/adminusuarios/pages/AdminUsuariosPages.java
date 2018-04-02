package aplicacion.serenity.adminusuarios.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AdminUsuariosPages extends PageObject {


    @FindBy(xpath = "//*[@id=\"simContainer\"]/ng-component/div/div/div/div[2]/div[2]/button[2]")
    WebElementFacade btnNuevoUsuario;

    public WebDriver driver;

    public AdminUsuariosPages(WebDriver driver){
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
    public void clicNuevoUsuario() {
        waitEvent(2);
        btnNuevoUsuario.click();
    }

}
