package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_2_LogOutFunctionality_StepDef {
    HomePage homePage = new HomePage();

    @When("The user clicks to My Account button")
    public void the_user_clicks_to_my_account_button() {
        homePage.myAccount_btn.click();
    }
    @When("The user clicks to Logout button")
    public void the_user_clicks_to_logout_button() {
        Assert.assertFalse("Account logout box should not be displayed",homePage.accountLogout_box.isDisplayed());
        homePage.logout_btn.click();
            }
    @Then("Verify that the user has securely terminated the session and sees the Account Logout box")
    public void verify_that_the_user_has_securely_terminated_the_session_and_sees_the_account_logout_box() {
        BrowserUtils.waitForVisibility(homePage.accountLogout_box,2);
        Assert.assertTrue("Account logout box should be displayed",homePage.accountLogout_box.isDisplayed());

    }
  }
