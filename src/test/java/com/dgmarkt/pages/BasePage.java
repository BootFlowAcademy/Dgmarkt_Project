package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import com.dgmarkt.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.By.xpath;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//a[@title='My Account']/..")
    public WebElement myAccount_btn;
    @FindBy(xpath = "//a[@id='pt-login-link']/..")
    public WebElement accountLogin_btn;
    @FindBy(xpath = "//div[@id='logo']")
    public WebElement homeLogo_icon;
    @FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
    public WebElement cartIcon_btn;
    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']")
    public WebElement cartProduct_list;
    @FindBy(xpath = "(//li[@class='li-top-item left '])[1]")
    public WebElement category_btn;
    @FindBy(xpath = "(//div[@class='mega-menu-container sub-menu-container left '])[1]")
    public WebElement categorySubMenu_DropDown;
    @FindBy(id = "wishlist-total")
    public WebElement wishlist_Btn;
    @FindBy(xpath = "//a[@id='pt-logout-link']/..")
    public WebElement logout_btn;
    @FindBy(xpath = "//a[text()='My Account'][1]")
    public WebElement myAccountShow_btn;
    @FindBy(xpath = "//a[@href='https://dgmarkt.com/index.php?route=checkout/cart']")
    public WebElement viewCart_btn;
    @FindBy(xpath = "//div[2]/div/ul/li[4]")
    public WebElement contactUs_btn;
    @FindBy(xpath = "//*[text()='Currency']/..")
    public WebElement currency_btn;
    @FindBy(xpath = "//*[contains(text(),' Euro')]/..")
    public WebElement currencySubMenuEuro_btn;
    @FindBy(xpath = "//*[@id='form-currency']/div/ul/li[3]/button")
    public WebElement currencySubMenuDollar_btn;
    @FindBy(xpath = "//*[text()='Currency']/../span[1]")
    public WebElement currentCurrency_text;
    @FindBy(xpath = "//*[@id='form-currency']/div/ul/li[2]/button")
    public WebElement currencySubMenuPound_btn;
    @FindBy(xpath = "//div[@class='breadcrumbs']//h1")
    public WebElement pageName_text;//Bulunulan sayfanın sayfa ismini locate eder

    public WebElement currencySubmenuByName_mtd(String currencyName) {
        WebElement submenuCurrency = Driver.get().findElement(xpath("//*[contains(text(),' " + currencyName + "')]/.."));
        return submenuCurrency;
    }
    public void goToSubCategoryByName_mtd(String subCategoryName) {
        WebElement subCategory = Driver.get().findElement(xpath("//a[text()='" + subCategoryName + "']/../.."));
        BrowserUtils.hoverAndClick(category_btn, subCategory);
    }
    @FindBy(xpath = "(//li[@class='li-top-item left '])[2]")
    public WebElement category2_btn;
}