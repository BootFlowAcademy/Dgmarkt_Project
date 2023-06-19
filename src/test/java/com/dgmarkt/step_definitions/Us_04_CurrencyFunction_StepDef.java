package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Us_04_CurrencyFunction_StepDef {
    HomePage homePage = new HomePage();
    String expCurrency = "";
    @Given("The user clicks currency button")
    public void the_user_clicks_currency_button() {
        homePage.currency_btn.click();
    }
    @Then("The user click the Euro Button")
    public void the_user_click_the_euro_button() {
        homePage.currencySubMenuEuro_btn.click();
    }
    @Then("verify that The user sees euro icon")
    public void verify_that_the_user_sees_euro_icon() {
        char euroIcon = 8364;
        Assert.assertEquals(euroIcon, homePage.currentCurrency_text.getText().charAt(0));
    }
    @Then("The user click the Dollar Button")
    public void the_user_click_the_dollar_button() {
        homePage.currencySubMenuDollar_btn.click();
    }
    @Then("verify that The user sees dollar icon")
    public void verify_that_the_user_sees_dollar_icon() {
    }
    @Then("The user click the Pound Button")
    public void theUserClickThePoundButton() {
        homePage.currency_btn.click();
        homePage.currencySubMenuPound_btn.click();
    }
    @Then("verify that The user sees Pound icon")
    public void verify_that_the_user_sees_pound_icon() {
    }
    @Then("The user click the {string} Button")
    public void the_user_click_the_button(String currencyName) {
        expCurrency = homePage.currencySubmenuByName_mtd(currencyName).getText();
        homePage.currencySubmenuByName_mtd(currencyName).click();
    }
    @Then("verify that The user sees select currency icon")
    public void verify_that_the_user_sees_select_currency_icon() {
        Assert.assertTrue(expCurrency.contains(homePage.currentCurrency_text.getText()));
    }
}
