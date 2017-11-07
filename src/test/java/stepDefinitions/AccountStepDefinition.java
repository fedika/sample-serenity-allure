package stepDefinitions;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;
import steps.AccountStep;

public class AccountStepDefinition {
    @Steps
    AccountStep accountStep;

    @Then("^I can see Account page contains \"([^\"]*)\"$")
    public void iCanSeeAccountPageContains(String arg0){
        accountStep.verifyLoggedIn(arg0);
    }
}
