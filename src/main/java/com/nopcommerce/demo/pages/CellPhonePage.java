package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CellPhonePage extends Utility {
    //test scenario for  verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully method
    //  2.4 Click on List View Tab
    By listView = By.xpath("//a[contains(text(),'List')]");
    public void mouseHoverandClickOnListView(){
        mouseHoverToElementAndClick(listView);
    }
 //2.5 Click on product name “Nokia Lumia 1020” link
    By nokiaLumiaText = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]");
    public void clickOnNokiaLumiaProduct(){
       mouseHoverToElementAndClick(nokiaLumiaText);
    }

   //2.6 Verify the text “Nokia Lumia 1020
   By verifyNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");

    public String verifyProductNokiaLumia(){
        return  getTextFromElement(verifyNokiaLumia);
    }
    //2.7 Verify the price “$349.00”
    By verifyPrice  = By.xpath("//span[@id='price-value-20']");
    public String verifyProductPriceOfNokia(){
        return  getTextFromElement(verifyPrice);
    }
    // 2.8 Change quantity to 2
    By QtyField = By.xpath("//input[@id='product_enteredQuantity_20']");
    public void clearQtyAndChangeQtyOfProuduct(String text){
        WebElement changeqty =   driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        changeqty.clear();
        sendTextToElement(QtyField,text);
    }

    // 2.9 Click on “ADD TO CART” tab
    By addTocart = By.id("add-to-cart-button-20");
    public void clickOnAddTocartButton(){
        mouseHoverToElementAndClick(addTocart);
    }

//    2.10 Verify the Message "The product has been added to your shopping cart" on Top green bar,
//    After that close the bar clicking on the cross button.//
    By verifymassageSucess = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By clickOncrossButtton = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public String verifymassageProductAddTocart(){
        return getTextFromElement(verifymassageSucess);

    }
    public void clickOnCrossButton(){
        mouseHoverToElementAndClick(clickOncrossButtton);
    }
    //  2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    By shopCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void mouseHoverToShoppingcart(){
        mouseHoverToElement(shopCart);
    }

    By clickOnGocart = By.xpath("//button[contains(text(),'Go to cart')]");
    public void goTocart(){
        mouseHoverToElementAndClick(clickOnGocart);
    }

}