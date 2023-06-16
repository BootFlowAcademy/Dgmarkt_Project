package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditInformationPage extends BasePage{

    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement editAccount_btn;
    @FindBy (xpath = "//input[@id='input-firstname']")
    public WebElement firstName_text;
    @FindBy (xpath = "//input[@id='input-lastname']")
    public WebElement lastName_text;
    @FindBy (xpath = "//input[@id='input-email']")
    public WebElement eMail_text;
    @FindBy (xpath = "//input[@id='input-telephone']")
    public WebElement telephone_text;
    @FindBy (xpath = "//input[@type='submit']")
    public WebElement continue_btn;
    @FindBy (xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement editSuccess_msg;

}
