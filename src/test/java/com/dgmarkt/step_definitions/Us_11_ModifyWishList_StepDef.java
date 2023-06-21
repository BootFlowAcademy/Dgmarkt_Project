package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.*;

public class Us_11_ModifyWishList_StepDef {

    HealthBeautyPage healthBeautyPage=new HealthBeautyPage();
    Actions actions=new Actions(Driver.get());
    WishListPage wishListPage=new WishListPage();
    TelevisionsPage televisionsPage=new TelevisionsPage();
    TVAccessoriesPage tvAccessoriesPage=new TVAccessoriesPage();
    NetworkingPage networkingPage=new NetworkingPage();
    @Then("Verify that user have seen Health and Beauty text")
    public void verify_that_user_have_seen_health_and_beauty_text() {
        assertEquals("Health & Beauty", healthBeautyPage.healthAndBeauty_loc.getText());
    }
    @When("The user scroll down until NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER and clicked wish list icon")
    public void the_user_scroll_down_until_nicky_clarke_nhd146_hair_therapy_touch_control_hair_dryer_and_clicked_wish_list_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=62&product_id=7487326'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        healthBeautyPage.item3_addToWishBtn.click();
    }
    @Then("Verify that Success: You have added message")
    public void verify_that_success_you_have_added_message() {
        assertTrue(healthBeautyPage.successToWish_btn.isDisplayed());
        wishListPage.popUp_closeBtn.click();
    }
    @When("The user navigates to Televisions category")
    public void the_user_navigates_to_televisions_category() {
        actions.moveToElement(wishListPage.category2_btn).perform();
        BrowserUtils.waitFor(1);
        wishListPage.television_btn.click();
    }
    @Then("Verify that user have seen Televisions text")
    public void verify_that_user_have_seen_televisions_text() {
        assertEquals("Televisions", televisionsPage.television2_loc.getText());
    }
    @When("The user scroll down until CELLO C1920FS 19\" LED-BACKLIT LCD TV and clicked wish list icon")
    public void the_user_scroll_down_until_cello_c1920fs_led_backlit_lcd_tv_and_clicked_wish_list_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=60&product_id=7403979'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        televisionsPage.item4_addToWishBtn.click();
    }
    @When("The user navigates to TV Accessories category")
    public void the_user_navigates_to_tv_accessories_category() {
        actions.moveToElement(wishListPage.category2_btn).perform();
        BrowserUtils.waitFor(1);
        wishListPage.tvAccessories_btn.click();
    }
    @Then("Verify that user have seen TV Accessories text")
    public void verify_that_user_have_seen_tv_accessories_text() {
        assertEquals("TV Accessories", tvAccessoriesPage.tvAccessories2_loc.getText());
    }
    @When("The user scroll down until BELKIN ADAPTER CABLE and clicked wish list icon")
    public void the_user_scroll_down_until_belkin_adapter_cable_and_clicked_wish_list_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=61&product_id=2541827'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        tvAccessoriesPage.item5_addToWishBtn.click();
    }
    @When("The user navigates to Networking category")
    public void the_user_navigates_to_networking_category() {
        actions.moveToElement(wishListPage.category2_btn).perform();
        BrowserUtils.waitFor(1);
        networkingPage.networking_loc.click();
    }
    @Then("Verify that user have seen Networking text")
    public void verify_that_user_have_seen_networking_text() {
        assertEquals("Networking", networkingPage.networking2_loc.getText());
    }
    @When("The user scroll down until BELKIN - NETWORK DEVICE MOUNTING BRACKET and clicked wish list icon")
    public void the_user_scroll_down_until_belkin_network_device_mounting_bracket_and_clicked_wish_list_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=59&product_id=7463434'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        networkingPage.item5_addToWishBtn.click();
    }
    @When("The user clicked add to wish list icon on Base Page")
    public void the_user_clicked_add_to_wish_list_icon_on_base_page() {
        WebElement element = Driver.get().findElement(By.xpath("//a[@id='wishlist-total']"));
        BrowserUtils.waitFor(1);
        element.click();
    }
    @Then("Verify that user is on the My wish list page")
    public void verify_that_user_is_on_the_my_wish_list_page() {
        assertEquals("My Wish List",wishListPage.wishList_msg.getText());
    }
    @When("The user scrolls down and clicked the first product and add to cart button on Action section")
    public void the_user_scrolls_down_and_clicked_the_first_product_and_add_to_cart_button_on_action_section() {
        WebElement element = Driver.get().findElement(By.xpath("//h2[text()='My Wish List']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        wishListPage.addToCart_btn.click();
        BrowserUtils.waitFor(1);
    }
    @Then("Verify that user can see Success: You have added message")
    public void verify_that_user_can_see_success_you_have_added_message() {
        assertTrue(healthBeautyPage.successToWish_btn.isDisplayed());
        wishListPage.popUp_closeBtn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user clicked the second product and add to cart button on Action section")
    public void the_user_clicked_the_second_product_and_add_to_cart_button_on_action_section() {
        wishListPage.addToCart2_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user clicked the third product and add to cart button on Action section")
    public void the_user_clicked_the_third_product_and_add_to_cart_button_on_action_section() {
        wishListPage.addToCart3_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user clicked the fourth product and add to cart button on Action section")
    public void the_user_clicked_the_fourth_product_and_add_to_cart_button_on_action_section() {
        wishListPage.addToCart4_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user scrolls up and clicked cart icon on the Base Page")
    public void the_user_scrolls_up_and_clicked_cart_icon_on_the_base_page() {
        WebElement element = Driver.get().findElement(By.xpath("//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']"));
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        element.click();
        BrowserUtils.waitFor(1);
    }
    @Then("Verify that added products can be seen by the users on the list")
    public void verify_that_added_products_can_be_seen_by_the_users_on_the_list() {
        assertEquals("Total",wishListPage.addToCartVerify_msg.getText());
        BrowserUtils.waitFor(1);
    }
    @When("The user closes the cart page")
    public void the_user_closes_the_cart_page() {
        wishListPage.wishListPageClose_btn.click();
        BrowserUtils.waitFor(1);
    }
    @Then("Verify that Your wish list is empty. message")
    public void verify_that_your_wish_list_is_empty_message() {
       assertEquals("Your wish list is empty.",wishListPage.empty_msg.getText());
    }
    @When("The user able to remove first products on the Wish list")
    public void the_user_able_to_remove_first_products_on_the_wish_list() {
        WebElement element = Driver.get().findElement(By.xpath("//h2[text()='My Wish List']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        wishListPage.remove_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user able to remove second products on the Wish list")
    public void the_user_able_to_remove_second_products_on_the_wish_list() {
        WebElement element = Driver.get().findElement(By.xpath("//h2[text()='My Wish List']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        wishListPage.remove_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user able to remove third products on the Wish list")
    public void the_user_able_to_remove_third_products_on_the_wish_list() {
        WebElement element = Driver.get().findElement(By.xpath("//h2[text()='My Wish List']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        wishListPage.remove_btn.click();
        BrowserUtils.waitFor(1);
    }
    @When("The user able to remove fourth products on the Wish list")
    public void the_user_able_to_remove_fourth_products_on_the_wish_list() {
        WebElement element = Driver.get().findElement(By.xpath("//h2[text()='My Wish List']"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        wishListPage.remove_btn.click();
        BrowserUtils.waitFor(1);
    }
}