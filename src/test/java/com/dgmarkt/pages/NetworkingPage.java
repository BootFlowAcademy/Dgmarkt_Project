package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NetworkingPage extends BasePage {
    Actions actions = new Actions(Driver.get());
    @FindBy(xpath = "(//a[text()='Networking'])[1]")
    public WebElement networking_loc;
    public void addToCartByProductName_mtd(String productName) { // bu metod Networking sayfasında ürün-isim parametresi ile ürünün sepete eklenmesini sağlar
        WebElement productName_Box = Driver.get().findElement(By.xpath("//div[@class='caption']//a[text()='" + productName + "']/../../.."));
        actions.moveToElement(productName_Box);
        WebElement addToCart_BtnOfProduct = Driver.get().findElement(By.xpath("//div[@class='caption']//a[text()='" + productName + "']/../..//button"));
        BrowserUtils.waitFor(1);
        addToCart_BtnOfProduct.click();    }
    @FindBy(xpath = "//button[@onclick=\"wishlist.add('7463434');\"]")
    public WebElement item5_addToWishBtn;
    @FindBy(xpath = "(//a[text()='Networking'])[2]")
    public WebElement networking2_loc;
}