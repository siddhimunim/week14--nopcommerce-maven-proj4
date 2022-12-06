package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildOwnComputerPage extends Utility {
   // 2.5 Verify the Text "Build your own computer"
    By buildcomputerVerify = By.xpath("//h1[contains(text(),'Build your own computer')]");
      public String verifyBuildYourCompText (){
          return getTextFromElement(buildcomputerVerify);
      }

   // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By intelPlatinumField = By.xpath("//select[@id='product_attribute_1']");
      public void selectIntelPlatinum(String text ){
          selectByVisibleTextFromDropDown(intelPlatinumField,text);
      }

    //2.7.Select "8GB [+$60.00]" using Select class.
    By ramField = By.xpath("//select[@id='product_attribute_2']");
    public void selectRam(String text ){
        selectByVisibleTextFromDropDown(ramField,text);
    }
    // 2.8 Select HDD radio "400 GB [+$100.00]"
    By hDDField = By.xpath("//input[@id='product_attribute_3_7']");
    public void selectHDDTab(){
       clickOnElement(hDDField);
    }
    // 2.9 Select OS radio "Vista Premium [+$60.00]"
    By VistaField = By.id("product_attribute_4_9");
    public void selectVistaFieldTab( ){
        clickOnElement(VistaField);
    }
    //  2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    By commander = By.id("product_attribute_5_12");
    public void clickOnCommander(){
        clickOnElement(commander);
    }
  //  2.11 Verify the price "$1,475.00"
    By priceverify = By.xpath("//span[@id='price-value-1']");
    public String verifyPrice(){
        return getTextFromElement(priceverify);
    }
  //2.12 Click on "ADD TO CARD" Button.
    By addToCart = By.xpath("//button[@id='add-to-cart-button-1']");
    public void clickOnAddTocart(){
        mouseHoverToElementAndClick(addToCart);
    }
    //verify massage
    By verifyProductAdd = By.xpath("//body/div[@id='bar-notification']/div[1]");
    public String verifyProductAddTocart(){
        return getTextFromElement(verifyProductAdd);
    }
    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
    }






}
