package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.WishListPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US_06_WishlistFunction_StepDefs {
    HomePage homePage = new HomePage();
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    WishListPage wishListPage = new WishListPage();
    @When("The user navigates to Health & Beauty category")
    public void theUserNavigatesToHealthBeautyCategory() {
        homePage.goToCategory_mtd();
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
}
