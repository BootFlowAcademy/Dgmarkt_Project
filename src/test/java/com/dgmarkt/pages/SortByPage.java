package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import com.google.common.collect.Ordering;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class SortByPage extends BasePage {

    @FindBy(xpath = "//select[@id='input-sort']")
    public WebElement sortBy_select;


    public boolean namesAndModelsOfProductsOrdered_mtd() {
        String name = "";
        List<String> namesAndModels = new ArrayList<>();
        WebElement webElement;
        for (int i = 1; i < 13; i++) {
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("(//div[@class='caption']//h4)[" + i + "]")));
            webElement = Driver.get().findElement(By.xpath("(//div[@class='caption']//h4)[" + i + "]"));
            name = webElement.getText();
            namesAndModels.add(i - 1, name);
        }
        return Ordering.natural().isOrdered(namesAndModels);
    }
    public boolean priceOfProductsIsOrdered_mtd() {
        String price = "";
        List<String> allPrice = new ArrayList<>();
        WebElement webElement;
        for (int i = 1; i < 13; i++) {
            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath("(//div[@class='caption']//h4)[" + i + "]")));
            webElement = Driver.get().findElement(By.xpath("(//div[@class='caption']//p[@class='price'])[" + i + "]"));
            price = webElement.getText();
            allPrice.add(i - 1, price);
        }
        return Ordering.natural().isOrdered(allPrice);
    }


}
