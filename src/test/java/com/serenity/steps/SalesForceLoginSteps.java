package com.serenity.steps;

import com.serenity.steps.serenitysteps.NavigatingUser;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class SalesForceLoginSteps {

    @Steps
    NavigatingUser user;

    @Managed(driver="chrome", uniqueSession = true)
    WebDriver driver;

    @Given("^I am on the sales force login page$")
    public void iAmOnTheSalesForceLoginPage() throws Throwable {
        user.whenOnSalesForceLoginPage();
    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterMyAnd(String username, String password) throws Throwable {
        user.entersUsernameAndPassword(username,password);
    }

    @Then("^I should see an error message$")
    public void iShouldSeeAnErrorMessage() throws Throwable {
        user.checkIfErrorDisplayed();
    }
}
