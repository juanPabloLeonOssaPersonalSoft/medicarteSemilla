package aplicacion.serenity.menu.steps;

import aplicacion.serenity.menu.pages.MenuPrincipalPages;
import aplicacion.serenity.menu.pages.MenuSegundoNivelPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class MenuSegundoNivelSteps extends ScenarioSteps {

    MenuSegundoNivelPages menuSegundoNivelPages =new MenuSegundoNivelPages(getDriver());

    public MenuSegundoNivelSteps(Pages pages){
        super(pages);
    }

    @Step
    public void ingresarMenuSegundoNivel() {
        menuSegundoNivelPages.clicMenuUsuarios();
    }
}
