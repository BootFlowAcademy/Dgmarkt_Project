package com.dgmarkt.step_definitions;


import com.dgmarkt.pages.OrderHistoryPage;
import com.dgmarkt.pages.OrderInformationPage;
import com.dgmarkt.pages.ProductReturnsPage;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class Us_12_MyAccountOrderHistory {
    OrderHistoryPage orderHistoryPage = new OrderHistoryPage();
    OrderInformationPage orderInformationPage = new OrderInformationPage();
    ProductReturnsPage productReturnsPage = new ProductReturnsPage();
    @Given("The user navigate to order history page")
    public void the_user_navigate_to_order_history_page() {
        orderHistoryPage.orderHistory_btn.click();
    }
    @When("The user should be able to see order history page")
    public void the_user_should_be_able_to_see_order_history_page() {
        Assert.assertTrue("Order history page must be visible",orderHistoryPage.orderHistory_head.isDisplayed());
    }
    @Given("The user should be able to click on view icon")
    public void the_user_should_be_able_to_click_on_view_icon() {
        orderHistoryPage.orderView2_btn.click();
    }
    @When("The user should be able to see order details")
    public void the_user_should_be_able_to_see_order_details() {
        String orderDate ="08/06/2023";
        Assert.assertEquals(orderDate,orderInformationPage.orderDateText_txt.getText());
    }
    @When("The user should be able to clicks reorder icon")
    public void the_user_should_be_able_to_clicks_reorder_icon() {
        orderInformationPage.reOrder_btn.click();
    }
    @Then("Verify that success message and the product is in the shopping cart")
    public void verify_that_success_message_and_the_product_is_in_the_shopping_cart() {
        String expectedText ="Success: You have added C2G audio cable - 5 m to your shopping cart!";
        Assert.assertEquals(expectedText.contains("to your shopping cart"),orderInformationPage.reOrderAddCart_txt.getText().contains("to your shopping cart"));
    }
    @When("The user should be able to return button")
    public void the_user_should_be_able_to_return_button() {
        orderInformationPage.returnPro_btn.click();
    }
    @When("The user should be able to see product returns page")
    public void the_user_should_be_able_to_see_product_returns_page() {
       Assert.assertTrue(productReturnsPage.productReturns_text.isDisplayed());
    }
    @Then("Verify that the id number of the returned product is correct")
    public void verify_that_the_id_number_of_the_returned_product_is_correct() {
    String expectedURL ="https://dgmarkt.com/index.php?route=account/return/add&order_id=314&product_id=15796";
    Assert.assertEquals(expectedURL,Driver.get().getCurrentUrl());
    }
    @When("The user complete the form on the product returns page and clicks submit button")
    public void the_user_complete_the_form_on_the_product_returns_page_and_clicks_submit_button() {
        productReturnsPage.deadOnArrival_btn.click();
        productReturnsPage.returnSubmit_btn.click();
    }
    @Then("The user should be able to see return request message")
    public void the_user_should_be_able_to_see_return_request_message() {
        Assert.assertTrue(productReturnsPage.returnSuc_txt.isDisplayed());
    }
}
