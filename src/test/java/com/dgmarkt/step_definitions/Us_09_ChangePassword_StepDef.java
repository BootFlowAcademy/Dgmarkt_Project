package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_09_ChangePassword_StepDef extends BasePage {

    LoginPanel loginPanel = new LoginPanel();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();
    HomePage homePage = new HomePage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

    /*@Given("The user is on the login panel page")
    public void the_user_is_on_the_login_panel_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPanel.loginPanel_mtd();
        BrowserUtils.waitFor(2);

    }
    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String userEmail, String userPassword) {
        loginPage.popUpExit_btn.click();
        BrowserUtils.waitFor(2);
        loginPage.myAccount_btn.click();
        loginPage.accountLogin_btn.click();
        BrowserUtils.waitFor(2);
        loginPage.loginPage_mtd(userEmail,userPassword);
        BrowserUtils.waitFor(2);



    }*/
    @Then("The user go to my account page")
    public void the_user_go_to_my_account_page() {
        homePage.myAccount_btn.click();
        BrowserUtils.waitFor(2);
        homePage.myAccountGo_btn.click();
        BrowserUtils.waitFor(2);


    }
    @Then("The user go to password page")
    public void the_user_go_to_password_page() {
        accountPage.password_btn.click();

    }

    @Given("The user enters valid credentials")
    public void the_user_enters_valid_credentials() {

        String desiredPassword = "12!^+?öçqwetr@";
        String confirmPassword = "12!^+?öçqwetr@";

        changePasswordPage.password_txt.sendKeys(desiredPassword);
        changePasswordPage.passwordConfirm_txt.sendKeys(confirmPassword);
        changePasswordPage.continue_btn.click();

    }
    @Then("Verify that password change confirmed.")
    public void verify_that_password_change_confirmed() {
        Assert.assertTrue(accountPage.passwordChangeSucces_msg.isDisplayed());
    }

    @Given("The user enters valid credentials with different datas")
    public void the_user_enters_valid_credentials_with_different_datas() {
        String desiredPassword = "Test1234";
        String confirmPassword = "Test12345";

    }
    @Then("Verify that password change could not confirm.")
    public void verify_that_password_change_could_not_confirm() {

    }



}
