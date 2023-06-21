package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReturnsPage extends BasePage{
@FindBy (xpath = "//a[text()=' Product Returns']")
    public WebElement productReturns_text;
@FindBy (xpath = "(//label/input[@name='return_reason_id'])[1]")
    public WebElement deadOnArrival_btn;
@FindBy(xpath = "//input[@type='submit']")
    public WebElement returnSubmit_btn;
@FindBy(xpath = "//p[contains(text(),'Thank you for submitting your return request.')]")
    public WebElement returnSuc_txt;
}
