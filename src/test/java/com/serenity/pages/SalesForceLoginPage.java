package com.serenity.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://login.salesforce.com/")
public class SalesForceLoginPage extends PageObject {

    public void submitCredentials(String username, String password) {
        $("[id='username']").sendKeys(username);
        $("[id='password']").sendKeys(password);
        $("[type='submit']").click();
    }

    public void checkErrorMessage() {
        System.out.println($("[id='error']").getText());
    }
}
