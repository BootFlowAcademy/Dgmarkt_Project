package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetworkingPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networking_loc;
}
