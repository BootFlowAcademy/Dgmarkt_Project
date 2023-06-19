package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPage extends BasePage {
    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement television_loc;

}