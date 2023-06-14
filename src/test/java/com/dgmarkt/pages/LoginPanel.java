package com.dgmarkt.pages;

import com.dgmarkt.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPanel extends BasePage{
    @FindBy(css = "input[name='email']")
    public WebElement loginPanelEmail_text;
    @FindBy(css = "input[name='password']")
    public WebElement loginPanelPassword_text;
    @FindBy(css = "input[name='login']")
    public WebElement loginPanelLogin_Btn;
    public void loginPanel_mtd(){
        loginPanelEmail_text.sendKeys(ConfigurationReader.get("loginPanelEmail"));
        loginPanelPassword_text.sendKeys(ConfigurationReader.get("loginPanelPassword"));
        loginPanelLogin_Btn.click();
    }
}
