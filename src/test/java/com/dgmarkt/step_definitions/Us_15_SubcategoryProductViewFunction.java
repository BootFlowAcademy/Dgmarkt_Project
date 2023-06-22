package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ProductViewIconPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
public class Us_15_SubcategoryProductViewFunction {

    ProductViewIconPage productViewIconPage=new ProductViewIconPage();
    Actions actions=new Actions(Driver.get());
    @When("The user navigates to sub-category by {string}")
    public void the_user_navigates_to_sub_category_by(String subCatName) {
        BrowserUtils.waitFor(2);
        actions.moveToElement(productViewIconPage.categoryView_btn).perform();
        productViewIconPage.goToSubCategoryByNameView_mtd(subCatName);
    }
    @When("The user click the {string} product view button")
    public void the_user_click_the_product_view_button(String viewType) {
        productViewIconPage.clickViewIcon(viewType).click();
       BrowserUtils.waitFor(2);
    }
    @Then("Verify that the user sees  {string} choose view {string}")
    public void verify_that_the_user_sees_choose_view(String expValue, String viewType) {
       BrowserUtils.scrollToElement(productViewIconPage.clickViewIcon(viewType));
       String actValue=productViewIconPage.clickViewIcon(viewType).getAttribute("class");
       Assert.assertTrue(actValue.contains(expValue));

    }
}
