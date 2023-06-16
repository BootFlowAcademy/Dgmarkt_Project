package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//a[text()='Close']")
    public WebElement popUpExit_btn;
    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement loginPageEmail_text;
    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement loginPagePassword_text;
    @FindBy(xpath = "(//button[@class='button btn'])[1]")
    public WebElement loginPageLogin_btn;

    @FindBy (xpath = "//div[@class='alert alert-danger']")
    public WebElement loginPageWarning_msg;

    public void loginPage_mtd(String email,String password){
        loginPageEmail_text.sendKeys(email);
        loginPagePassword_text.sendKeys(password);
        loginPageLogin_btn.click();
    }
}
