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

    @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
    public WebElement doesNotMatch_msg;

    @FindBy(xpath = "//div[text()='Password must be between 4 and 20 characters!']")
    public WebElement validCredentialsWarning_msg;

    public void changePassword_mtd(String password, String passwordConfirm){

        password_txt.sendKeys(password);
        passwordConfirm_txt.sendKeys(passwordConfirm);
        continue_btn.click();

    }

}
