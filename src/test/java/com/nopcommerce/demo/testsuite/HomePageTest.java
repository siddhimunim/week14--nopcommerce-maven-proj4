package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage();

  @Test
    public void verifyPageNavigation(){
     homePage.selectMenu("Books");
      Assert.assertEquals(homePage.getTitleOfPage(),"Books","Page Navigated Successfully");

  }
  @Test
    public void  verifyUserShouldNavigateToCellPhonesPageSuccessfully(){
      homePage.mousehoverToElectronics();
      homePage.clickOnCellPhone();
      Assert.assertEquals(homePage.verifyTextCellPhone(),"Cell phones","Not verify");

  }
}
