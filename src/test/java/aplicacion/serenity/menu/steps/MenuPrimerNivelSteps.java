package aplicacion.serenity.menu.steps;

import aplicacion.serenity.menu.pages.MenuPrimerNivelPages;
import aplicacion.serenity.menu.pages.MenuPrincipalPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

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
