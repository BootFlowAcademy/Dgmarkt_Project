package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class CartPage extends BasePage{

    public int numberOfProductInCartList_mtd(){ //Sepet sayfasında bulunan ürün çeşitlerinin sayısını verir
       List<WebElement> allProductRowInCartList = Driver.get().findElements(By.xpath("(//table)[3]/tbody/tr"));
        return allProductRowInCartList.size();
    }
}
