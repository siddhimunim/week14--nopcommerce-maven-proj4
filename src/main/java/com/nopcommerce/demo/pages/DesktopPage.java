package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
  //  1.3 Select Sort By position "Name: Z to A"
    By nameZtoA = By.id("products-orderby");
    public void clickOnNameZtoA (){
        clickOnElement(nameZtoA);
    }
   // 1.4 Verify the Product will arrange in Descending order.
   By allProductName = By.xpath("//h2/a");
    By sortOutZToA = By.id("products-orderby");

    public ArrayList<String> verifyProductZToA() {
       // Get all the products name and stored into array list
       List<WebElement> products = driver.findElements(allProductName);
       ArrayList<String> originalProductsName = new ArrayList<>();
       for (WebElement e : products) {
           originalProductsName.add(e.getText());
       }
       System.out.println(originalProductsName);
       // Sort By Reverse order//
       Collections.reverse(originalProductsName);
       //System.out.println(originalProductsName);
       // Select sort by Name Z - A//
       selectByVisibleTextFromDropDown(sortOutZToA, "Name (Z - A)");
       // After filter Z -A Get all the products name and stored into array list
       products = driver.findElements(allProductName);
       ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
       for (WebElement e : products) {
           afterSortByZToAProductsName.add(e.getText());

       }
       return afterSortByZToAProductsName;
   }
   //2.3 Select Sort By position "Name: A to Z"
   By nameAtoZ = By.id("products-orderby");
    public void clickOnNameAtoZ (){
        clickOnElement(nameAtoZ);
    }

    //2.4 Click on "Add To Cart"
    By addTocart = By.xpath("//div[@data-productid='1']/div[2]/div[3]/div[2]/button[1]");
    public void clickOnAddTocart(){
        mouseHoverToElementAndClick(addTocart);
    }






}
