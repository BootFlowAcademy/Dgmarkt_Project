package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistoryPage extends BasePage{

@FindBy (xpath = "//td[text()='#314']")
    public WebElement orderId_txt;

}
