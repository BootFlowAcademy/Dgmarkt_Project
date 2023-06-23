package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class ShowNumberSelectPage extends BasePage {
    @FindBy(xpath = "//*[@id='input-limit']")
    public WebElement showNumber_select;
    public void showDefaultNumberSelect_mtd (String expectedNumber){
        Select showNumber = new Select(showNumber_select);
        expectedNumber = "12";
        String actualNumber = showNumber.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedNumber,actualNumber);
        BrowserUtils.waitFor(3);
        BrowserUtils.scrollToElement(showNumber_select);
        BrowserUtils.waitFor(3);
    }
    public void setShowNumberReplace_mtd(List<String> listOfNumber) {
        Select showNumber = new Select(showNumber_select);
        for (int i = 1; i < 5; i++) {
            showNumber.selectByIndex(i);
            String expectedNumber=listOfNumber.get(i-1);
            String actualNumber = showNumber.getFirstSelectedOption().getText();
            Assert.assertEquals(expectedNumber, actualNumber);
            BrowserUtils.waitFor(3);
            BrowserUtils.scrollToElement(showNumber_select);
            BrowserUtils.waitFor(3);
        }
    }
}


