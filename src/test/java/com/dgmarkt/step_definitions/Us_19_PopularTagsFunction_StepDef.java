package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.CategoryPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class Us_19_PopularTagsFunction_StepDef {

    CategoryPage categoryPage = new CategoryPage();

    @When("The user clicks on {string} and Verify that the user sees {string} and scrolls down")
    public void the_user_clicks_on_and_verify_that_the_user_sees_and_scrolls_down(String CategoryName, String CategoryNameText) {
        Driver.get().findElement(By.xpath("(//a[text()='"+CategoryName+"'])[1]")).click();
        String categoryText = Driver.get().findElement(By.xpath("(//*[text()='"+CategoryNameText+"'])[4]")).getText();
        assertEquals(CategoryNameText,categoryText);
        // WebElement oluşturun
        BrowserUtils.waitFor(1);
        WebElement element = Driver.get().findElement(By.xpath("//*[text()='Popular Tags']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
    }

    @Then("Verify that the user sees Popular Tags")
    public void verify_that_the_user_sees_popular_tags() {
        categoryPage.verifyPopularTags_mtd();
    }

    @When("The user clicks Amazon button and clicks Search button")
    public void the_user_clicks_amazon_button_and_clicks_search_button() {
        categoryPage.amazonTagAndSearch_mtd();
    }

    @Then("Verify that the sees Products meeting the search criteria text")
    public void verify_that_the_sees_products_meeting_the_search_criteria_text() {
        assertEquals("There is no product that matches the search criteria.",categoryPage.productMatches_msg.getText());
    }

    @When("The user clicks the back button and clicks the Apple button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_apple_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.appleTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the IPhone button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_ı_phone_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.iphoneTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the Headphone button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_headphone_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.headphoneTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the Beats button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_beats_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.beatsTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the Bluetooth button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_bluetooth_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.bluetoothTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the Speaker button and clicks Search button")
    public void the_user_clicks_the_back_button_and_clicks_the_speaker_button_and_clicks_search_button() {
        Driver.get().navigate().back();
        categoryPage.speakerTagAndSearch_mtd();
        assertTrue(categoryPage.productMatches_msg.isDisplayed());
    }

    @When("The user clicks the back button and clicks the Bose button and clicks Search button and scrolls down")
    public void the_user_clicks_the_back_button_and_clicks_the_bose_button_and_clicks_search_button_and_scrolls_down() {
        Driver.get().navigate().back();
        categoryPage.boseTagAndSearch_mtd();
        BrowserUtils.waitFor(1);
        WebElement element = Driver.get().findElement(By.xpath("//*[text()='Products meeting the search criteria']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
    }

    @Then("Verify that the sees BOSE CONTROLSPACE WP22B-D DANTE text")
    public void verify_that_the_sees_bose_controlspace_wp22b_d_dante_text() {
        assertEquals("BOSE CONTROLSPACE WP22B-D DANTE",categoryPage.productBoseMatches_msg.getText());
    }
}
