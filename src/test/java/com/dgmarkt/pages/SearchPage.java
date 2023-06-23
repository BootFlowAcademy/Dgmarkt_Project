package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {
@FindBy (xpath= "//h2[text()='Products meeting the search criteria']/../p[2]")
    public WebElement noMatchMessage_msg;
}
