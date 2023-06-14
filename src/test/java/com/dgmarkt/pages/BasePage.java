package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(),this);
    }
    @FindBy(xpath = "//a[@title='My Account']/..")
    public WebElement myAccount_btn;
    @FindBy(xpath = "//a[@id='pt-login-link']/..")
    public WebElement accountLogin_btn;
    @FindBy(xpath = "//div[@id='logo']")
    public WebElement homeLogo_icon;
}
