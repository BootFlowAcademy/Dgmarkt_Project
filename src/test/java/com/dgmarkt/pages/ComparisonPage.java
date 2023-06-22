package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends BasePage {
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
    @FindBy(xpath = "(//span[@class='txt-count'])[1]")
    public WebElement wishlistindex_Btn;

    @FindBy(xpath = "//a[contains(@href,'remove=7064674')]")
    public WebElement item1_removeBtn;
    @FindBy(css = "#cart")
    public WebElement cart_btn;
    @FindBy(xpath = "//i[@class='fa fa-times']")
    public WebElement wishlistremove_btn;
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement modifiedAlert_msg;
    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement alert_popUp;
    @FindBy(xpath = "//button[@data-dismiss=\"alert\"]")
    public WebElement popUp_closeBtn;
    @FindBy(xpath = "//a[@class='a-close-newsletter']")
    public WebElement newsletter_closeBtn;
    @FindBy(xpath = "//*[.='Your wish list is empty.']")
    public WebElement wishEmpty_text;
    @FindBy(xpath = "//*[@id=\"cart\"]//a[text()='Capsule Plate 6pcs']")
    public WebElement item1_dropCartName;
    @FindBy(xpath = "//*[@id=\"cart\"]//a[text()='BaByliss 3663U - Hair rollers']")
    public WebElement item2_dropCartName;
    @FindBy(xpath = "//button//i[@class='icon-rt-close-circle-outline']")
    public WebElement removeFromCart_btn;
    @FindBy(xpath = "//span[@class='cart-dropdown-menu-close']")
    public WebElement cartMenuClose_btn;
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
        Assert.assertTrue(alert_popUp.getText().contains(expectedMsg));
        popUp_closeBtn.click();
    }
    public void verifyCart_mtd(){
        BrowserUtils.scrollToElement(cart_btn);
        cart_btn.click();
        Assert.assertTrue(item1_dropCartName.isDisplayed());
        Assert.assertTrue(item2_dropCartName.isDisplayed());
        cartMenuClose_btn.click();
    }
    public void verifyModified_mtd(String expectedMsg){
        Assert.assertTrue(modifiedAlert_msg.isDisplayed());
        Assert.assertTrue(modifiedAlert_msg.getText().contains(expectedMsg));
    }
    public void verifyEmptyText_mtd(String expectedText){
        Assert.assertTrue(wishEmpty_text.isDisplayed());
        Assert.assertEquals(wishEmpty_text.getText(),expectedText);
    }
    public void emptyCart_mtd(){
        BrowserUtils.waitForClickablility(cart_btn,3).click();
        BrowserUtils.waitForClickablility(removeFromCart_btn,3).click();
        BrowserUtils.waitFor(1);
        BrowserUtils.waitForClickablility(cart_btn,3).click();
        BrowserUtils.waitForClickablility(removeFromCart_btn,3).click();
    }
    @FindBy(xpath = "(//li[@class='li-top-item left '])[2]")
    public WebElement category2_btn;
    @FindBy(xpath = "(//h4//a[text()='Televisions'])[1]")
    public WebElement television_btn;
    @FindBy(xpath = "(//h4//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessories_btn;
    @FindBy(xpath = "(//a[@href='https://dgmarkt.com/index.php?route=account/wishlist'])[1]")
    public WebElement wishList_btn;
    @FindBy(xpath = "//a[text()='My Wish List']")
    public WebElement wishList_msg;
    @FindBy(xpath = "(//button[@data-original-title='Add to Cart'])[1]")
    public WebElement addToCart_btn;
    @FindBy(xpath = "(//button[@data-original-title='Add to Cart'])[2]")
    public WebElement addToCart2_btn;
    @FindBy(xpath = "(//button[@data-original-title='Add to Cart'])[3]")
    public WebElement addToCart3_btn;
    @FindBy(xpath = "(//button[@data-original-title='Add to Cart'])[4]")
    public WebElement addToCart4_btn;
    @FindBy(xpath = "(//i[@class='icon-rt-close-outline'])[2]")
    public WebElement wishListPageClose_btn;
    @FindBy(xpath = "//strong[text()='Total']")
    public WebElement addToCartVerify_msg;
    @FindBy(xpath = "//a[@data-original-title='Remove']")
    public WebElement remove_btn;
    @FindBy(xpath = "//p[text()='Your wish list is empty.']")
    public WebElement empty_msg;
    @FindBy(xpath ="//a[@class='btn btn-link']")
    public WebElement compareTotalProduct;
    @FindBy(xpath="//button[@data-placement=\"top\"][4]")
    public WebElement compare4Product;
    @FindBy(xpath="//h1[text()='Product Comparison']")
    public WebElement comparisonPage_text;
    @FindBy(xpath="//strong[text()='Product Details']")
    public WebElement product_detail_loc;
    @FindBy(xpath="//td[text()='BaByliss 3663U - Hair rollers']")
    public WebElement item1Health_loc;
    @FindBy(xpath="//td[text()='Capsule Plate 6pcs']")
    public WebElement item2Health_loc;
    @FindBy(xpath="(//input[@class=\"btn btn-primary btn-block\"])[1]")
    public WebElement item1Health_addToCartBtn;
    @FindBy(xpath="//a[text()='shopping cart']")
    public WebElement shoppingCart_loc;
    @FindBy(xpath="(//a[@class=\"btn btn-danger btn-block\"])[1]")
    public WebElement item1Health_RemoveToCartBtn;



}



