package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
   //---------registration testcases for register form-----------
   // --------for cellphone product test -------------
   //filled all mendotary field
    By firstName = By.id("FirstName");
    public void enterFirstName(String text){
        sendTextToElement(firstName,text);
    }
    By lastName = By.id("LastName");
    public void enterLastName(String text){
        sendTextToElement(lastName,text);
    }
    By emailField = By.id("Email");
    public void enterEmail(String text){
        sendTextToElement(emailField,text + getAlphaNumericString(2)+ "@gmail.com");
    }
    By password = By.id("Password");
    public void enterPasswordField(String text){
        sendTextToElement(password,text);
    }
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    public void enterConfirmpasswordField (String text){
        sendTextToElement(confirmPassword,text);
    }
    //click on register
    By register = By.xpath("//button[@id='register-button']");
    public void clickOnRegeisterButton(){
        mouseHoverToElementAndClick(register);
    }
    //2.22 Verify the message “Your registration completed”
    By verifyRegisterText = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String verifyYourRegCompleted(){
        return getTextFromElement(verifyRegisterText);

    }
    //2.23 Click on “CONTINUE” tab
    By clickContinue = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinuetab(){
        mouseHoverToElementAndClick(clickContinue);
    }
}
