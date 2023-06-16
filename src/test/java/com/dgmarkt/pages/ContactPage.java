package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {
    @FindBy(xpath = "//*[@id='input-name']")
    public WebElement contucUsYourName_txtbox;

    @FindBy(xpath = "//*[@id='input-email']")
    public WebElement contucUsEmail_txtbox;

    @FindBy(xpath = "//*[@id='input-enquiry']")
    public WebElement contucUsEnquiry_txtbox;

    @FindBy(xpath = "//div[@id='content']/form/div/div")
    public WebElement contucUsSubmit_Btn;

    @FindBy(xpath = "//*[@class='text-danger']")
    public WebElement contuctUsWarning_Msg;

    @FindBy(xpath = "//*[@id='content']/p")
    public WebElement contuctUsSuccessf_Msg;
}
