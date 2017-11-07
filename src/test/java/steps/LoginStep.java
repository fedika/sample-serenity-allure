package steps;

import net.thucydides.core.annotations.Step;
import pages.LoginPage;

public class LoginStep {
    LoginPage loginPage;

    @Step
    public void verifyLoginPage() {
        loginPage.verifyPage();
    }

    @Step
    public void inputEmail(String arg0) {
        loginPage.inputEmail(arg0);
    }

    @Step
    public void inputPassword(String arg0) {
        loginPage.inputPassword(arg0);
    }

    @Step
    public void clickSubmitButton() {
        loginPage.clickBtnSubmit();
    }
}
