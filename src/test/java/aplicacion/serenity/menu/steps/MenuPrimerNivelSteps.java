package aplicacion.serenity.menu.steps;

import aplicacion.serenity.menu.pages.MenuPrimerNivelPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuPrimerNivelSteps extends ScenarioSteps {

    MenuPrimerNivelPages menuPrimerNivelPages =new MenuPrimerNivelPages(getDriver());

    public MenuPrimerNivelSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarMenuPrimerNivel() {
       menuPrimerNivelPages.clicMenuAdministracion();
    }
}
