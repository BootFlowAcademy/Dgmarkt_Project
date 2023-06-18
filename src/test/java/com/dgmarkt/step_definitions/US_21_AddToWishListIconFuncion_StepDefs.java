package com.dgmarkt.step_definitions;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class US_21_AddToWishListIconFuncion_StepDefs {

    String[] CategoryName = {"Health & Beauty", "Televisions", "TV Accessories", "Networking"};

    public void addProductToWishList_mtd() {
            for (int j = 1; j < 7; j++) {
                WebElement producthover = Driver.get().findElement(By.xpath("(//button[@title='Add to Wish List'])["+j+"]/../../.."));
                BrowserUtils.waitFor(2);
                WebElement wishproductToClick = Driver.get().findElement(By.xpath("(//button[@title='Add to Wish List'])[" + j + "]"));
                BrowserUtils.waitFor(2);
                BrowserUtils.hoverAndClick(producthover,wishproductToClick);
               // wishproductToClick.click();
               // BrowserUtils.waitFor(1);
                WebElement wishbuttonmsgclose = Driver.get().findElement(By.xpath("//button[@data-dismiss='alert']"));
                BrowserUtils.waitFor(2);
                wishbuttonmsgclose.click();

            }
        }


    @When("The user clicks on {string} and Verify that the user sees {string} and scrolls down")
    public void the_user_clicks_on_and_verify_that_the_user_sees_and_scrolls_down(String CategoryName, String CategoryNameText) {

          Driver.get().findElement(By.xpath("(//a[text()='" + CategoryName + "'])[1]")).click();
          String categoryText = Driver.get().findElement(By.xpath("(//*[text()='" + CategoryNameText + "'])[4]")).getText();
          assertEquals(CategoryNameText, categoryText);
          JavascriptExecutor js = (JavascriptExecutor) Driver.get();
          WebElement CategorytoTextScroll = Driver.get().findElement(By.xpath("(//h3[text()='Categories'])[2]"));
          js.executeScript("arguments[0].scrollIntoView(true);", CategorytoTextScroll);
          BrowserUtils.waitFor(2);
    }

    @Then("The user adds six products every category to the wish list")
    public void theUserAddsSixProductsEveryCategoryToTheWishList() {
        addProductToWishList_mtd();
    }
}
