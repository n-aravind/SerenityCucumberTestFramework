package com.serenity.steps;

import com.serenity.steps.serenitysteps.NavigatingUser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;

public class SearchSteps {

    @Steps
    NavigatingUser user;

    @Managed(driver="chrome", uniqueSession = true)
    WebDriver driver;

    @Given("^I am on the google home page$")
    public void iAmOnTheGoogleHomePage() throws Throwable {
        user.isOnTheGoogleHomePage();

    }

    @When("^I search for the book \"([^\"]*)\"$")
    public void iSearchForTheBook(String bookName) throws Throwable {
        user.searchForText(bookName);
    }


    @Then("^Search results should be displayed$")
    public void searchResultsShouldBeDisplayed() throws Throwable {
        user.checkIfResultDisplayed();
    }
}
