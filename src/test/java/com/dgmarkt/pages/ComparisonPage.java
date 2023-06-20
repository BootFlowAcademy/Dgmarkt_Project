package com.dgmarkt.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComparisonPage extends BasePage {

    @FindBy(xpath ="//h1[text()='Product Comparison']" )
    public WebElement comparisonPage_text;

    @FindBy(xpath ="//strong[text()='Product Details']" )
    public WebElement product_detail_loc;

    @FindBy(xpath ="//td[text()='BaByliss 3663U - Hair rollers']" )
    public WebElement item1Health_loc;

    @FindBy(xpath ="//td[text()='Capsule Plate 6pcs']" )
    public WebElement item2Health_loc;



    @FindBy(xpath ="//tbody/tr[1]/td/a[.='Cello C1920FS 19\" LED-backlit LCD TV']" )
    public WebElement item1Televisions_loc;

    @FindBy(xpath ="//tbody/tr[1]/td/a[.='Belkin HDMI cable - 1.5 m']" )
    public WebElement item3TVAccessories_loc;

    @FindBy(xpath ="//tbody/tr[1]/td/a[.='ASUS ROG STRIX GS-AX3000']" )
    public WebElement item3Networking_loc;






}
