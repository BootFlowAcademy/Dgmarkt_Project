package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPage;
import com.dgmarkt.pages.LoginPanel;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Us_02_LogOutFunctionality_StepDef {
    HomePage homePage = new HomePage();
    LoginPanel loginPanel=new LoginPanel();
    LoginPage loginPage=new LoginPage();
    String unExpectedWindowId="";
    @When("The user clicks to My Account button")
    public void the_user_clicks_to_my_account_button() {
        homePage.myAccount_btn.click();
    }
    @When("The user clicks to Logout button")
    public void the_user_clicks_to_logout_button() {
        Assert.assertFalse("Account logout box should not be displayed", homePage.accountLogout_box.isDisplayed());
        homePage.logout_btn.click();
    }
    @Then("Verify that the user has securely terminated the session and sees the Account Logout box")
    public void verify_that_the_user_has_securely_terminated_the_session_and_sees_the_account_logout_box() {
        BrowserUtils.waitForVisibility(homePage.accountLogout_box, 2);
        Assert.assertTrue("Account logout box should be displayed", homePage.accountLogout_box.isDisplayed());
    }
    @When("The user clicks to Exit Button \\(X)  for the browser close")
    public void the_user_clicks_to_exit_button_x_for_the_browser_close() throws InterruptedException {
        unExpectedWindowId= Driver.get().getWindowHandle();
        Driver.closeDriver();
        Thread.sleep(2000); // 2 saniye bekleme süresi
    }
    @Then("The user verify that current browser is not old browser")
    public void the_user_verify_that_current_browser_is_not_old_browser() {
        Assert.assertNotEquals(unExpectedWindowId,Driver.get().getWindowHandle());
    }
    @Then("Verify that the user has securely terminated the session and the login panel page is open")
    public void verify_that_the_user_has_securely_terminated_the_session_and_the_login_panel_page_is_open() {
        String actualMessage= Driver.get().findElement(By.xpath("//h5[text()='Please Enter Your Username and Password']")).getText();
        Assert.assertEquals("Please Enter Your Username and Password",actualMessage);
    }
    @Then("The user clicks to Go Back Button")
    public void the_user_clicks_to_go_back_button() {
        Driver.get().navigate().back();
    }
    @Then("Verify that successfully logged out")
    public void verify_that_successfully_logged_out() {
    loginPage.popUpExit_btn.click();
    loginPage.myAccount_btn.click();
    Assert.assertTrue(loginPage.accountLogin_btn.isDisplayed());
    }
    @When("The user waits {int} minutes without any movement on the site")
    public void the_user_waits_minutes_without_any_movement_on_the_site(int waitMinutes) {
        BrowserUtils.waitFor(waitMinutes*6);
    }
    @When("The user clicks to Refresh Button")
    public void the_user_clicks_to_refresh_button() {
    Driver.get().navigate().refresh();
    }
    @Then("Verify that automatic logged out of the site")
    public void verify_that_automatic_logged_out_of_the_site() {
        loginPage.popUpExit_btn.click();
        loginPage.myAccount_btn.click();
        Assert.assertFalse(loginPage.accountLogin_btn.isDisplayed());
    }
    @When("The user navigate to {string}")
    public void the_user_navigate_to(String url) {
        Driver.get().navigate().to(url);
    }
    @Then("Verify that the {string} page opens")
    public void verify_that_the_page_opens(String expUrl) {
        Assert.assertEquals(expUrl,Driver.get().getCurrentUrl());
    }
    @Then("The user  waits  {int} minutes and clicks to *Click to go back button*")
    public void the_user_waits_minutes_and_clicks_to_click_to_go_back_button(int waitMinutes) {
        BrowserUtils.waitFor(waitMinutes*6);
        Driver.get().navigate().back();
    }

}

