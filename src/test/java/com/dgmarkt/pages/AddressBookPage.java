package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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
    public WebElement continue_btn;
    @FindBy(xpath = "//div[text()=' Your address has been successfully added']")
    public WebElement verifyNewAddressAdd_text;
    @FindBy(css = "[class=\"text-danger\"]")
    public WebElement verifyDangerText_text;
    @FindBy(xpath = "(//a[text()='Edit'])[1]")
    public WebElement editButton_btn;
    @FindBy(xpath = "//div[text()=' Your address has been successfully updated']")
    public WebElement verifyEditAddressUpdated_text;

    public void theUserAddressClicks_mtd(String FirstName, String LastName, String Address1, String City, String PostCode) {
        inputFirstName_text.sendKeys(FirstName);
        inputLastName_text.sendKeys(LastName);
        inputAddress1_text.sendKeys(Address1);
        inputCity_text.sendKeys(City);
        inputPostCode_text.sendKeys(PostCode);
    }

    public void theUserSelectCountryRegion_mtd(String Country, String RegionState) {
        WebElement CountryLoc = Driver.get().findElement(By.cssSelector("#input-country"));
        Select slcCountry = new Select(CountryLoc);
        slcCountry.selectByValue(Country);
        WebElement RegionStateLoc = Driver.get().findElement(By.cssSelector("#input-zone"));
        Select slcRegionState = new Select(RegionStateLoc);
        BrowserUtils.waitFor(2);
        slcRegionState.selectByValue(RegionState);
    }

    public void theUserAddressClear_mtd(String FirstName, String LastName, String Address1, String City, String PostCode) {
        inputFirstName_text.clear();
        inputLastName_text.clear();
        inputAddress1_text.clear();
        inputCity_text.clear();
        inputPostCode_text.clear();
    }
}
