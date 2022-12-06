package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;

public class CheckOutGuestLoginPage extends Utility {
   // 2.20 Verify the Text “Welcome, Please Sign In!”
    By verifyWelcometext = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String verifyWelcomeSignIn(){
        return getTextFromElement(verifyWelcometext);
    }
    // 2.21Click on “CHECKOUT AS GUEST” Tab
    By checkoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    public void clickOnCheckoutasGuest(){
        clickOnElement(checkoutGuest);
    }
    //--------------for cellphone product checkout register on site---------
    By register = By.xpath("//button[contains(text(),'Register')]");
    public void clickOnRegister(){
        mouseHoverToElementAndClick(register);
    }


}
