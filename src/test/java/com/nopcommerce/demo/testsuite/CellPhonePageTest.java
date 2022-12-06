package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utility.Utility;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CellPhonePageTest extends BaseTest {
    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutGuestLoginPage checkOutGuestLoginPage = new CheckOutGuestLoginPage();
    RegisterPage registerPage = new RegisterPage();
    CheckoutProductsPage checkoutProductsPage = new CheckoutProductsPage();
    Utility utility = new Utility();
    @Test
    public void  verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        // testscenario from homepage and description that page
        Thread.sleep(1000);
        homePage.mousehoverToElectronics();
        Thread.sleep(1000);
        homePage.clickOnCellPhone();
        Thread.sleep(1000);
        Assert.assertEquals(homePage.verifyTextCellPhone(), "Cell phones", "Not verify");
        // testscenarios from cellphonepage
        Thread.sleep(1000);
        cellPhonePage.mouseHoverandClickOnListView();
        Thread.sleep(1000);
        cellPhonePage.clickOnNokiaLumiaProduct();
        Thread.sleep(1000);
       // Assert.assertEquals(cellPhonePage.verifyProductNokiaLumia(), "Nokia Lumia 1020", "not Verify");
        Assert.assertEquals(cellPhonePage.verifyProductPriceOfNokia(), "$349.00", "not verify");
        Thread.sleep(1000);
        cellPhonePage.clearQtyAndChangeQtyOfProuduct("2");
        Thread.sleep(1000);
        cellPhonePage.clickOnAddTocartButton();
        Thread.sleep(1000);
        Assert.assertTrue(cellPhonePage.verifymassageProductAddTocart().contains("The product has been added to your "));
        Thread.sleep(1000);
        cellPhonePage.clickOnCrossButton();
        cellPhonePage.mouseHoverToShoppingcart();
        Thread.sleep(1000);
        cellPhonePage.goTocart();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyShoppingCart(),"Shopping cart","not verify");
       // Assert.assertEquals(shoppingCartPage.verifyQtyOfLumiaMobile("2"),"2");
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyTotalprice(),"$698.00");
        Thread.sleep(1000);
        shoppingCartPage.clickOnTermsAndService();
        shoppingCartPage.clickOnCheckoutButton();
        Thread.sleep(1000);
        Assert.assertEquals(checkOutGuestLoginPage.verifyWelcomeSignIn(),"Welcome, Please Sign In!","Not Verify");
        Thread.sleep(1000);
        checkOutGuestLoginPage.clickOnRegister();
        Thread.sleep(1000);
        registerPage.enterFirstName("Siddh");
        registerPage.enterLastName("thak");
        registerPage.enterEmail("siddh.thakker");
        registerPage.enterPasswordField("siddhthak12");
        Thread.sleep(1000);
        registerPage.enterConfirmpasswordField("siddhthak12");
        Thread.sleep(1000);
        registerPage.clickOnRegeisterButton();
        Thread.sleep(1000);
        Assert.assertEquals(registerPage.verifyYourRegCompleted(),"Your registration completed");
        Thread.sleep(1000);
        registerPage.clickOnContinuetab();
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyShoppingCart(),"Shopping cart","not verify");
        Thread.sleep(1000);
        shoppingCartPage.clickOnTermsAndService();
        shoppingCartPage.clickOnCheckoutButton();
        Thread.sleep(1000);
        checkoutProductsPage.enterFirstName("Siddh");
        checkoutProductsPage.enterLastName("thak");

        Thread.sleep(1000);
        checkoutProductsPage.enterCountryName("United States");
        Thread.sleep(1000);
        checkoutProductsPage.enterStateName("Alaska");
        checkoutProductsPage.enterCityName("naple");
        checkoutProductsPage.enterAddress1("123 cordin view");
        checkoutProductsPage.enterZipCode("1528");
        checkoutProductsPage.enterPhoneNo("45829011");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnContinue();
        checkoutProductsPage.clickOn2ndOption();
        checkoutProductsPage.clickOnCountinueTab();
        Thread.sleep(1000);
        checkoutProductsPage.clickOnPaymentmethod();
        checkoutProductsPage.clickOnLink();
        Thread.sleep(1000);
        checkoutProductsPage.selectMasterCard("Visa");
        checkoutProductsPage.enterName("H.M.zoe");
        checkoutProductsPage.enterCardNo("4111111111111111");
        checkoutProductsPage.selectMonth("01");
        checkoutProductsPage.selectYear("2025");
        checkoutProductsPage.enterCardCode("123");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnContinueField();
        Assert.assertEquals(checkoutProductsPage.verifyCreditcadText(),"Credit Card");
        Thread.sleep(1000);
        Assert.assertEquals(checkoutProductsPage.verifyShippingmethodText(),"2nd Day Air");
        Thread.sleep(1000);
        Assert.assertEquals(shoppingCartPage.verifyTotalprice(),"$698.00");
        checkoutProductsPage.clickOnConfirm();
        Assert.assertEquals(checkoutProductsPage.verifyThankYouText(),"Thank you");
        Thread.sleep(1000);
        Assert.assertEquals(checkoutProductsPage.verifyOrderSuccessText(),"Your order has been successfully processed!");
        Thread.sleep(1000);
        checkoutProductsPage.clickOnTabContinue();
        Thread.sleep(1000);
        Assert.assertEquals( homePage.verifyWelcomeStore(),"Welcome to our store");
        homePage.clickOnlogoutfield();
        Assert.assertEquals(utility.getcurrentUrl(),"https://demo.nopcommerce.com/","not verify ");


    }

}
