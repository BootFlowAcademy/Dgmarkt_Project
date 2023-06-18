package com.dgmarkt.step_definitions;


import com.dgmarkt.pages.OrderHistoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Us_12_MyAccountOrderHistory {
    OrderHistoryPage orderHistoryPage =new OrderHistoryPage();

    @Given("The user navigate to order history page")
    public void the_user_navigate_to_order_history_page() {
        orderHistoryPage.orderHistory_btn.click();
    }
    @When("Verify that the user order {string} history")
    public void verify_that_the_user_order_history(String string) {

    }

}
