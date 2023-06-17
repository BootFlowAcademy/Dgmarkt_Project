package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Us_04_CurrencyFunction_StepDef {
    HomePage homePage = new HomePage();
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
}
