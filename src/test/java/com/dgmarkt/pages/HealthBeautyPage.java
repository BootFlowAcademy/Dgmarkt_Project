package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;

import com.dgmarkt.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @FindBy(xpath = "//*[@onclick=\"compare.add('7064674');\"]")
    public WebElement item1_addToCompareBtn;
    @FindBy(xpath = "//*[@title='Capsule Plate 6pcs']")
    public WebElement item2_hoverOver;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('5720397');\"]")
    public WebElement item2_addToWishBtn;
    @FindBy(xpath = "//*[@onclick=\"compare.add('5720397');\"]")
    public WebElement item3_addToWishBtn;
    @FindBy(xpath = "//*[@onclick=\"wishlist.add('7487326');\"]")
    public WebElement item2_addToCompareBtn;
    @FindBy(xpath ="//a[@id='compare-total']" )
    public WebElement productCompare_btn;
    @FindBy(xpath ="//button[@class='close']" )
    public WebElement addSucces_msg;
    @FindBy(xpath ="//div[@class='alert alert-fix alert-success alert-dismissible']" )
    public WebElement successToWish_btn;


    public void addToWish_mtd(){
        scrollToElement(item1_addToWishBtn);
       hoverAndClick(item1_hoverOver,item1_addToWishBtn);
       hoverAndClick(item2_hoverOver,item2_addToWishBtn);
    }
    public void addToCompare_mtd(){
        scrollToElement(item1_addToCompareBtn);
        hoverAndClick(item1_hoverOver,item1_addToCompareBtn);
        hoverAndClick(item2_hoverOver,item2_addToCompareBtn);
    }
    public void goToSubmenu(String Menu, String Submenu) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath("//span[text()='"+Menu+"']"))).perform();
        Driver.get().findElement(By.xpath("(//h4//a[text()='"+Submenu+"'])[1]")).click();
    }

}




