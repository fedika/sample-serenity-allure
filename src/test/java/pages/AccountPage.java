package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends PageObject {
    @FindBy(css = ".RTL")
    private WebElementFacade greetings;

    public void verifyLoggedIn(String arg0){
        greetings.shouldContainText(arg0);
    }
}
