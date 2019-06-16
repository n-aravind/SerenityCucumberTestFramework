package com.serenity.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.google.com/")
public class GoogleHomePage extends PageObject {

    @FindBy(name = "q")
    WebElement searchBox;

    public void searchForText(String bookName) {
        searchBox.sendKeys(bookName, Keys.ENTER);
    }
}
