package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetworkingPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networking_loc;
    @FindBy(xpath = "//button[text()='×']")
    public WebElement addCartSuccessMsgClose_btn;

    public void addToCartByProductName_mtd(String productName){ // bu metod Networking sayfasında ürün-isim parametresi ile ürünün sepete eklenmesini sağlar
        WebElement productName_Box = Driver.get().findElement(By.xpath("//a[text()='"+productName+"']/../.."));
        WebElement addToCart_BtnOfProduct = Driver.get().findElement(By.xpath("//a[text()='"+productName+"']/../..//button"));
        BrowserUtils.hover(productName_Box);
        addToCart_BtnOfProduct.click();
        Alert alert=Driver.get().switchTo().alert();
        alert.accept();
    }
}
