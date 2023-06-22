package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;
import com.dgmarkt.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthBeautyPage extends BasePage{
    @FindBy(xpath = "(//a[text()='Health & Beauty'])[1]")
    public WebElement healthAndBeauty_loc;
    @FindBy(xpath = "//*[@title='BaByliss 3663U - Hair rollers']")
    public WebElement item1_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('7064674');\"]")
    public WebElement item1_addToWishBtn;
    @FindBy(xpath = "//*[@onclick=\"compare.add('7064674');\"]")
    public WebElement item1_addToCompareBtn;
    @FindBy(xpath = "//*[@title='Capsule Plate 6pcs']")
    public WebElement item2_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('5720397');\"]")
    public WebElement item2_addToWishBtn;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('7487326');\"]")
    public WebElement item3_addToWishBtn;
    @FindBy(xpath = "//*[@onclick=\"compare.add('5720397');\"]")
    public WebElement item2_addToCompareBtn;
    @FindBy(xpath ="//a[@id='compare-total']" )
    public WebElement productCompare_btn;
    @FindBy(xpath ="//div[@class='alert alert-fix alert-success alert-dismissible']" )
    public WebElement successToWish_btn;
    @FindBy(xpath = "//*[@onclick=\"compare.add('5736703');\"]")
    public WebElement item3_addToCompareBtn;
    @FindBy(xpath = "//*[@title='eufy C1 Smart Scale White']")
    public WebElement item3_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"compare.add('5736704');\"]")
    public WebElement item4_addToCompareBtn;
    @FindBy(xpath = "//*[@title='eufy P1 Smart Scale Blue and Black']")
    public WebElement item4_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"compare.add('5668257');\"]")
    public WebElement item5_addToCompareBtn;
    @FindBy(xpath = "//*[@title='Fitbit Aria Air Smart Bathroom Scale']")
    public WebElement item5_hoverOver;
    @FindBy(xpath = "//div[@class=\"container-inner\"]")
    public WebElement healthAndBeautyHeader_loc;
    @FindBy(xpath = "//button[@data-dismiss=\"alert\"]")
    public WebElement succesPopUpClose_loc;
    @FindBy(xpath = "//*[text()='Product Compare (4)']")
    public WebElement productCompareAmount_loc;

    public void addToWish_mtd(){
        scrollToElement(item1_addToWishBtn);
        hoverAndClick(item1_hoverOver,item1_addToWishBtn);
        hoverAndClick(item2_hoverOver,item1_addToWishBtn);
    }

    public void addToCompare_mtd(){
        scrollToElement(item1_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item1_hoverOver,item1_addToCompareBtn);
        scrollToElement(item2_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item2_hoverOver,item2_addToCompareBtn);
    }

    public void addToFiveProductCompare_mtd(){
        scrollToElement(item1_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item1_hoverOver,item1_addToCompareBtn);
        succesPopUpClose_loc.click();
        //scrollToElement(item2_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item2_hoverOver,item2_addToCompareBtn);
        succesPopUpClose_loc.click();
        //scrollToElement(item3_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item3_hoverOver,item3_addToCompareBtn);
        succesPopUpClose_loc.click();
        scrollToElement(item1_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item4_hoverOver,item4_addToCompareBtn);
        succesPopUpClose_loc.click();
        //scrollToElement(item2_hoverOver);
        BrowserUtils.waitFor(1);
        hoverAndClick(item5_hoverOver,item5_addToCompareBtn);
        succesPopUpClose_loc.click();
        scrollToElement(healthAndBeautyHeader_loc);
        BrowserUtils.waitFor(1);

    }
}




