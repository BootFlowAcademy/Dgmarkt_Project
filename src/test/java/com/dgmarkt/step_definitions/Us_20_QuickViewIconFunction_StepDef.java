package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Us_20_QuickViewIconFunction_StepDef {
    HealthBeautyPage healthBeautyPage = new HealthBeautyPage();
    Actions actions = new Actions(Driver.get());
    TelevisionsPage televisionsPage = new TelevisionsPage();
    TVAccessoriesPage tvAccessoriesPage = new TVAccessoriesPage();
    QuickViewIconPage quickViewIconPage = new QuickViewIconPage();

    @When("The user scroll down until NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER and clicked quick view icon")
    public void the_user_scroll_down_until_nicky_clarke_nhd146_hair_therapy_touch_control_hair_dryer_and_clicked_quick_view_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=62&product_id=7487326'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        quickViewIconPage.quickViewIcon.click();
    }

    @When("The user clicks the Add to cart Icon")
    public void the_user_clicks_the_add_to_cart_icon() {
        BrowserUtils.waitFor(2);
        quickViewIconPage.addToCartButton.click();
    }

    @When("The user clicks the quantity box")
    public void the_user_clicks_the_quantity_box() {
        quickViewIconPage.quantityBox_txt.clear();
    }

    @When("The user fills in the quantity box to increase the number of products")
    public void the_user_fills_in_the_quantity_box_to_increase_the_number_of_products() {
        quickViewIconPage.quantityBox_txt.sendKeys("2");
        BrowserUtils.waitFor(1);
        quickViewIconPage.addToCartButton.click();
        BrowserUtils.waitFor(2);
    }

    @When("The user closes the product popup page")
    public void the_user_closes_the_product_popup_page() {
        quickViewIconPage.quickViewPopUpClose_btn.click();
    }

    @When("The user scroll down until CELLO C1920FS 19\" LED-BACKLIT LCD TV and clicked quick view icon")
    public void the_user_scroll_down_until_cello_c1920fs_led_backlit_lcd_tv_and_clicked_quick_view_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=60&product_id=7403979'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        quickViewIconPage.quickViewIcon2.click();
    }

    @When("The user scroll down until BELKIN ADAPTER CABLE and clicked quick view icon")
    public void the_user_scroll_down_until_belkin_adapter_cable_and_clicked_quick_view_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=61&product_id=2541827'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        quickViewIconPage.quickViewIcon2.click();
    }

    @When("The user scroll down until BELKIN - NETWORK DEVICE MOUNTING BRACKET and clicked quick view icon")
    public void the_user_scroll_down_until_belkin_network_device_mounting_bracket_and_clicked_quick_view_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=59&product_id=7463434'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        quickViewIconPage.quickViewIcon3.click();
    }

    @Then("Verify the user should see the first product page")
    public void verify_the_user_should_see_the_first_product_page() {
        assertEquals("NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER", quickViewIconPage.quickViewProduct_txt.getText());
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the first product Add to Wish List Icon")
    public void the_user_clicks_the_first_product_add_to_wish_list_icon() {
        healthBeautyPage.item3_addToWishBtn.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the compare this first product Icon")
    public void the_user_clicks_the_compare_this_first_product_icxvvvon() {
        quickViewIconPage.quickViewCompare_btn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify the user should see the second product page")
    public void verify_the_user_should_see_the_second_product_page() {
        assertEquals("CELLO C1920FS 19\" LED-BACKLIT LCD TV", quickViewIconPage.secondProductWish_btn.getText());
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the second product Add to Wish List Icon")
    public void the_user_clicks_the_second_product_add_to_wish_list_icon() {
        televisionsPage.item4_addToWishBtn.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the compare this second product Icon")
    public void the_user_clicks_the_compare_this_second_product_icon() {
        quickViewIconPage.secondProductCompare_btn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify the user should see the third product page")
    public void verify_the_user_should_see_the_third_product_page() {
        assertEquals("BELKIN ADAPTER CABLE", quickViewIconPage.thirdProductVerify_txt.getText());
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the third product Add to Wish List Icon")
    public void the_user_clicks_the_third_product_add_to_wish_list_icon() {
        tvAccessoriesPage.item5_addToWishBtn.sendKeys(Keys.ENTER);
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the compare this third product Icon")
    public void the_user_clicks_the_compare_this_third_product_icon() {
        quickViewIconPage.thirdProductCompare_btn.click();
        BrowserUtils.waitFor(2);
    }

    @Then("Verify the user should see the fourth product page")
    public void verify_the_user_should_see_the_fourth_product_page() {
        assertEquals("BELKIN - NETWORK DEVICE MOUNTING BRACKET", quickViewIconPage.fourthProductVerify_txt.getText());
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the fourth product Add to Wish List Icon")
    public void the_user_clicks_the_fourth_product_add_to_wish_list_icon() {
        quickViewIconPage.fourthProductWish_btn.click();
        BrowserUtils.waitFor(2);
    }

    @When("The user clicks the compare this fourth product Icon")
    public void the_user_clicks_the_compare_this_fourth_product_icon() {
        quickViewIconPage.fourthProductCompare_btn.click();
        BrowserUtils.waitFor(2);
    }
}