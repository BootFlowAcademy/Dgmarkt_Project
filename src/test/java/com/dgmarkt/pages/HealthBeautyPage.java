package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthBeautyPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthAndBeauty_loc;
}
