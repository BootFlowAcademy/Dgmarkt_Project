package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SortByPage extends BasePage {

    @FindBy (xpath = "(//li[@class='li-top-item left '])[1]")
    public WebElement category_btn;

    @FindBy (xpath = "(//div[@class='mega-menu-container sub-menu-container left '])[1]")
    public WebElement categorySubMenu_DropDown;

    @FindBy (xpath = "(//a[@class=\"a-mega-second-link\"])[1]")
    public WebElement healthAndBeauty_loc;

    @FindBy (xpath = "(//a[@class=\"a-mega-second-link\"])[2]")
    public WebElement television_loc;

    @FindBy (xpath = "(//a[@class=\"a-mega-second-link\"])[3]")
    public WebElement tvAccessories_loc;

    @FindBy (xpath = "(//a[@class=\"a-mega-second-link\"])[4]")
    public WebElement networking_loc;

    @FindBy (xpath = "//select[@id='input-sort']")
    public WebElement sortBy_btn;

    @FindBy(xpath = "//select[@id='input-sort']")
    public WebElement sortBy_select;

}
