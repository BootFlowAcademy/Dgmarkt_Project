package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.junit.Assert.*;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "//*[text()='Popular Tags']")
    public WebElement popularTags_msg;

    @FindBy(xpath = "//*[text()='Amazon']")
    public WebElement amazonTag_btn;

    @FindBy(xpath = "//*[text()='Apple']")
    public WebElement appleTag_btn;

    @FindBy(xpath = "//*[text()='IPhone']")
    public WebElement iphoneTag_btn;

    @FindBy(xpath = "//*[text()='Headphone']")
    public WebElement headphoneTag_btn;

    @FindBy(xpath = "//*[text()='Beats']")
    public WebElement beatsTag_btn;

    @FindBy(xpath = "//*[text()='Bluetooth']")
    public WebElement bluetoothTag_btn;

    @FindBy(xpath = "//*[text()='Speaker']")
    public WebElement speakerTag_btn;

    @FindBy(xpath = "//*[text()='Bose']")
    public WebElement boseTag_btn;

    @FindBy(xpath = "//input[@id='button-search']")
    public WebElement search_btn;

    @FindBy(xpath = "//*[text()='There is no product that matches the search criteria.']")
    public WebElement productMatches_msg;

    @FindBy(xpath = "//*[text()='Bose ControlSpace WP22B-D Dante']")
    public WebElement productBoseMatches_msg;

    public void verifyPopularTags_mtd(){
        assertTrue(popularTags_msg.isDisplayed());
        assertTrue(popularTags_msg.isDisplayed());
        assertTrue(popularTags_msg.isDisplayed());
        assertTrue(popularTags_msg.isDisplayed());
    }
    public void amazonTagAndSearch_mtd(){
        amazonTag_btn.click();
        search_btn.click();
    }

    public void appleTagAndSearch_mtd(){
        appleTag_btn.click();
        search_btn.click();
    }

    public void iphoneTagAndSearch_mtd(){
        iphoneTag_btn.click();
        search_btn.click();
    }

    public void headphoneTagAndSearch_mtd(){
        headphoneTag_btn.click();
        search_btn.click();
    }

    public void beatsTagAndSearch_mtd(){
        beatsTag_btn.click();
        search_btn.click();
    }

    public void bluetoothTagAndSearch_mtd(){
        bluetoothTag_btn.click();
        search_btn.click();
    }

    public void speakerTagAndSearch_mtd(){
        speakerTag_btn.click();
        search_btn.click();
    }

    public void boseTagAndSearch_mtd(){
        boseTag_btn.click();
        search_btn.click();
    }
}