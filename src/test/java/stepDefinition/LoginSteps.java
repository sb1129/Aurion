package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.Before;

import pageclasses.DashboardPage;
import pageclasses.LandingPage;

public class LoginSteps extends DriverFactory {

    @Before
    public void beforeScenario() {
        driver = new DriverFactory().getDriver();
    }

    @After
    public void afterScenario() {
        new DriverFactory().destroyDriver();
    }

    @Given("^I am on myAurion login page$")
    public void setup() throws Throwable {
        new LandingPage(driver).login_page();
    }

    @When("^I enter username as \"(.*)\"$")
    public void enterUsername(String username) throws Throwable {
        new LandingPage(driver).I_enter_username_as(username);
    }

    @When ("^I enter password as \"(.*)\"$")
    public void enterPassword(String password) throws Throwable {
        new LandingPage(driver).I_enter_password_as(password);
    }

    @When ("^I click Login button$")
    public void clickLoginButton() throws Throwable {
        new LandingPage(driver).I_click_login_button();
    }

    @Then ("^I should be logged in$")
    public void I_should_be_logged_in() throws Throwable {
        new DashboardPage(driver).I_should_be_logged_in();
    }

    @Then ("I should not be logged in$")
    public void I_should_not_be_logged_in() throws Throwable {
        new LandingPage(driver).I_should_not_be_logged_in();
    }
}
