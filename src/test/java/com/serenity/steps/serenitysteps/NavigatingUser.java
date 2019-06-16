package com.serenity.steps.serenitysteps;

import com.serenity.pages.CurrentPage;
import com.serenity.pages.GoogleHomePage;
import com.serenity.pages.SalesForceLoginPage;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NavigatingUser {

    GoogleHomePage googleHomePage;
    CurrentPage currentPage;
    SalesForceLoginPage salesForceLoginPage;

    @Step
    public void isOnTheGoogleHomePage() {
        googleHomePage.open();
        assertThat(currentPage.getTitle()).isEqualToIgnoringCase("Google");
    }

    @Step
    public void searchForText(String bookName) {
        googleHomePage.searchForText(bookName);
    }

    @Step
    public void checkIfResultDisplayed() {
        WebElement body = currentPage.$(By.tagName("body"));
        assertThat(body.getText()).contains("Rhonda");
    }

    @Step
    public void whenOnSalesForceLoginPage() {
        salesForceLoginPage.open();
    }

    @Step
    public void entersUsernameAndPassword(String username, String password) {
        salesForceLoginPage.submitCredentials(username,password);
    }

    @Step
    public void checkIfErrorDisplayed() {
        salesForceLoginPage.checkErrorMessage();
    }

}
