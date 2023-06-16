package com.dgmarkt.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShowNumberSelectPage extends BasePage {
    @FindBy(xpath = "//*[@id='input-limit']")
    public WebElement showNumber_select;

    public void setShowNumberSelect_mtd(String expectedNumber) {
        Select showNumberList = new Select(showNumber_select);
        showNumberList.selectByIndex(0);
        String actualNumber = showNumberList.getFirstSelectedOption().getText();
        Assert.assertEquals(actualNumber, expectedNumber);
    }
}
