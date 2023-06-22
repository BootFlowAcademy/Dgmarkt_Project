package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditInformationPage extends BasePage {

    @FindBy(xpath = "//a[text()='Edit Account']")
    public WebElement editAccount_btn;
    @FindBy(xpath = "//input[@id='input-firstname']")
    public static WebElement firstName_text;
    @FindBy(xpath = "//input[@id='input-lastname']")
    public static WebElement lastName_text;
    @FindBy(xpath = "//input[@id='input-email']")
    public static WebElement eMail_text;
    @FindBy(xpath = "//input[@id='input-telephone']")
    public static WebElement telephone_text;
    @FindBy(xpath = "//input[@type='submit']")
    public static WebElement continue_btn;
    @FindBy(xpath = "//div[@text='alert alert-success alert-dismissible']")
    public WebElement editSuccess_msg;

    public void editInformation_mtd(String firstName, String lastName, String eMail, String telephone) {
        emptyInformation_mtd();
        firstName_text.sendKeys(firstName);
        lastName_text.sendKeys(lastName);
        eMail_text.sendKeys(eMail);
        telephone_text.sendKeys(telephone);
        continue_btn.click();

    }
    public void emptyInformation_mtd(){
        firstName_text.clear();
        lastName_text.clear();
        eMail_text.clear();
        telephone_text.clear();
    }
}


