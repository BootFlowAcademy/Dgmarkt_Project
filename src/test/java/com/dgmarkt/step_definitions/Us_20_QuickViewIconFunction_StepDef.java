package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Us_20_QuickViewIconFunction_StepDef {
    HealthBeautyPage healthBeautyPage=new HealthBeautyPage();
    Actions actions=new Actions(Driver.get());
    WishListPage wishListPage=new WishListPage();
    TelevisionsPage televisionsPage=new TelevisionsPage();
    TVAccessoriesPage tvAccessoriesPage=new TVAccessoriesPage();
    NetworkingPage networkingPage=new NetworkingPage();
    QuickViewIconPage quickViewIconPage = new QuickViewIconPage();


    @When("The user scroll down until NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER and clicked quick view icon")
    public void the_user_scroll_down_until_nıcky_clarke_nhd146_haır_therapy_touch_control_haır_dryer_and_clicked_quick_view_icon() {
        WebElement element = Driver.get().findElement(By.xpath("(//a[@href='https://dgmarkt.com/index.php?route=product/product&path=62&product_id=7487326'])[1]"));
        // JavascriptExecutor'ı kullanarak sayfayı öğeye kaydırın
        BrowserUtils.waitFor(1);
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        BrowserUtils.waitFor(1);
        actions.moveToElement(element).perform();
        quickViewIconPage.quickViewIcon.click();

    }
    @Then("Verify the user should see the product page")
    public void verify_the_user_should_see_the_product_page() {
    assertEquals("NICKY CLARKE NHD146 HAIR THERAPY TOUCH CONTROL HAIR DRYER", quickViewIconPage.quickViewProduct_txt.getText());
        System.out.println("quickViewIconPage.quickViewProduct_txt.getText() = " + quickViewIconPage.quickViewProduct_txt.getText());
BrowserUtils.waitFor(2);
    }
    @Given("The user clicks the Add to Wish List Icon")
    public void the_user_clicks_the_add_to_wish_list_ıcon() {
    healthBeautyPage.item3_addToWishBtn.sendKeys(Keys.ENTER);
    }

    @Given("The user clicks the compare this product Icon")
    public void the_user_clicks_the_compare_this_product_ıcon() {

    }
    @When("The product should be added to product comparison!")
    public void the_product_should_be_added_to_product_comparison() {

    }
    @Given("The user clicks the Add to cart Icon")
    public void the_user_clicks_the_add_to_cart_ıcon() {

    }
    @When("The product should be added to cart")
    public void the_product_should_be_added_to_cart() {

    }
    @Given("The user clicks the quantity box")
    public void the_user_clicks_the_quantity_box() {

    }
    @When("The user fills in the quantity box to increase the number of products")
    public void the_user_fills_in_the_quantity_box_to_increase_the_number_of_products() {

    }
    @Then("The updated quantity should be reflected in the cart")
    public void the_updated_quantity_should_be_reflected_in_the_cart() {

    }
    @When("The user scroll down until CELLO C1920FS 19\" LED-BACKLIT LCD TV and clicked quick view icon")
    public void the_user_scroll_down_until_cello_c1920fs_led_backlıt_lcd_tv_and_clicked_quick_view_icon()
    {

    }
    @When("The user scroll down until BELKIN ADAPTER CABLE and clicked quick view icon")
    public void the_user_scroll_down_until_belkın_adapter_cable_and_clicked_quick_view_icon() {

    }
    @When("The user scroll down until BELKIN - NETWORK DEVICE MOUNTING BRACKET and clicked quick view icon")
    public void the_user_scroll_down_until_belkın_network_devıce_mountıng_bracket_and_clicked_quick_view_icon() {

    }

}