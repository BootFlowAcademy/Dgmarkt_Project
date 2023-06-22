package com.dgmarkt.pages;

import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductViewIconPage extends BasePage {
    HomePage homePage=new HomePage();

    @FindBy(xpath ="//button[text()='1']")
    public WebElement viewIcon;

    @FindBy(xpath ="//button[@title='List']")
    public WebElement viewIcon_List;



    public void clickViewIcon(String view){
      if (view.equals("List")){
          Driver.get().findElement(By.xpath("//button[@title='"+view+"']")).click();

      }else {
          Driver.get().findElement(By.xpath("//button[text()='" + view + "']")).click();
      }
    }



}
