package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CartPage;
import com.dgmarkt.pages.ComparisonPage;
import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static com.dgmarkt.utilities.BrowserUtils.scrollToElement;

public class US_16_ProductCompareFunction_StepDefs {

    ComparisonPage comparisonPage = new ComparisonPage();
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    HomePage homePage = new HomePage();
    CartPage cartPage = new CartPage();

    @When("The user hovers the {string} and click {string}")
    public void the_user_hovers_the_and_click(String Menu, String Submenu) {
        homePage.goToSubmenu(Menu,Submenu);
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
    @When("The user adds five products to the compare page")
    public void the_user_adds_five_products_to_the_compare_page() {
        healthBeautyPage.addToFiveProductCompare_mtd();
    }
    @Then("Verify that the compare page button appears as {string}")
    public void erifyThatTheComparePageButtonAppearsAs (String amount) {
        Assert.assertEquals(amount,healthBeautyPage.productCompareAmount_loc.getText());
    }

    @When("The user adds the product to cart using Add to Cart button")
    public void theUserAddsTheProductToCartUsingAddToCartButton() {
        comparisonPage.item1Health_addToCartBtn.click();
    }
    @Then("Verify that the user sees the product in the Cart")
    public void verifyThatTheUserSeesTheProductInTheCart() {
        comparisonPage.shoppingCart_loc.click();
        //scrollToElement(cartPage.shoppingCartHeader_loc);
        BrowserUtils.waitFor(2);
        Assert.assertEquals("BaByliss 3663U - Hair rollers",comparisonPage.item1Health_loc.getText());
        BrowserUtils.waitFor(1);
        cartPage.cartPageRemove_btn.click();
        BrowserUtils.waitFor(3);
    }
    @And("The user removes the product to cart using Remove button")
    public void theUserRemovesTheProductToCartUsingRemoveButton() {
        comparisonPage.item1Health_RemoveToCartBtn.click();
    }

    @Then("Verify that the user removes the product in the Cart")
    public boolean verifyThatTheUserRemovesTheProductInTheCart() {
        comparisonPage.comparisonPage_text.isDisplayed();
        scrollToElement(comparisonPage.product_detail_loc);
        BrowserUtils.waitFor(3);
        try {
            Driver.get().findElement(By.xpath("//td[text()='BaByliss 3663U - Hair rollers']"));
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }


}
