package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.AddressBookPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.*;

public class US_10_AddOrModifyAddressFunction_StepDef {
    AddressBookPage addressBookPage = new AddressBookPage();
    @Then("The user should be click on the address book tab on the page that opens")
    public void the_user_should_be_click_on_the_address_book_tab_on_the_page_that_opens() {
      addressBookPage.addressBook_btn.click();    }
    @When("The user clicks on new address button")
    public void theUserClicksOnNewAddressButton() {
        addressBookPage.newAddress_btn.click();
    }
    @And("The user clicks on {string} box, {string} box,  {string} box,{string} box and {string} box")
    public void theUserClicksOnBoxBoxBoxBoxAndBox(String FirstName, String LastName, String Address1, String City, String PostCode) {
       addressBookPage.theUserAddressClicks_mtd(FirstName,LastName,Address1,City,PostCode);}
    @Then("The user click Continue button")
    public void theUserClickContinueButton() {
        addressBookPage.continue_btn.click();
    }
    @Then("Verify that the user see verify message")
    public void verifyThatTheUserSeeVerifyMessage() {
       assertTrue(addressBookPage.verifyNewAddressAdd_text.isDisplayed());
    }
    @And("The user select {string} and {string}")
    public void theUserSelectAnd(String Country, String RegionState) {
        addressBookPage.theUserSelectCountryRegion_mtd(Country,RegionState);
    }
    @Then("Verify that the user see danger text")
    public void verifyThatTheUserSeeDangerText() {
        assertTrue(addressBookPage.verifyDangerText_text.isDisplayed());
    }
    @When("The user clicks edit button")
    public void theUserClicksEditButton() {
        addressBookPage.editButton_btn.click();
    }
    @And("The user clears {string} box, {string} box,  {string} box,{string} box and {string} box for update")
    public void theUserClearsBoxBoxBoxBoxAndBoxForUpdate(String FirstName, String LastName, String Address1, String City, String PostCode) {
    addressBookPage.theUserAddressClear_mtd(FirstName,LastName,Address1,City,PostCode);
    }
    @Then("Verify that the user see update verify message")
    public void verifyThatTheUserSeeUpdateVerifyMessage() {
        assertTrue(addressBookPage.verifyEditAddressUpdated_text.isDisplayed());
    }
}
