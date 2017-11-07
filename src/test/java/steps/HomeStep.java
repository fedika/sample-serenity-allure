package steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;

public class HomeStep {
    HomePage homePage;

    @Step
    public void openTheWebsite(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=300,700");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--user-agent=Mozilla/5.0 (Linux; Android 6.0.1; SM-G920V Build/MMB29K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.98 Mobile Safari/537.36");
        ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
        homePage.setDriver(chromeDriver);
        homePage.getDriver().manage().deleteAllCookies();
        homePage.open();
    }

    @Step
    public void clickBurgerMenu() {
        homePage.verifyBtnBurger();
        homePage.clickBtnBurger();
    }

    @Step
    public void clickMenuMyAccount() {
        homePage.verifyMenuMyAccount();
        homePage.clickMenuMyAccount();
    }

    @Step
    public void clickLoginMenu() {
        homePage.verifyMenuLogin();
        homePage.clickMenuLogin();
    }
}
