package steps;

import net.thucydides.core.annotations.Step;
import pages.AccountPage;

public class AccountStep {
    AccountPage accountPage;

    @Step
    public void verifyLoggedIn(String arg0) {
        accountPage.verifyLoggedIn(arg0);
    }
}
