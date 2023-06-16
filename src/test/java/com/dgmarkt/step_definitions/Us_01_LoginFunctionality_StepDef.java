package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.pages.LoginPanel;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_01_LoginFunctionality_StepDef {
    LoginPanel loginPanel=new LoginPanel();
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    @Given("The user navigate to web site")
    public void the_user_navigate_to_web_site() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters login panel credential and clicks login")
    public void the_user_enters_login_panel_credential_and_clicks_login() {
        loginPanel.loginPanel_mtd();
    }
    @When("The user closes cookies pop up")
    public void the_user_closes_cookies_pop_up() {
        loginPage.popUpExit_btn.click();
    }
    @Then("Verify that the user sees home logo icon")
    public void verify_that_the_user_sees_home_logo_icon() {
        Assert.assertTrue(loginPage.homeLogo_icon.isDisplayed());
    }
    @When("The user clicks the login under the my account")
    public void the_user_clicks_the_login_under_the_my_account() {
        loginPage.myAccount_btn.click();
        loginPage.accountLogin_btn.click();
    }
    @When("The user enters account credentials {string} and {string} and clicks login")
    public void the_user_enters_account_credentials_and_and_clicks_login(String email, String password) {
        loginPage.loginPage_mtd(email, password);
    }
    @Then("Verify that the user is on home page")
    public void verify_that_the_user_is_on_home_page() {
        Assert.assertTrue(homePage.loginSuccessfully_msg.isDisplayed());
    }
    @Then("Verify that the error message is displayed")
    public void verify_that_the_error_message_is_displayed() {
        String actualWarningMessage=loginPage.loginPageWarning_msg.getText();
        Assert.assertTrue(actualWarningMessage.contains("Warning: "));
    }
}
