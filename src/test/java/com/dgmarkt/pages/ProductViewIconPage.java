package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.By.xpath;

public class ProductViewIconPage extends BasePage {
    @FindBy(xpath = "//span[text()='Category']/../..")
    public WebElement categoryView_btn;

    public void goToSubCategoryByNameView_mtd(String subCategoryName) {
        WebElement subCategory = Driver.get().findElement(xpath("//a[text()='" + subCategoryName + "']/../.."));
        BrowserUtils.waitFor(2);
        subCategory.click();
    }

    public WebElement clickViewIcon(String view) {
        if (view.equals("List")) {
            return Driver.get().findElement(By.xpath("//button[text()='3']/../button[6]"));
        } else {
            return Driver.get().findElement(By.xpath("//button[text()='" + view + "']"));
        }
    }
}
