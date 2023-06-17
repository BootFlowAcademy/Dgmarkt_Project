package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HealthBeautyPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthAndBeauty_loc;
    @FindBy(xpath = "//*[@title='BaByliss 3663U - Hair rollers']")
    public WebElement item1_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('7064674');\"]")
    public WebElement item1_addToWishBtn;
    @FindBy(xpath = "//*[@title='Capsule Plate 6pcs']")
    public WebElement item2_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('5720397');\"]")
    public WebElement item2_addToWishBtn;
    public void addToWish_mtd(){
        scrollToElement(item1_addToWishBtn);
       hoverAndClick(item1_hoverOver,item1_addToWishBtn);
       hoverAndClick(item2_hoverOver,item2_addToWishBtn);
    }

    }




