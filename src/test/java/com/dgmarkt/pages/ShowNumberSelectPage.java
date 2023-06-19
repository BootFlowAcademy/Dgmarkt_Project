package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ShowNumberSelectPage extends BasePage {
    @FindBy(xpath = "//*[@id='input-limit']")
    public WebElement showNumber_select;
    public void showDefaultNumberSelect_mtd (String expectedNumber) throws InterruptedException {
        Select showNumber = new Select(showNumber_select);
        expectedNumber = "12";
        String actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        Thread.sleep(2);
        BrowserUtils.scrollToElement(showNumber_select);
        BrowserUtils.waitFor(2);
    }
    public void setShowNumberReplace_mtd() throws InterruptedException {
        Select showNumber = new Select(showNumber_select);

        showNumber.selectByIndex(1);
        String expectedNumber="25";
        String actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        Thread.sleep(2000);
        BrowserUtils.scrollToElement(showNumber_select);
        BrowserUtils.waitFor(2);

        showNumber.selectByIndex(2);
        expectedNumber="50";
        actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        Thread.sleep(2000);
        BrowserUtils.scrollToElement(showNumber_select);
        BrowserUtils.waitFor(2);

        showNumber.selectByIndex(3);
        expectedNumber="75";
        actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        Thread.sleep(2000);
        BrowserUtils.scrollToElement(showNumber_select);
        BrowserUtils.waitFor(2);

        showNumber.selectByIndex(4);
        expectedNumber="100";
        actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        Thread.sleep(2000);
    }
}


