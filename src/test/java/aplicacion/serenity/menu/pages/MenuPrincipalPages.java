package aplicacion.serenity.menu.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuPrincipalPages extends PageObject {

    @FindBy(xpath = "//*[@id=\'simHeader\']/ul[1]/li[1]/a")

    WebElementFacade btnMenuPrincipal;

    public WebDriver driver;

    public MenuPrincipalPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void clicMenuPrincipal(){
        esperar(2);
        btnMenuPrincipal.click();
    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
