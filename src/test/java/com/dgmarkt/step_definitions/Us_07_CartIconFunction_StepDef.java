package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.BasePage;
import com.dgmarkt.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_07_CartIconFunction_StepDef {
    CartPage cartPage = new CartPage();
    @When("The user clicks cart icon button")
    public void the_user_clicks_cart_icon_button() {
        Assert.assertFalse("Product list shouldn't be display!", cartPage.cartProduct_list.isDisplayed());
        cartPage.cartIcon_btn.click();
    }
    @Then("Verify that added product list is displayed")
    public void verify_that_added_product_list_is_displayed() {
        Assert.assertTrue("Product list should be display!", cartPage.cartProduct_list.isDisplayed());
    }
}
