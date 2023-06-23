package com.dgmarkt.pages;

import com.dgmarkt.utilities.BrowserUtils;
import com.dgmarkt.utilities.ConfigurationReader;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class ForLoginAgainPage extends BasePage{
    @FindBy(css = "input[name='email']")
    public WebElement loginPanelEmail_text;
    @FindBy(css = "input[name='password']")
    public WebElement loginPanelPassword_text;
    @FindBy(xpath = "//a[text()='Close']")
    public WebElement popUpExit_btn;
    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement loginPageEmail_text;
    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement loginPagePassword_text;
    @FindBy(xpath = "(//button[@class='button btn'])[1]")
    public WebElement loginPageLogin_btn;
    @FindBy(css = "input[name='login']")
    public WebElement loginPanelLogin_Btn;
    @FindBy(xpath = "//a[@title='My Account']/..")
    public WebElement myAccount_btn;
    @FindBy(xpath = "//a[@id='pt-login-link']/..")
    public WebElement accountLogin_btn;
    @FindBy(xpath = "(//*[@class='txt-count'])[2]")
    public WebElement countProduct_text;
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement cartIcon_btn;
    @FindBy(xpath = "//a[@href='https://dgmarkt.com/index.php?route=checkout/cart']")
    public WebElement viewCart_btn;
    @FindBy(xpath = "(//span[@class='input-group-btn'])[1]/button[2]")
    public WebElement removeFirstProductFromCart_btn;

    public void loginPanel_mtd() {
        loginPanelEmail_text.sendKeys(ConfigurationReader.get("loginPanelEmail"));
        loginPanelPassword_text.sendKeys(ConfigurationReader.get("loginPanelPassword"));
        loginPanelLogin_Btn.click();
    }
    public void loginPage_mtd(String email, String password) {
        loginPageEmail_text.sendKeys(email);
        loginPagePassword_text.sendKeys(password);
        loginPageLogin_btn.click();
    }
    public void openLoginUnderAccount() {
        myAccount_btn.click();
        accountLogin_btn.click();
    }
    public void loginAgain(String email, String password) {
        loginPanel_mtd();
        popUpExit_btn.click();
        openLoginUnderAccount();
        loginPage_mtd(email, password);
    }
    public void removeAllProductfromCart(){ //Sepet sayfasındaki ürünlari tek tek siler
        BrowserUtils.scrollToElement(cartIcon_btn);
        cartIcon_btn.click();
        viewCart_btn.click();
        BrowserUtils.waitFor(2);
        int numberofProduct = numberOfProductInCartList_mtd();
        for (int i = 0; i < numberofProduct; i++) {
            removeFirstProductFromCart_btn.click();
            BrowserUtils.waitFor(2);
        }
    }
    public int numberOfProductInCartList_mtd(){ //Sepet sayfasında bulunan ürün çeşitlerinin sayısını verir
        List<WebElement> allProductRowInCartList = Driver.get().findElements(By.xpath("(//table)[3]/tbody/tr"));
        return allProductRowInCartList.size();
    }
}
