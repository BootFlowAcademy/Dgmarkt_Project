package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Us_18_ShowFunction_StepDef {
    HomePage homePage = new HomePage();
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    TelevisionsPage televisionsPage = new TelevisionsPage();
    TVAccessoriesPage tvAccessoriesPage = new TVAccessoriesPage();
    NetworkingPage networkingPage = new NetworkingPage();

    ShowNumberSelectPage showNumberSelectPage = new ShowNumberSelectPage();

    @When("The user clicks Health & Beauty button")
    public void the_user_clicks_health_beauty_button() {
        homePage.healthCat_Btn.click();
    }
    @When("The user clicks Televisions button")
    public void the_user_clicks_televisions_button() {
        televisionsPage.television_loc.click();
    }
    @When("The user clicks TVAccessories button")
    public void the_user_clicks_tv_accessories_button() {
        tvAccessoriesPage.tvAccessories_loc.click();
    }
    @When("The user clicks Networking button")
    public void the_user_clicks_networking_button() {
        networkingPage.networking_loc.click();
    }
    @Then("Verify that the Show: tab initially shows {string} in Health & Beauty")
    public void verify_that_the_show_tab_initially_shows_in_health_beauty(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);}
    @Then("Verify that the Show: tab initially shows {string} in Televisions")
    public void verify_that_the_show_tab_initially_shows_in_televisions(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);}
    @Then("Verify that the Show: tab initially shows {string} in TVAccessories")
    public void verify_that_the_show_tab_initially_shows_in_tv_accessories(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);}

    @Then("Verify that the Show: tab initially shows {string} in Networking")
    public void verify_that_the_show_tab_initially_shows_in_networking(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);

    }

    @Then("The user can replace the Show: tab with {string} in Health & Beauty")
    public void the_user_can_replace_the_show_tab_with_in_health_beauty(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);
        showNumberSelectPage.setShowNumberReplace_mtd();
    }

    @Then("The user can replace the Show: tab with {string} in Televisions")
    public void the_user_can_replace_the_show_tab_with_in_televisions(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);
        showNumberSelectPage.setShowNumberReplace_mtd();
    }

    @Then("The user can replace the Show: tab with {string} in TVAccessories")
    public void the_user_can_replace_the_show_tab_with_in_tv_accessories(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);
        showNumberSelectPage.setShowNumberReplace_mtd();
    }

    @Then("The user can replace the Show: tab with {string} in Networking")
    public void the_user_can_replace_the_show_tab_with_in_networking(String expectedNumber) throws InterruptedException {
        showNumberSelectPage.showDefaultNumberSelect_mtd(expectedNumber);
        showNumberSelectPage.setShowNumberReplace_mtd();
        ;
    }
}








