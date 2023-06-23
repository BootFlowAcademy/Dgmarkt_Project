package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.pages.NetworkingPage;
import com.dgmarkt.pages.TVAccessoriesPage;
import com.dgmarkt.pages.TelevisionsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us_14_PriceSliderFunction_StepDef {
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    TVAccessoriesPage tvAccessoriesPage=new TVAccessoriesPage();
    NetworkingPage networkingPage=new NetworkingPage();
    TelevisionsPage televisionsPage=new TelevisionsPage();
    @When("The user scroll the price slider")
    public void the_user_scroll_the_price_slider() throws InterruptedException {
        healthBeautyPage.barScroll_mtd();
    }
    @And("The user click show hundred product button")
    public void theUserClickShowHundredProductButton() {
        healthBeautyPage.clickShowHundredProduct_mtd();
    }
    @Then("Verify that bring the products in the desired price range")
    public void verify_that_bring_the_products_in_the_desired_price_range() throws InterruptedException {
        healthBeautyPage.sliderFunctionHB_mtd();
    }
    @When("The user clicks TVAccessories button")
    public void the_user_clicks_tv_accessories_button() {
        tvAccessoriesPage.tvAccessories_loc.click();
    }
    @When("The user clicks Networking button")
    public void the_user_clicks_networking_button() {
        networkingPage.networking_loc.click();
    }
    @When("The user clicks Televisions button")
    public void the_user_clicks_televisions_button() {
        televisionsPage.television_loc.click();
    }
}
