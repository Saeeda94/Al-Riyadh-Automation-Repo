package UserPortalTests.Generic;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LogoutTests extends GlobalSetup {
    LoginTests loginTests = new LoginTests();
    HomePage homePage=new HomePage(driver.getWebDriver());
//    @BeforeClass
//    public void login() {
//        loginTests.testInspectorValidLogin();
//    }

    @Test
    public void testLogout() {
        boolean loginBTNIsExist=
                homePage.clickOnArrowBTN()
                        .clickOnLogoutLink()
                        .clickOnLogoutBTN();
        Assert.assertTrue(loginBTNIsExist,"user can not be able to logout");
    }

}
