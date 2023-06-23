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
    @When("The user leaves <firstName> line blank")
    public void the_user_leaves_first_name_line_blank() {
        editInformationPage.emptyInformation_mtd();
        EditInformationPage.firstName_text.sendKeys("");
    }
    @When("The user enters <lastName>, <eMail> and <telephone> valid credentials")
    public void the_user_enters_last_name_e_mail_and_telephone_valid_credentials() {
        EditInformationPage.lastName_text.sendKeys("Deniz");
        EditInformationPage.eMail_text.sendKeys("denizel@gmail.com");
        EditInformationPage.telephone_text.sendKeys("05322222222");
        EditInformationPage.continue_btn.click();
    }
    @Then("Warning message is displayed")
    public void verify_that_error_message_is_displayed() {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(editInformationPage.firstNameWarning_msg.isDisplayed());
    }
    @When("The user leaves <lastName> line blank")
    public void the_user_leaves_last_name_line_blank() {
        editInformationPage.emptyInformation_mtd();
        EditInformationPage.lastName_text.sendKeys("");
    }
    @When("The user enters <firstName>, <eMail> and <telephone> credentials")
    public void the_user_enters_first_name_e_mail_and_telephone_credentials() {
        EditInformationPage.firstName_text.sendKeys("Elif");
        EditInformationPage.eMail_text.sendKeys("denizel@gmail.com");
        EditInformationPage.telephone_text.sendKeys("05322222222");
        EditInformationPage.continue_btn.click();
    }
    @Then("Verify that the user displayed the warning message")
    public void verify_that_the_user_displayed_the_warning_message() {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(editInformationPage.lastNameWarning_msg.isDisplayed());
    }
    @When("The user leaves <eMail> line blank")
    public void the_user_leaves_e_mail_line_blank() {
        editInformationPage.emptyInformation_mtd();
        EditInformationPage.eMail_text.sendKeys("");
    }
    @When("The user enters <firstName>, <lastName>, <telephone> credentials")
    public void the_user_enters_first_name_last_name_telephone_credentials() {
        EditInformationPage.firstName_text.sendKeys("Elif");
        EditInformationPage.lastName_text.sendKeys("Deniz");
        EditInformationPage.telephone_text.sendKeys("05322222222");
        EditInformationPage.continue_btn.click();
    }
    @Then("Verify that the user displayed the error message")
    public void verify_that_the_user_displayed_the_error_message() {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(editInformationPage.eMailWarning_msg.isDisplayed());
    }
    @When("The user leaves <telephone> line blank")
    public void the_user_leaves_telephone_line_blank() {
        editInformationPage.emptyInformation_mtd();
        EditInformationPage.telephone_text.sendKeys("");
    }
    @When("The user enters <firstName>, <lastName>, <eMail> valid credentials")
    public void the_user_enters_first_name_last_name_e_mail_valid_credentials() {
        EditInformationPage.firstName_text.sendKeys("Elif");
        EditInformationPage.lastName_text.sendKeys("Deniz");
        EditInformationPage.eMail_text.sendKeys("denizel@gmail.com");
        EditInformationPage.continue_btn.click();
    }
    @Then("Error message is displayed")
    public void error_message_is_displayed() {
        BrowserUtils.waitFor(4);
        Assert.assertTrue(editInformationPage.telephoneWarning_msg.isDisplayed());
    }
}
