package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;
import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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
    @FindBy(xpath = "//*[@id='price-from']")
    public WebElement HB_Min_Slider_loc;
    @FindBy(xpath = "//*[@id='price-to']")
    public WebElement HB_Max_Slider_loc;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div/p")
    public List<WebElement> HB_Product_List_loc;
    @FindBy(xpath = "//*[@id=\"slider-price\"]/span[1]")
    public WebElement barMin_loc;
    @FindBy(xpath = "//*[@id=\"slider-price\"]/span[2]")
    public WebElement barMax_loc;
    @FindBy(xpath = "//*[@id=\"input-limit\"]/option[5]")
    public WebElement HB_Show_btn;
    @FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/ul/li[2]")
    public WebElement refresh_btn;
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
    public void sliderFunctionHB_mtd() throws InterruptedException {
        WebDriver driver = Driver.get();
        Thread.sleep(400);
        Actions move = new Actions(driver);
        double minPrice = Double.parseDouble(HB_Min_Slider_loc.getAttribute("value"));
        double maxPrice = Double.parseDouble(HB_Max_Slider_loc.getAttribute("value"));

        for (int i = 1; i <= 4; i++) {
            BrowserUtils.waitForClickablility(HB_Show_btn,5);
            HB_Show_btn.click();
            for (int j = 0; j <= 3; j++) {
                BrowserUtils.waitForClickablility(barMin_loc, 5);
                BrowserUtils.waitForClickablility(barMax_loc, 5);
                move.moveToElement(barMin_loc).clickAndHold().moveByOffset(20, 0).release().perform();
                Thread.sleep(400);
                List<WebElement> myElements = null;
                for (int k = 1; k <= HB_Product_List_loc.size(); k++) {
                    myElements = driver.findElements(By.xpath(
                            "(//*[@id=\"content\"]/div/div[2]/div/div/div/div[2]/div/div/p)['" + k + "']"));
                    Thread.sleep(400);
                }
                for (WebElement element : myElements) {
                    BrowserUtils.waitForVisibility(element, 5);
                    String sPrice = element.getText();
                    String price = sPrice.substring(1, sPrice.length());
                    double productPrice = Double.parseDouble(price);
                    Assert.assertTrue(minPrice <= productPrice && productPrice <= maxPrice);
                }
            }
            BrowserUtils.waitForClickablility(refresh_btn,5);
            refresh_btn.click();
            BrowserUtils.waitForVisibility(barMax_loc, 5);
            move.moveToElement(barMax_loc).clickAndHold().moveByOffset((-10)*i, 0).release().perform();
        }
    }
    public void barScroll_mtd() throws InterruptedException {
        double minPrice = Double.parseDouble(HB_Min_Slider_loc.getAttribute("value"));
        double maxPrice = Double.parseDouble(HB_Max_Slider_loc.getAttribute("value"));
        WebDriver driver = Driver.get();
        Actions move = new Actions(driver);
        move.moveToElement(barMin_loc).clickAndHold().moveByOffset(100, 0).release().perform();
        Thread.sleep(2000);
        double expectedMinPrice = Double.parseDouble(HB_Min_Slider_loc.getAttribute("value"));
        move.moveToElement(barMax_loc).clickAndHold().moveByOffset(-20, 0).release().perform();
        Thread.sleep(2000);
        double expectedMaxPrice = Double.parseDouble(HB_Max_Slider_loc.getAttribute("value"));
        Assert.assertNotEquals(expectedMinPrice, minPrice);
        Assert.assertNotEquals(expectedMaxPrice, maxPrice);
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/ul/li[2]")).click();
    }
    public void clickShowHundredProduct_mtd() {
        HB_Show_btn.click();
    }
}




