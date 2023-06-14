package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage  extends BasePage {
    @FindBy(xpath = "//input[@id=\"input-password\"]")
    public WebElement password_txt;

    @FindBy(xpath = "//input[@id=\"input-confirm\"]")
    public WebElement passwordConfirm_txt;

    @FindBy (xpath = "//input[@class=\"btn btn-primary\"]")
    public WebElement continue_btn;

}
