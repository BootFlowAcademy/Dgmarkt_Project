package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.LoginPanel;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
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
}

