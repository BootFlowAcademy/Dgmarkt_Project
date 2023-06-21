package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Us_18_ShowFunction_StepDef {
    ShowNumberSelectPage showNumberSelectPage = new ShowNumberSelectPage();
    @When("The user clicks {string} button")
    public void the_user_clicks_button(String subcategory) {
        Driver.get().findElement(By.xpath("(//a[text()='" + subcategory + "'])[1]")).click();
    }
    @When("Verify that the Show: tab initially shows {string} in subcategory")
    public void verify_that_the_show_tab_initially_shows_in_subcategory(String defaultNumber) {
        showNumberSelectPage.showDefaultNumberSelect_mtd(defaultNumber);
    }
    @Then("The user can replace the Show: tab with listOfNumber in subcategory")
    public void the_user_can_replace_the_show_tab_with_list_of_number_in_subcategory(List<String> listOfNumber)  {
        showNumberSelectPage.setShowNumberReplace_mtd(listOfNumber);
    }
}








