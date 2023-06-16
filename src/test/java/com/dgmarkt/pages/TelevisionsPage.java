package com.dgmarkt.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TelevisionsPage extends BasePage {
    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement television_loc;

}