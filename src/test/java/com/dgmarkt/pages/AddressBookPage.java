package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressBookPage extends BasePage {

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement addressBook_btn;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement newAddress_btn;

    @FindBy(xpath = "//input[@id='input-firstname']")
    public WebElement inputFirstName_text;
    @FindBy(xpath = "//input[@id='input-lastname']")
    public WebElement inputLastName_text;

    @FindBy(xpath = "//input[@id='input-address-1']")
    public WebElement inputAddress1_text;
    @FindBy(xpath = "//input[@id='input-city']")
    public WebElement inputCity_text;
    @FindBy(xpath = "//input[@id='input-postcode']")
    public WebElement inputPostCode_text;
    @FindBy(xpath = "//input[@value='Continue']")
    public WebElement Continue_btn;
    @FindBy(css = "#input-country")
    public WebElement inputCountry_text;


    @FindBy(xpath = "(//a[text()='Edit'])[1]")
    public WebElement editButton_btn;

    public void theUserAddressClicks(String FirstName, String LastName, String Address1, String City, String PostCode) {
        inputFirstName_text.sendKeys(FirstName);
        inputLastName_text.sendKeys(LastName);
        inputAddress1_text.sendKeys(Address1);
        inputCity_text.sendKeys(City);
        inputPostCode_text.sendKeys(PostCode);
    }
}
