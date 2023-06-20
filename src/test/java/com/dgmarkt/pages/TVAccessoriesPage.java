package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVAccessoriesPage extends BasePage{
    @FindBy(xpath = "(//a[text()='TV Accessories'])[1]")
    public WebElement tvAccessories_loc;
    @FindBy(xpath = "(//a[text()='TV Accessories'])[2]")
    public WebElement tvAccessories2_loc;
    @FindBy(xpath = "//button[@onclick=\"wishlist.add('2541827');\"]")
    public WebElement item5_addToWishBtn;
}