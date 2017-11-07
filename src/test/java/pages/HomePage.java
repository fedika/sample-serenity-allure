package pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.phptravels.net")
public class HomePage extends PageObject {
    @FindBy(css = ".navbar-toggle.go-left")
    private WebElementFacade btnBurger;

    @FindBy(css = "#li_myaccount")
    private WebElementFacade menuMyAccount;

    @FindBy(css = "#sidebar_left #li_myaccount .dropdown-menu .go-text-right[href*='login']")
    private WebElementFacade menuLogin;

    public void verifyBtnBurger(){
        btnBurger.shouldBeVisible();
        btnBurger.shouldBeEnabled();
    }

    public void clickBtnBurger(){
        btnBurger.click();
    }

    public void verifyMenuMyAccount(){
        menuMyAccount.shouldBeVisible();
        menuMyAccount.shouldBeEnabled();
    }

    public void clickMenuMyAccount(){
        menuMyAccount.click();
    }

    public void verifyMenuLogin(){
        menuLogin.shouldBeVisible();
        menuLogin.shouldBeEnabled();
    }

    public void clickMenuLogin(){
        menuLogin.click();
    }
}
