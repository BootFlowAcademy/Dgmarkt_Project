package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class Us_09_ChangePassword_StepDef extends BasePage {

    LoginPanel loginPanel = new LoginPanel();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();
    HomePage homePage = new HomePage();
    ChangePasswordPage changePasswordPage = new ChangePasswordPage();

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

        changePasswordPage.changePassword_mtd("12!^+?öçqwetr@","12!^+?öçqwetr@");

    }
    @Then("Verify that password change confirmed.")
    public void verify_that_password_change_confirmed() {

        assertTrue(accountPage.passwordChangeSucces_msg.isDisplayed());
    }

    @Given("The user enters valid credentials with different datas")
    public void the_user_enters_valid_credentials_with_different_datas() {

        changePasswordPage.changePassword_mtd("Test1234","Test12345");

    }
    @Then("Verify that password change could not confirm.")
    public void verify_that_password_change_could_not_confirm() {

        assertTrue(changePasswordPage.doesNotMatch_msg.isDisplayed());

    }
    @When("The user enters {string} and {string} credentials")
    public void the_user_enters_and_credentials(String password, String passwordConfirm) {

        changePasswordPage.changePassword_mtd(password,passwordConfirm);

    }
    @Then("Verify that warning message is displayed")
    public void verify_that_warning_message_is_displayed() {

        assertTrue(changePasswordPage.validCredentialsWarning_msg.isDisplayed());

    }



}
