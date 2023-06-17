package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
    @Then("Verify that the Show: tab initially shows {string} in category of health&beauty")
    public void verify_that_the_show_tab_initially_shows_in_category_of_health_beauty (String expectedNumber){
            showNumberSelectPage.setShowNumberSelect_mtd(expectedNumber);
        }
    @When("The user clicks Televisions button")
    public void the_user_clicks_televisions_button (){
            televisionsPage.television_loc.click();
        }
    @Then("Verify that the Show: tab initially shows {string} in category of Televisions")
    public void verify_that_the_show_tab_initially_shows_in_category_of_televisions (String expectedNumber){
        showNumberSelectPage.setShowNumberSelect_mtd(expectedNumber);
        }
    @When("The user clicks TVAccessories button")
    public void the_user_clicks_tv_accessories_button () {
        tvAccessoriesPage.tvAccessories_loc.click();
        }
    @Then("Verify that the Show: tab initially shows {string} in category of TVAccessories")
    public void verify_that_the_show_tab_initially_shows_in_category_of_tv_accessories (String expectedNumber){
        showNumberSelectPage.setShowNumberSelect_mtd(expectedNumber);
        }
    @When("The user clicks Networking button")
    public void the_user_clicks_networking_button () {
        networkingPage.networking_loc.click();
        }
    @Then("Verify that the Show: tab initially shows {string} in category of Networking")
    public void verify_that_the_show_tab_initially_shows_in_category_of_networking (String expectedNumber){
        showNumberSelectPage.setShowNumberSelect_mtd(expectedNumber);
        }

    }

