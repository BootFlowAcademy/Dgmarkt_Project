package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelevisionsPage extends BasePage {
    @FindBy(xpath = "(//a[text()='Televisions'])[1]")
    public WebElement television_loc;
    @FindBy(xpath = "(//a[text()='Televisions'])[2]")
    public WebElement television2_loc;
    @FindBy(xpath = "//button[@onclick=\"wishlist.add('7403979');\"]")
    public WebElement item4_addToWishBtn;





}