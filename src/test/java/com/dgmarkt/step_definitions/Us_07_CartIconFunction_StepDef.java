package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.BasePage;
import com.dgmarkt.pages.CartPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.NetworkingPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_07_CartIconFunction_StepDef {
    HomePage homePage = new HomePage();
    NetworkingPage networkingPage = new NetworkingPage();
    CartPage cartPage = new CartPage();

    @When("The user clicks cart icon button")
    public void the_user_clicks_cart_icon_button() {
        Assert.assertFalse("Product list shouldn't be display!", homePage.cartProduct_list.isDisplayed());
        homePage.cartIcon_btn.click();
    }
    @Then("Verify that added product list is displayed")
    public void verify_that_added_product_list_is_displayed() {
        Assert.assertTrue("Product list should be display!", homePage.cartProduct_list.isDisplayed());
    }
    @Given("The user navigates to sub-category {string}")
    public void the_user_navigates_to_sub_category(String subCategoryName) {
        homePage.goToSubCategoryByName_mtd(subCategoryName);
    }
    @Given("The user adds two products to the cart list names {string} and {string}")
    public void the_user_adds_two_products_to_the_cart_list_names_and(String item1, String item2) {
        networkingPage.addToCartByProductName_mtd(item1);
        networkingPage.addToCartByProductName_mtd(item2);
    }
    @When("The user clicks view cart button")
    public void the_user_clicks_view_cart_button() {
        BrowserUtils.waitForVisibility(networkingPage.viewCart_btn, 2);
        networkingPage.viewCart_btn.click();
    }
    @Then("Verify that added products are {int} in CartPage")
    public void verify_that_added_products_are_in_cart_page(int expNumberOfProduct) {
        int actNumberOfProduct = cartPage.numberOfProductInCartList_mtd();
        Assert.assertEquals(expNumberOfProduct, actNumberOfProduct);
    }
}
