package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.SearchIconPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Us_05_SearchIconFunction_StepDef   {
    SearchIconPage searchIconPage=new SearchIconPage();
    @When("The user clicks search button")
    public void the_user_clicks_search_button() {
        searchIconPage.searchIconFunction.click();
    }
    @When("The user enters {string} in search button")
    public void the_user_enters_in_search_button(String searchword) {
        searchIconPage.searchBox_text.sendKeys(searchword);
        searchIconPage.startSearch_btn.click();
    }
    @Then("Verify that  user confirms that they see the product they are looking for {string}")
    public void verify_that_user_confirms_that_they_see_the_product_they_are_looking_for(String word) {
      String expWord = word.toUpperCase();
      String productName = searchIconPage.firstProductName_text.getText();
        Assert.assertTrue(productName.contains(expWord));
    }
}
