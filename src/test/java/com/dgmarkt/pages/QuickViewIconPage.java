package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewIconPage extends BasePage {

    @FindBy(xpath = "//*[@id="content"]/div/div[2]/div[4]/div/div/div[1]/div/div[2]/div/button[3]")
    public WebElement quickViewIcon;

    @FindBy(xpath = "//*[@id="quickview-content"]/div/div/div[1]")
    public WebElement productIcon_quickview-content;

    quickview kutusundaki  sayı kutusu
    @FindBy(xpath = "//*[@id=\"input-quantity\"]")
    public WebElement input_quantity;

   alternative
    @FindBy(xpath = "//*[@id=\"input-quantity\"]")
    public WebElement quantityquickview-content;


   @FindBy(xpath = "//*[@id="button-cart"]")
    WebElement addToCartButton;

   //başarıyla sepete eklendi

    @FindBy(xpath = "//*[@id=\"quickview-content\"]/div[1]")
    public WebElement getSuccessMessageAddToCart;

    // wishlist  butonu
    @FindBy(xpath = "//*[@id=\"product\"]/div/div/button[1]")
    public WebElement wishList_Btn;

    başarıyla Wishliste eklendi

    FindBy(xpath = "//*[@id="quickview-content"]/div[1]")
    public WebElement getSuccessMessageAddToWishList;


    //comparation

    @FindBy(xpath = "//*[@id="product"]/div/div/button[2]")
            public WebElement comparation_Btn;

    @FindBy(xpath = "//*[@id="quickview-content"]/div[1]")
    public WebElement getGetSuccessMessageAddToProductComparison;




}