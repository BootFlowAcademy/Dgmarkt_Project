package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HealthBeautyPage;
import com.dgmarkt.pages.HomePage;
import com.dgmarkt.pages.SortByPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Us_17_SortByFunction_StepDef {

    SortByPage sortByPage = new SortByPage();
    Select sortBySelect = new Select(sortByPage.sortBy_select);

    @When("The user hovers the the category tab")
    public void the_user_hovers_the_the_category_tab() {
        BrowserUtils.hover(sortByPage.category_btn);
    }
    @Then("Verify that the sortby is displayed and selected default")
    public void verify_that_the_sortby_is_displayed_and_selected_default() {
        Assert.assertTrue(sortByPage.sortBy_select.isDisplayed());
        String actSelect = sortBySelect.getFirstSelectedOption().getText();
        Assert.assertEquals("Default", actSelect);
    }

    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.get());
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();

    @When("The user select a category.")
    public void the_user_select_a_category() {
        actions.moveToElement(homePage.category_btn).perform();
        homePage.goToCategory_mtd();
    }

    @And("The user look at the \"Sort By\" tab.")
    public void the_user_look_at_the_sort_by_tab() {
        actions.moveToElement(sortByPage.sortBy_btn).perform();
    }

    @Then("The user clicks on all the options in the sort by tab in turn.")
    public void the_user_clicks_on_all_the_options_in_the_sort_by_tab_in_turn() {
       // WebElement tabElement = driver.findElement(By.id("input-sort"));
       // tabElement.click();
    }

    @And("Verify that you can view all products in the correct order.")
    public void verify_that_you_can_view_all_products_in_the_correct_order() {
    }
}
