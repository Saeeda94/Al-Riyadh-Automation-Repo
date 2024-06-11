package UserPortalTests.Generic;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.GenericPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTests extends GlobalSetup {
    HomePage homePage=new HomePage(driver.getWebDriver());
    @Test
    public void testLogout() {
        boolean loginBTNIsExist=
                homePage.clickOnArrowBTN()
                        .clickOnLogoutLink()
                        .clickOnLogoutBTN();
        Assert.assertTrue(loginBTNIsExist,"user can not be able to logout");
    }

}
