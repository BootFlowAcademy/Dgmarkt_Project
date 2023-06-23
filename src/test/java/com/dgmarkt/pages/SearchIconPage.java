package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIconPage extends BasePage {

@FindBy (xpath= "//div[@class='dropdown-toggle search-button']")
  public WebElement searchIconFunction;
@FindBy (xpath= "//input[@id='text-search']")
  public  WebElement searchBox_text;
@FindBy  (xpath= "//button[@id='btn-search-category']/..")
  public  WebElement startSearch_btn;
@FindBy (xpath= "//p[@class='manufacture-product']/../h4/a")
  public WebElement firstProductName_text;
}
