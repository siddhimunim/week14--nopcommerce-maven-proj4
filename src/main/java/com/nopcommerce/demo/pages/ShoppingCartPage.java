package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends Utility {
    //--------------for desktop product shopping cart secanrios------------------
    // 2.15 Verify the message "Shopping cart"
    By verifyCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    public String verifyShoppingCart() {
        return getTextFromElement(verifyCart);

    }

    //  2.16 Change the Qty to "2" and Click on "Update shopping cart"
    By changeQty = By.xpath("//td[@class='quantity']/input");

    public void clearQty() {
        WebElement changeqty = driver.findElement(By.xpath("//td[@class='quantity']/input"));
        changeqty.clear();
    }

    public void newQtychange(String text) {
        sendTextToElement(changeQty, text);
    }

    By updatecart = By.id("updatecart");

    public void updateShoppingCart() {
        mouseHoverToElementAndClick(updatecart);
    }

    // 2.17 Verify the Total"$2,950.00"
    By verifyPrice = By.xpath("//tr[@class='order-total']/td[2]/span/strong");

    public String verifyTotalprice() {
        return getTextFromElement(verifyPrice);
    }

    // 2.18 click on checkbox “I agree with the terms of service”
    By termscondition = By.id("termsofservice");

    public void clickOnTermsAndService() {
        clickOnElement(termscondition);
    }

    // 2.19 Click on “CHECKOUT
    By checkout = By.id("checkout");

    public void clickOnCheckoutButton() {
        mouseHoverToElementAndClick(checkout);
    }

    //-----------------for cellphone product test secanario ------------------------
    // 2.13 Verify the quantity is 2
    // WebElement text = driver.findElement(By.xpath("//input[@class='qty-input']"));
    // String expText5 = "2";
    // String actText5 = text.getAttribute("value");
    By verifyQty = By.xpath("//input[@class='qty-input']");

    public String verifyQtyOfLumiaMobile(String value1) {
        WebElement text1 = driver.findElement(By.xpath("//input[@class='qty-input']"));
        text1.getAttribute("value");
        return getTextFromElement(verifyQty);

    }

    //2.14 Verify the Total $698.00
    By verifytotalPrice = By.xpath("//tr[@class='order-total']/td[2]/span");

    public String verifyTotalPrice() {
        return getTextFromElement(verifytotalPrice);

    }
}
