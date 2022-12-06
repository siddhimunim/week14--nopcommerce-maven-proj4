package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckoutProductsPage extends Utility {
    //-------checkout as guest reg form-----------------
    //fill all mendotary field for billing address for all product purchase///
    By firstName = By.id("BillingNewAddress_FirstName");
    public void enterFirstName (String text){
        sendTextToElement(firstName,text);
    }
    By lastName = By.id("BillingNewAddress_LastName");
    public void enterLastName (String text){
        sendTextToElement(lastName,text);
    }
    By email = By.id("BillingNewAddress_Email");
    public void enterEmail(String text){
        sendTextToElement(email ,text);
    }
    By country = By.id("BillingNewAddress_CountryId");
    public void enterCountryName(String text){
        sendTextToElement(country ,text);
    }
    By stateField = By.id("BillingNewAddress_StateProvinceId");
    public void enterStateName(String text){
        sendTextToElement(stateField ,text);
    }
    By city = By.id("BillingNewAddress_City");
    public void enterCityName(String text){
        sendTextToElement(city ,text);
    }
    By address1 = By.id("BillingNewAddress_Address1");
    public void enterAddress1(String text){
        sendTextToElement(address1 ,text);
    }
    By zip = By.id("BillingNewAddress_ZipPostalCode");
    public void enterZipCode(String text){
        sendTextToElement(zip ,text);
    }
    By phoneNo = By.id("BillingNewAddress_PhoneNumber");
    public void enterPhoneNo(String text){
        sendTextToElement(phoneNo ,text);
    }
    //click on continue
    By countinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    public void clickOnContinue(){
        mouseHoverToElementAndClick(countinue);
    }
    //-----------------------form finish go to finish shopping for desktop  -----------------------------------------------

    //-----------for desktop product all checkout procedure steps--------------

  //  2.24 Click on Radio Button “Next Day Air($0.00)”
    By nextDayAir = By.id("shippingoption_1");
    public void clickOnNextDay (){
        clickOnElement(nextDayAir);
    }
    // 2.25 Click on “CONTINUE”
    By countClick = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    public void clickOnCountinueTab(){
        clickOnElement(countClick);
    }
    //2.26 Select Radio Button “Credit Card and countinue”
    By paymethod = By.id("paymentmethod_1");
    public void clickOnPaymentmethod(){
        clickOnElement(paymethod);
    }
    By nextTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    public void clickOnLink(){
        clickOnElement(nextTab);
    }
    // 2.27 Select “Master card” From Select credit card dropdown
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    public void selectMasterCard(String text){
        selectByVisibleTextFromDropDown(masterCard,text);
    }
//2.28 Fill all the details
    By cardHoldername = By.xpath("//input[@id='CardholderName']");
    public void enterName(String text){
        sendTextToElement(cardHoldername,text);
    }
    By cardNo = By.xpath("//input[@id='CardNumber']");
    public void  enterCardNo(String text){
        sendTextToElement(cardNo,text);
    }
    By month = By.xpath("//select[@id='ExpireMonth']");
    public void selectMonth(String text){
        selectByVisibleTextFromDropDown(month,text);
    }
    By year = By.xpath("//select[@id='ExpireYear']");
    public void selectYear(String text){
        selectByVisibleTextFromDropDown(year,text);
    }
    By cardcode = By.xpath("//input[@id='CardCode']");
    public void  enterCardCode(String text){
        sendTextToElement(cardcode,text);
    }

//2.29 Click on “CONTINUE
    By clickcontinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    public void clickOnContinueField(){
        mouseHoverToElementAndClick(clickcontinue);
    }
  //  2.30 Verify “Payment Method” is “Credit Card”
    By verifyCreditCard = By.xpath("//span[contains(text(),'Credit Card')]");
    public String verifyCreditcadText(){
        return  getTextFromElement(verifyCreditCard);
    }
  //  2.32 Verify “Shipping Method” is “Next Day Air”
  By verifyShipping = By.xpath("//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]");
    public String verifyShippingText(){
        return  getTextFromElement(verifyShipping);
    }
  //  2.33 Verify Total is “$2,950.00”
  By verifyTotal = By.xpath("//tr[@class='order-total']/td[2]/span");
    public String verifyTotalText(){
        return  getTextFromElement(verifyTotal);
    }
  //  2.34 Click on “CONFIRM”
    By confirm =By.xpath("//button[contains(text(),'Confirm')]");
    public void clickOnConfirm(){
        mouseHoverToElementAndClick(confirm);
    }
  //  2.35 Verify the Text “Thank You”
  By verifythankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    public String verifyThankYouText(){
        return  getTextFromElement(verifythankYou);
    }
   //  2.36 Verify the message “Your order has been successfully processed!”
   By verifyOrderSuccess = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String verifyOrderSuccessText(){
        return  getTextFromElement(verifyOrderSuccess);
    }
   //  2.37 Click on “CONTINUE”
    By tabContinue = By.xpath("//button[contains(text(),'Continue')]");
    public void clickOnTabContinue(){
        mouseHoverToElementAndClick(tabContinue);
    }

    //-------------------for cellphone product checkout scenario test---------------------------

    // for click on 2nd day air option
    By check2dayOption = By.xpath("//input[@id='shippingoption_2']");
    public void clickOn2ndOption(){
        clickOnElement(check2dayOption);
    }

   //verify next day air
   By verifyShippingmethod  = By.xpath("//div[@class='order-summary-content']/div/div[2]/div[2]/ul/li/span[2]");
    public String verifyShippingmethodText(){
        return  getTextFromElement(verifyShippingmethod);
    }









}
