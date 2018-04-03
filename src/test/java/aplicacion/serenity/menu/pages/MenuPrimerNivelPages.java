package aplicacion.serenity.menu.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuPrimerNivelPages extends PageObject {

    @FindBy(xpath = "//*[@id=\'simSidebar\']/ul/li[1]/a")

    WebElementFacade btnMenuAdministracion;


    public WebDriver driver;

    public MenuPrimerNivelPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }


    public void clicMenuAdministracion(){
        esperar(1);
        btnMenuAdministracion.click();
    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
