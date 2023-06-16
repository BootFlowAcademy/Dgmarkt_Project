package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ContactPage;
import com.dgmarkt.pages.EditInformationPage;
import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;

public class US_27_ContuctUsFunc_StepDef {
    ContactPage contactPage = new ContactPage();
    HomePage homePage = new HomePage();
    EditInformationPage editInformationPage = new EditInformationPage();

    @When("The user click the contuct us button")
    public void the_user_click_the_contuct_us_button() {
        contactPage.contactUs_btn.click();
    }
    @Then("The user should be see their name and email")
    public void the_user_should_be_see_their_name_and_email() {
        String name_txtboxText = contactPage.contucUsYourName_txtbox.getText();
        String email_txtboxText = contactPage.contucUsEmail_txtbox.getText();
        homePage.myAccount_btn.click();
        homePage.myAccountShow_btn.click();
        editInformationPage.editAccount_btn.click();
        String excatName = editInformationPage.firstName_text.getText();
        String excatEmail= editInformationPage.eMail_text.getText();
        Assert.assertEquals(name_txtboxText,excatName);
        Assert.assertEquals(email_txtboxText,excatEmail);
        contactPage.contactUs_btn.click();
    }
    @And("The user enter the message")
    public void theUserEnterTheMessage() {
        contactPage.contucUsEnquiry_txtbox.sendKeys("User Enquiry Message Here");
    }
    @Then("The user click submit button")
    public void the_user_click_submit_button() {
        contactPage.contucUsSubmit_Btn.click();
    }
    @Then("Verify that the user see succsesfull message.")
    public void verify_that_the_user_see_succsesfull_message() {
        String expectedMessage = "Your enquiry has been successfully sent to the store owner!";
        Assert.assertEquals(expectedMessage,contactPage.contuctUsSuccessf_Msg.getText());
    }
    @And("The user enter message less then {int} char")
    public void theUserEnterMessageLessThenChar(int arg0) {
        String under10Char = "undr10chr";
        contactPage.contucUsEnquiry_txtbox.sendKeys(under10Char);
    }
    @And("Verify that the user see warning message.")
    public void verifyThatTheUserSeeWarningMessage() {
        Assert.assertEquals("Enquiry must be between 10 and 3000 characters!",contactPage.contuctUsWarning_Msg.getText());

    }
    @And("The user enter message above then {int} char")
    public void theUserEnterMessageAboveThenChar(int arg0) {
        String above3000char="This message should be above then 3000 char.";
        for (int i = 0; i < 69; i++) {
            contactPage.contucUsEnquiry_txtbox.sendKeys(above3000char);
        }
        contactPage.contucUsSubmit_Btn.click();
        Assert.assertEquals("Enquiry must be between 10 and 3000 characters!",contactPage.contuctUsWarning_Msg.getText());
    }

}
