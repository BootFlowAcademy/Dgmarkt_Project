package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderInformationPage extends BasePage{
    @FindBy (xpath = "//td[text()='08/06/2023']")
    public WebElement orderDateText_txt;
    @FindBy (xpath = "(//a[@class='btn btn-primary'])[1]")
    public WebElement reOrder_btn;
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement reOrderAddCart_txt;
    @FindBy (xpath = "//i[@class='fa fa-reply']")
    public WebElement returnPro_btn;
}
