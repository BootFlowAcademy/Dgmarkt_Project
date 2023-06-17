package com.dgmarkt.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TVAccessoriesPage extends BasePage{
    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessories_loc;

    }

