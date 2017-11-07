package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.HomeStep;

public class HomeStepDefinition {
    @Steps
    HomeStep homeStep;

    @Given("I open the website")
    public void iOpenTheWebsite(){
        homeStep.openTheWebsite();
    }

    @When("^I click burger menu$")
    public void iClickBurgerMenu() throws Throwable {
        homeStep.clickBurgerMenu();
    }

    @When("^I click My Account menu$")
    public void iClickMyAccountMenu() throws Throwable {
        homeStep.clickMenuMyAccount();
    }

    @When("^I click Login menu$")
    public void iClickLoginMenu() throws Throwable {
        homeStep.clickLoginMenu();
    }

}
