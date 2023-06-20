package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ComparisonPage;
import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.dgmarkt.utilities.BrowserUtils.scrollToElement;

public class US_16_ProductCompareFunction_StepDefs {

    ComparisonPage comparisonPage = new ComparisonPage();
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();

    @When("The user hovers the {string} and click {string}")
    public void the_user_hovers_the_and_click(String Menu, String Submenu) {
        healthBeautyPage.goToSubmenu(Menu,Submenu);
    }
    @Then("Verify that the user is on Comparison Page")
    public void verify_that_the_user_is_on_comparison_page() {
        Assert.assertTrue(comparisonPage.comparisonPage_text.isDisplayed());
        BrowserUtils.waitFor(2);
    }
    @When("The user adds products to the compare page")
    public void the_user_adds_products_to_the_compare_page() {
      healthBeautyPage.addToCompare_mtd();
    }
    @When("The user clicks Product Compare button")
    public void the_user_clicks_product_compare_button() {
        scrollToElement(healthBeautyPage.productCompare_btn);
        BrowserUtils.waitFor(2);
        healthBeautyPage.productCompare_btn.click();
    }
    @Then("Verify that the user can see {string} and {string} on the Comparison Page")
    public void verifyThatTheUserCanSeeAndOnTheComparisonPage(String item1, String item2) {
        comparisonPage.comparisonPage_text.isDisplayed();
        scrollToElement(comparisonPage.product_detail_loc);
        BrowserUtils.waitFor(3);
        Assert.assertEquals(item1,comparisonPage.item1Health_loc.getText());
        Assert.assertEquals(item2,comparisonPage.item2Health_loc.getText());

    }
}
