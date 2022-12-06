package com.nopcommerce.demo.pages;

import com.google.common.base.Verify;
import com.nopcommerce.demo.utility.Utility;
import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.util.List;

public class HomePage extends Utility {

    By mainMenuList = By.xpath("//div[@class = 'header-menu']/ul/li");
    public void selectMenu(String menu) {
        List<WebElement> myProductList = driver.findElements(mainMenuList);
        try {
            for (WebElement option1 : myProductList) {
                System.out.println(option1.getText());
                if (option1.getText().equals(menu)) {
                    option1.click();
                    break;
                }
            }

        } catch (StaleElementReferenceException e) {
            myProductList = driver.findElements(mainMenuList);
        }

    }

  //  1.1 Click on Computer Menu.
    By computerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    public void clickOnComputerMenu(){
        mouseHoverToElement(computerMenu);

    }
    By pageTitle = By.cssSelector("div.page-title");
    public String getTitleOfPage(){
        return getTextFromElement(pageTitle);
    }
   // 1.2 Click on Desktop
    By desktop = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    public void clickOndesktop(){
        mouseHoverToElementAndClick(desktop);
    }
  // 2.37 verify welcome to our store
    By welcometext = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public String verifyWelcomeStore(){
        return getTextFromElement(welcometext);
    }
    //--------------------------electronic product------------------------------
 // 1.1 Mouse Hover on “Electronics” Tab
    By elecTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    public void mousehoverToElectronics(){
        mouseHoverToElement(elecTab);
    }

//1.2 Mouse Hover on “Cell phones” and click
    By cellphoneField = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    public void clickOnCellPhone(){
        mouseHoverToElementAndClick(cellphoneField);
    }
//1.3 Verify the text “Cell phones
    By verifyCellPhone = By.xpath("//h1[contains(text(),'Cell phones')]");
    public String verifyTextCellPhone(){
        return getTextFromElement(verifyCellPhone);
    }

    //-------logout field
    By logout = By.xpath("//a[contains(text(),'Log out')]");
    public void clickOnlogoutfield(){
        clickOnElement(logout);
    }





}
