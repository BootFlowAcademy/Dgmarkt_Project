package com.dgmarkt.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NetworkingPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networking_loc;

    }

