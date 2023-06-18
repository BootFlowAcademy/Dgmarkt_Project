package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends BasePage{
    @FindBy(id = "wishlist-total")
    public WebElement wishlistBtn;
    @FindBy(xpath = "//tbody/tr[2]/td/a[.='BaByliss 3663U - Hair rollers']")
    public WebElement item1_productName;
    @FindBy(xpath = "//tbody/tr[1]/td/a[.='Capsule Plate 6pcs']")
    public WebElement item2_productName;
    @FindBy(xpath = "//*[@onclick=\"cart.add('5720397');\"]")
    public WebElement item2_addToCartBtn;
    @FindBy(xpath = "//*[@onclick=\"cart.add('7064674');\"]")
    public WebElement item1_addToCartBtn;
    @FindBy(xpath = "//a[contains(@href,'remove=5720397')]")
    public WebElement item2_removeBtn;
    @FindBy(xpath = "//a[contains(@href,'remove=7064674')]")
    public WebElement item1_removeBtn;
    @FindBy(css = "#cart")
    public WebElement cart_btn;
    @FindBy(className = "alert alert-success alert-dismissible")
    public WebElement modifiedAlert_msg;
    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement alert_popUp;
    @FindBy(xpath = "//button[@data-dismiss=\"alert\"]")
    public WebElement popUp_closeBtn;
    @FindBy(xpath = "//*[.='Your wish list is empty.']")
    public WebElement wishEmpty_text;
    @FindBy(xpath = "//*[@id=\"cart\"]//a[text()='Capsule Plate 6pcs']")
    public WebElement item1_dropCartName;
    @FindBy(xpath = "//*[@id=\"cart\"]//a[text()='BaByliss 3663U - Hair rollers']")
    public WebElement item2_dropCartName;
    public void goToWishPage_mtd(){
        BrowserUtils.scrollToElement(wishlist_Btn);
        BrowserUtils.waitForClickablility(wishlist_Btn,3).click();
    }
    public void verifyProductsVisible_mtd(String item1,String item2){
        Assert.assertTrue(item1_productName.isDisplayed());
        Assert.assertTrue(item2_productName.isDisplayed());
        Assert.assertEquals(item1_productName.getText(),item1);
        Assert.assertEquals(item2_productName.getText(),item2);
    }
    public void verifyPopUp_mtd(String expectedMsg){
        System.out.println("alert_popUp.getText() = " + alert_popUp.getText());
        Assert.assertTrue(alert_popUp.getText().contains(expectedMsg));
        popUp_closeBtn.click();
    }
    public void verifyCart_mtd(){
        BrowserUtils.scrollToElement(cart_btn);
        cart_btn.click();
        Assert.assertTrue(item1_dropCartName.isDisplayed());
        Assert.assertTrue(item2_dropCartName.isDisplayed());
    }
}
