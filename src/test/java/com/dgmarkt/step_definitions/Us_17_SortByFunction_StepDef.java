package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.SortByPage;
import com.dgmarkt.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Us_17_SortByFunction_StepDef {

    SortByPage sortByPage = new SortByPage();
    Select sortBySelect = new Select(sortByPage.sortBy_select);

    @Then("Verify that the sortby is displayed and selected default")
    public void verify_that_the_sortby_is_displayed_and_selected_default() {
        Assert.assertTrue(sortByPage.sortBy_select.isDisplayed());
        String actSelect = sortBySelect.getFirstSelectedOption().getText();
        Assert.assertEquals("Default", actSelect);
    }

    @When("The user selects sort type by {string}")
    public void the_user_selects_sort_type_by(String typeOfSort) {
        sortBySelect.selectByVisibleText(typeOfSort);
        BrowserUtils.waitFor(2);
    }
    @Then("Verify that the products are sorted by Name \\(A-Z)")
    public void verify_that_the_products_are_sorted_by_name_a_z() {
        Assert.assertTrue(sortByPage.namesAndModelsOfProductsOrdered_mtd());
    }

    @Then("Verify that the products are sorted by Name \\(Z-A)")
    public void verify_that_the_products_are_sorted_by_name_z_a() {
        Assert.assertFalse(sortByPage.namesAndModelsOfProductsOrdered_mtd());
    }

    @Then("Verify that the products are sorted by Price \\(Low-High)")
    public void verify_that_the_products_are_sorted_by_price_low_high() {
        Assert.assertTrue(sortByPage.priceOfProductsIsOrdered_mtd());
    }

    @Then("Verify that the products are sorted by Price \\(High-Low)")
    public void verify_that_the_products_are_sorted_by_price_high_low() {
       Assert.assertFalse(sortByPage.priceOfProductsIsOrdered_mtd());
    }

    @Then("Verify that the products are sorted by Model \\(A-Z)")
    public void verify_that_the_products_are_sorted_by_model_a_z() {
        Assert.assertTrue(sortByPage.namesAndModelsOfProductsOrdered_mtd());
    }
    @Then("Verify that the products are sorted by Model \\(Z-A)")
    public void verify_that_the_products_are_sorted_by_model_z_a() {
        Assert.assertFalse(sortByPage.namesAndModelsOfProductsOrdered_mtd());
    }
}
