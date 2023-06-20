package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {
    Select selectCountry;
    @FindBy(xpath = "(//input[@name='payment_address'])[2]/..")
    public WebElement billingNewAddress_radioBtn;
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    public WebElement billingFirstname_text;
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    public WebElement billingLastname_text;
    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    public WebElement billingAdddress1_text;
    @FindBy(xpath = "//input[@id='input-payment-city']")
    public WebElement billingCity_text;
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    public WebElement billingPostcode_text;
    @FindBy(xpath = "//select[@id='input-payment-country']")
    public WebElement billingCountry_select;
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    public WebElement billingRegion_select;
    @FindBy(xpath = "//input[@id='button-payment-address']")
    public WebElement billingContinue_btn;
    @FindBy(xpath = "(//input[@name='shipping_address'])[2]")
    public WebElement deliveryNewAddress_radioBtn;
    @FindBy(xpath = "//input[@id='input-shipping-firstname']")
    public WebElement deliveryFirstname_text;
    @FindBy(xpath = "//input[@id='input-shipping-lastname']")
    public WebElement deliveryLastname_text;
    @FindBy(xpath = "//input[@id='input-shipping-address-1']")
    public WebElement deliveryAdddress1_text;
    @FindBy(xpath = "//input[@id='input-shipping-city']")
    public WebElement deliveryCity_text;
    @FindBy(xpath = "//input[@id='input-shipping-postcode']")
    public WebElement deliveryPostcode_text;
    @FindBy(xpath = "//select[@id='input-shipping-country']")
    public WebElement deliveryCountry_select;
    @FindBy(xpath = "//select[@id='input-shipping-zone']")
    public WebElement deliveryRegion_select;
    @FindBy(xpath = "//input[@id='button-shipping-address']/..")
    public WebElement deliveryContinue_btn;
    @FindBy(xpath = "(//textarea[@name='comment'])[1]")
    public WebElement deliveryMethodCommentArea_text;
    @FindBy(id = "button-shipping-method")
    public WebElement deliveryMethodContinue_btn;
    @FindBy(xpath = "(//textarea[@name='comment'])[2]")
    public WebElement paymentCommentArea_text;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement agreeTermsAndConditions_checkBox;
    @FindBy(id="button-payment-method")
    public WebElement paymentContinue_btn;
    @FindBy(xpath = "//input[@value='Confirm Order']")
    public WebElement confirmOrde_btn;
    @FindBy(xpath = "//a[text()='Success']")
    public WebElement checkoutSucces_text;
    public void setSelect_mtd(WebElement selectElement, String selectName){
        selectCountry = new Select(selectElement);
        selectCountry.selectByVisibleText(selectName);
    }
    public void enterCredentialsForBilling_mtd(String firstname, String lastname, String address1, String city, String postcode, String country, String region){
        billingFirstname_text.sendKeys(firstname);
        billingLastname_text.sendKeys(lastname);
        billingAdddress1_text.sendKeys(address1);
        billingCity_text.sendKeys(city);
        billingPostcode_text.sendKeys(postcode);
        setSelect_mtd(billingCountry_select, country);
        setSelect_mtd(billingRegion_select, region);
        billingContinue_btn.click();
    }
    public void enterCredentialsForDelivery_mtd(String firstname, String lastname, String address1, String city, String postcode, String country, String region){
        deliveryFirstname_text.sendKeys(firstname);
        deliveryLastname_text.sendKeys(lastname);
        deliveryAdddress1_text.sendKeys(address1);
        deliveryCity_text.sendKeys(city);
        deliveryPostcode_text.sendKeys(postcode);
        setSelect_mtd(deliveryCountry_select, country);
        setSelect_mtd(deliveryRegion_select, region);
        deliveryContinue_btn.click();
    }

}