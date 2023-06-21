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
        editInformationPage.firstName_text.clear();
        editInformationPage.firstName_text.sendKeys("Elif");
        editInformationPage.lastName_text.clear();
        editInformationPage.lastName_text.sendKeys("Deniz");
        editInformationPage.eMail_text.clear();
        editInformationPage.eMail_text.sendKeys("eliftest@gmail.com");
        editInformationPage.telephone_text.clear();
        editInformationPage.telephone_text.sendKeys("05322222222");
    }
    @Then("Verify that you can click the continue button")
    public void verify_that_you_can_click_the_continue_button() {
        editInformationPage.continue_btn.click();
        BrowserUtils.waitForVisibility(editInformationPage.editSuccess_msg, 3);
        Assert.assertTrue("'Success: Your account has been successfully updated.' should be displayed", editInformationPage.editSuccess_msg.isDisplayed());
    }
}

