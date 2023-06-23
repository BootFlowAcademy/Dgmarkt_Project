package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.EditInformationPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_08_EditInformationFunction_StepDef {
    HomePage homePage = new HomePage();
    EditInformationPage editInformationPage = new EditInformationPage();
    @When("The user clicks on the my account button under the my account tab")
    public void the_user_clicks_on_the_my_account_button_under_the_my_account_tab() {
        homePage.myAccount_btn.click();
        homePage.myAccountShow_btn.click();
    }
    @Then("The user should be click on the edit my account tab on the page that opens")
    public void the_user_should_be_click_on_the_edit_my_account_tab_on_the_page_that_opens() {
        editInformationPage.editAccount_btn.click();
    }
    @When("The user should be able to make various changes on the page that opens")
    public void the_user_should_be_able_to_make_various_changes_on_the_page_that_opens() {
        editInformationPage.editInformation_mtd("Elif", "Deniz", "denizel@gmail.com", "05322222222");
    }
    @Then("Verify that you can click the continue button")
    public void verify_that_you_can_click_the_continue_button() {
        BrowserUtils.waitForVisibility(editInformationPage.editSuccess_msg, 3);
        Assert.assertTrue("'Success: Your account has been successfully updated.' should be displayed", editInformationPage.editSuccess_msg.isDisplayed());
    }
    @When("The user enters credentials {string}, {string}, {string}, {string} in field")
    public void the_user_enters_credentials_in_field(String firstName, String lastName, String eMail, String telephone) {
        editInformationPage.editInformation_mtd(firstName, lastName, eMail, telephone);
    }
    @Then("Verify that warning message is displayed.")
    public void verify_that_warning_message_is_displayed() {
        Assert.assertFalse(editInformationPage.editSuccess_msg.isDisplayed());
    }
}

