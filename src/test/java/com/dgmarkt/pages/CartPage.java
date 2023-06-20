package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CartPage extends BasePage{
    @FindBy(xpath = "(//span[@class='input-group-btn'])[1]/button[2]")
    public WebElement removeFirstProductFromCart_btn;
    @FindBy(xpath = "//a[text()='Checkout']")
    public WebElement checkOut_btn;
    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]")
    public WebElement totalPrice;
    public void removeAllProductfromCart(){ //Sepet sayfasındaki ürünlari tek tek siler
        int numberofProduct = numberOfProductInCartList_mtd();
        for (int i = 0; i < numberofProduct; i++) {
            removeFirstProductFromCart_btn.click();
            BrowserUtils.waitFor(2);
        }
    }
    public int numberOfProductInCartList_mtd(){ //Sepet sayfasında bulunan ürün çeşitlerinin sayısını verir
       List<WebElement> allProductRowInCartList = Driver.get().findElements(By.xpath("(//table)[3]/tbody/tr"));
        return allProductRowInCartList.size();
    }

}
