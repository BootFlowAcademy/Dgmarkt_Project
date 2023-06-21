package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickViewIconPage extends BasePage {

    @FindBy(xpath = "(//button[@class=\"button-quickview\"])[9]")
    public WebElement quickViewIcon;

    @FindBy(xpath = "(//a[text()='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer'])[2]") //*3
    public WebElement quickViewProduct_txt;

   @FindBy(xpath = "//button[@onclick=\"addCompare('7487326');\"]") //*3- 3 ürünün wish buttonu çağrılacak.
public WebElement quickViewCompare_btn;

   @FindBy(xpath = "//button[text()='Add to Cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//input[@name='quantity']")
    public WebElement quantityBox_txt;

    @FindBy(xpath = "(//button[@class='button-quickview'])[1]")
    public WebElement quickViewIcon2;

    @FindBy(xpath = "(//button[@class='button-quickview'])[6]")
    public WebElement quickViewIcon3;

    @FindBy(xpath = "//a[@class=\"a-qv-close\"]")
    public WebElement quickViewPopUpClose_btn;



}