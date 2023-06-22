package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.HomePage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Us_13_CategoryFunction_StepDef {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.get());
    @When("The user hovers the cursor over the category tab")
    public void the_user_hovers_the_cursor_over_the_category_tab() {
        Assert.assertFalse(homePage.categorySubMenu_DropDown.isDisplayed());
        BrowserUtils.waitFor(2);
        actions.moveToElement(homePage.category_btn).perform();//Bu metod Category sekmesinde  HoverOver yapar.

    }
    @Then("Verify that the sees  Sub-Category tabs under the Category Module")
    public void verify_that_the_sees_sub_category_tabs_under_the_category_module() {
        Assert.assertTrue(homePage.categorySubMenu_DropDown.isDisplayed());
    }
    @Given("The user click the Category")
    public void the_user_click_the_category() {
        homePage.category_btn.click();
    }
    @Then("Verify that the user is on Category Module")
    public void verify_that_the_user_is_on_category_module() {
        String expectedUrl = "https://dgmarkt.com/Category";
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Then("Verify that the user is on {string}")
    public void verify_that_the_user_is_on(String categoryName) {
        Assert.assertEquals(categoryName, homePage.pageName_text.getText());
    }
}
