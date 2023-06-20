package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CartPage;
import com.dgmarkt.pages.CheckoutPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.NetworkingPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class Us_07_CartIconFunction_StepDef {
    HomePage homePage = new HomePage();
    NetworkingPage networkingPage = new NetworkingPage();
    CartPage cartPage = new CartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

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
        BrowserUtils.waitFor(2);
        networkingPage.viewCart_btn.click();
    }
    @Then("Verify that the user in on Shopping Cart Page")
    public void verify_that_the_user_in_on_shopping_cart_page() {
        String expURL = "https://dgmarkt.com/index.php?route=checkout/cart";
        String actURL = Driver.get().getCurrentUrl();
        Assert.assertEquals(expURL, actURL);
        Assert.assertTrue(cartPage.pageName_text.getText().contains("Shopping Cart"));
    }
    @Then("Verify that added products are {int} in CartPage")
    public void verify_that_added_products_are_in_cart_page(int expNumberOfProduct) {
        int actNumberOfProduct = cartPage.numberOfProductInCartList_mtd();
        Assert.assertEquals(expNumberOfProduct, actNumberOfProduct);
        cartPage.removeAllProductfromCart();
    }
    @When("The user clicks Checkout button")
    public void the_user_clicks_checkout_button() {
        cartPage.checkOut_btn.click();
    }
    @When("The user selects a new address for billing details and clicks continue with valid credentials")
    public void the_user_selects_a_new_address_for_billing_details_and_clicks_continue_with_valid_credentials(Map<String, String> dataTable) {
        checkoutPage.billingNewAddress_radioBtn.click();
        checkoutPage.enterCredentialsForBilling_mtd(dataTable.get("firstname"), dataTable.get("lastname"),
                dataTable.get("address1"), dataTable.get("city"), dataTable.get("postcode"),
                dataTable.get("country"), dataTable.get("region-state"));
    }
    @When("The user selects a new address for delivery details and clicks continue with valid credentials")
    public void the_user_selects_a_new_address_for_delivery_details_and_clicks_continue_with_valid_credentials(Map<String, String> dataTable) {
        BrowserUtils.clickWithJS(checkoutPage.deliveryNewAddress_radioBtn);
        checkoutPage.enterCredentialsForDelivery_mtd(dataTable.get("firstname"), dataTable.get("lastname"),
                dataTable.get("address1"), dataTable.get("city"), dataTable.get("postcode"),
                dataTable.get("country"), dataTable.get("region-state"));
    }
    @When("The user adds comment about his order {string} and clicks continue for delivery method")
    public void the_user_adds_comment_about_his_order_and_clicks_continue_for_delivery_method(String comment) {
        checkoutPage.deliveryMethodCommentArea_text.sendKeys(comment);
        checkoutPage.deliveryMethodContinue_btn.click();
    }
    @When("The user adds comment about his order {string} and clicks checkbox to agree Terms and Conditions and clicks continue")
    public void the_user_adds_comment_about_his_order_and_clicks_checkbox_to_agree_terms_and_conditions_and_clicks_continue(String comment) {
        checkoutPage.deliveryMethodCommentArea_text.sendKeys(comment);
        BrowserUtils.waitForClickablility(checkoutPage.agreeTermsAndConditions_checkBox, 3);
        checkoutPage.agreeTermsAndConditions_checkBox.click();
        checkoutPage.paymentContinue_btn.click();
    }
    @When("The user checks and clicks confirm order")
    public void the_user_checks_and_clicks_confirm_order() {
        checkoutPage.confirmOrde_btn.click();
    }
    @Then("The user is on success page")
    public void the_user_is_on_success_page() {
        BrowserUtils.waitForVisibility(checkoutPage.checkoutSucces_text, 3);
        String expUrl = "https://dgmarkt.com/index.php?route=checkout/success";
        Assert.assertEquals(expUrl, Driver.get().getCurrentUrl());
        String expPageName = "Your Order Has Been Placed!";
        String actPageName = checkoutPage.pageName_text.getText();
        Assert.assertEquals(expPageName, actPageName);
    }
}
