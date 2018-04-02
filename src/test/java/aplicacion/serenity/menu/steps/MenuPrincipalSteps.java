package aplicacion.serenity.menu.steps;

import aplicacion.serenity.menu.pages.MenuPrincipalPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuPrincipalSteps extends ScenarioSteps {

    MenuPrincipalPages menuPrincipalPages =new MenuPrincipalPages(getDriver());

    public MenuPrincipalSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarMenuPrincipal() {
       menuPrincipalPages.clicMenuPrincipal();
    }
}
