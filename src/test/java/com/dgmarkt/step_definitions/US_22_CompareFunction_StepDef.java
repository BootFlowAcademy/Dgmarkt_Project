package com.dgmarkt.step_definitions;

import com.dgmarkt.pages.ComparisonPage;
import com.dgmarkt.pages.WishListPage;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class US_22_CompareFunction_StepDef {
    ComparisonPage comparisonPage=new ComparisonPage();
      public void addProductToCompareBox_mtd() {
            for (int j = 1; j < 7; j++) {
                BrowserUtils.waitFor(2);
                WebElement compareHover = Driver.get().findElement(By.xpath("(//button[@title='Add to Wish List'])["+j+"]/../../.."));
                BrowserUtils.waitFor(2);
                WebElement compareProductToClick = Driver.get().findElement(By.xpath("(//button[@class='button-compare'])["+j+"]"));
                BrowserUtils.waitFor(2);
                BrowserUtils.hoverAndClick(compareHover,compareProductToClick);
               // wishproductToClick.click();
               // BrowserUtils.waitFor(1);
                WebElement compareButtonMsgClose = Driver.get().findElement(By.xpath("//button[@data-dismiss='alert']"));
                BrowserUtils.waitFor(2);
                compareButtonMsgClose.click();
            }
        }
    @When("The user clicks on {string}, Verify that the user sees {string} and scrolls down.")
    public void the_user_clicks_on_verify_that_the_user_sees_and_scrolls_down(String CategoryName, String CategoryNameText) {


          Driver.get().findElement(By.xpath("(//a[text()='" + CategoryName + "'])[1]")).click();
          String categoryText = Driver.get().findElement(By.xpath("(//*[text()='" + CategoryNameText + "'])[4]")).getText();
          assertEquals(CategoryNameText, categoryText);
          //comparisonPage.compare4Product.click();
          JavascriptExecutor js = (JavascriptExecutor) Driver.get();
          WebElement CategorytoTextScroll = Driver.get().findElement(By.xpath("(//h3[text()='Categories'])[2]"));
          js.executeScript("arguments[0].scrollIntoView(true);", CategorytoTextScroll);
          BrowserUtils.waitFor(2);


    }
    @Then("The user adds eight products every category to the compare list")
    public void theUserAddsEightProductsEveryCategoryToTheCompareList() {
          addProductToCompareBox_mtd();
    }

    @And("The user verifies contents of the compare box")
    public void theUserVerifiesContentsOfTheCompareBox() {
        BrowserUtils.waitFor(2);
        String compareBox_btnText = comparisonPage.compareTotalProduct.getText();
        assertEquals("Product Compare (4)",compareBox_btnText);

    }
    @Then("The user sees four products in the compare box")
    public void theUserSeesFourProductsInTheCompareBox() {
        BrowserUtils.waitFor(2);
        comparisonPage.compareTotalProduct.click();
    }
}
