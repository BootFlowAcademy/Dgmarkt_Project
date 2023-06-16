package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVAccessoriesPage extends BasePage{
    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessories_loc;
}
