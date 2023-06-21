package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_06_WishlistFunction_StepDefs {
    HomePage homePage = new HomePage();
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    WishListPage wishListPage = new WishListPage();
    @When("The user navigates to Health & Beauty category")
    public void theUserNavigatesToHealthBeautyCategory() {homePage.goToCategory_mtd();
    }
    @And("The user adds products to the wish list")
    public void theUserAddsProductsToTheWishList() {
        healthBeautyPage.addToWish_mtd();
    }
    @When("The user navigates to My Wish List page using Wish Icon")
    public void theUserNavigatesToMyWishListPageUsingWishIcon() {
        wishListPage.goToWishPage_mtd();
    }
    @Then("Verify that the user can see {string} and {string} on the wish list")
    public void verifyThatTheUserCanSeeAndOnTheWishList(String item1, String item2) {
        wishListPage.verifyProductsVisible_mtd(item1,item2);
    }
    @When("The user adds first item to cart using Add to Cart button")
    public void theUserAddsFirstItemToCartUsingAddToCartButton() {
        wishListPage.item1_addToCartBtn.click();
    }
    @Then("Verify that the user gets {string} pop up")
    public void verifyThatTheUserGetsPopUp(String expectedMsg) {
        wishListPage.verifyPopUp_mtd(expectedMsg);
    }
    @When("The user adds second item to cart using Add to cart Button")
    public void theUserAddsSecondItemToCartUsingAddToCartButton() {
        BrowserUtils.scrollToElement(wishListPage.item2_addToCartBtn);
        wishListPage.item2_addToCartBtn.click();
    }
    @Then("Verify that the user sees the products in the Cart")
    public void verifyThatTheUserSeesTheProductsInTheCart() {
        wishListPage.verifyCart_mtd();
        wishListPage.emptyCart_mtd();
    }
    @When("The user removes the first item using Remove button")
    public void theUserRemovesTheFirstItemUsingRemoveButton() {
        wishListPage.item1_removeBtn.click();
    }
    @Then("Verify the user sees {string} alert")
    public void verifyTheUserSeesAlert(String expectedText) {
        wishListPage.verifyModified_mtd(expectedText);
    }
    @When("The user removes the second item using Remove button")
    public void theUserRemovesTheSecondItemUsingRemoveButton() {
        wishListPage.item2_removeBtn.click();
    }
    @Then("Verify the wish list is empty and the user sees {string} text")
    public void verifyTheWishListIsEmptyAndTheUserSeesText(String expectedText) {
        wishListPage.verifyEmptyText_mtd(expectedText);
    }
}
