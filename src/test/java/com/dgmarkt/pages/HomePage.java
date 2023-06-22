package com.dgmarkt.pages;

import static com.dgmarkt.utilities.BrowserUtils.*;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[text()=' Congratulation! Login Successfully']")
    public WebElement loginSuccessfully_msg;
    @FindBy(xpath = "(//ul//li//a[@class='a-top-link'])[2]")
    public WebElement category_Btn;
    @FindBy(xpath = "(//h4//a[text()='Health & Beauty'])[1]")
    public WebElement healthCat_Btn;
    @FindBy(xpath = "//div[@class='logout-success']")
    public WebElement accountLogout_box;


    public void goToCategory_mtd(){hoverAndClick(category_Btn,healthCat_Btn);
    }

    public void goToSubmenu(String Menu, String Submenu) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Driver.get().findElement(By.xpath("//span[text()='"+Menu+"']"))).perform();
        Driver.get().findElement(By.xpath("(//h4//a[text()='"+Submenu+"'])[1]")).click();
    }






}
