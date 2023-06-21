package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthBeautyPage extends BasePage {
    @FindBy(xpath = "(//a[text()='Health & Beauty'])[2]")
    public WebElement healthAndBeauty_loc;
    @FindBy(xpath = "//*[@title='BaByliss 3663U - Hair rollers']")
    public WebElement item1_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('7064674');\"]")
    public WebElement item1_addToWishBtn;
    @FindBy(xpath = "//*[@title='Capsule Plate 6pcs']")
    public WebElement item2_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('5720397');\"]")
    public WebElement item2_addToWishBtn;
    public void addToWish_mtd() {
        scrollToElement(item1_addToWishBtn);
        hoverAndClick(item1_hoverOver, item1_addToWishBtn);
        hoverAndClick(item2_hoverOver, item2_addToWishBtn);    }
    @FindBy(xpath = "//button[@onclick=\"wishlist.add('7487326');\"]")
    public WebElement item3_addToWishBtn;
    @FindBy(xpath = "//div[@class='alert alert-fix alert-success alert-dismissible']")
    public WebElement successToWish_btn;
}