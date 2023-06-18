package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    @FindBy(xpath = "//a[text()='Password']")
    public WebElement password_btn;

    @FindBy(xpath = "//div[text()=' Success: Your password has been successfully updated.']")
    public WebElement passwordChangeSucces_msg;


}
