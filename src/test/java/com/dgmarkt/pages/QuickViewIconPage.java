package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewIconPage extends BasePage {

    @FindBy(xpath = "(//button[@class=\"button-quickview\"])[9]")
    public WebElement quickViewIcon;

    @FindBy(xpath = "(//a[text()='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer'])[2]")
    public WebElement quickViewProduct_txt;

}