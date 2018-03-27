package aplicacion.serenity.menu.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class MenuSegundoNivelPages extends PageObject {

    @FindBy(xpath = "//*[@id='simSidebar']//div[@title='Usuarios']")
    WebElementFacade btnMenuUsuarios;

    public WebDriver driver;

    public MenuSegundoNivelPages(WebDriver driver){
        super(driver);
        this.driver=driver;
    }

    public void clicMenuUsuarios(){
        esperar(4);
        btnMenuUsuarios.click();
    }

    private void esperar(int timeInMilliseconds){
        try {
            Thread.sleep(timeInMilliseconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
