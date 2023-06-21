package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage{

@FindBy (xpath = "//h1[text()='Order History']")
    public WebElement orderHistory_head;
@FindBy (xpath = "(//a[@class='btn btn-info'])[1]")
    public WebElement orderView2_btn;



}


