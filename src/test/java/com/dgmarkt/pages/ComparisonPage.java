package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends BasePage {
    @FindBy(xpath = "//a[@class='btn btn-link']")
    public WebElement compareTotalProduct;
    @FindBy(xpath = "//h1[text()='Product Comparison']")
    public WebElement comparisonPage_text;
    @FindBy(xpath = "//strong[text()='Product Details']")
    public WebElement product_detail_loc;
    @FindBy(xpath = "//td[text()='BaByliss 3663U - Hair rollers']")
    public WebElement item1Health_loc;
    @FindBy(xpath = "//td[text()='Capsule Plate 6pcs']")
    public WebElement item2Health_loc;
    @FindBy(xpath = "(//input[@class=\"btn btn-primary btn-block\"])[1]")
    public WebElement item1Health_addToCartBtn;
    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement shoppingCart_loc;
    @FindBy(xpath = "(//a[@class=\"btn btn-danger btn-block\"])[1]")
    public WebElement item1Health_RemoveToCartBtn;


}



