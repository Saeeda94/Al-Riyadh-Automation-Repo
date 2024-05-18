package UserPortalTests.Generic;

import CoreElements.Label;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends GlobalSetup {
    String successInspectorMail = "KK78";
    String successSupervisorMail = "road1.sup";
    String successPassword = "123456";
    LoginPage loginPage = new LoginPage(driver.getWebDriver());

    @Test
    public void testInspectorValidLogin() {
        boolean greetingMSG =
                loginPage.setUserName(successInspectorMail)
                        .setPassword(successPassword)
                        .fillLoginForm();
        Assert.assertTrue(greetingMSG, "Login Failed");
    }

    @Test
    public void testInValidLogin() {
        Label msg =
                loginPage.setInvalidUserName()
                        .setInvalidPassword()
                        .clickOnLoginBTNForInvalidCred();
        Assert.assertTrue((msg.isDisplayed()), "in valid login failed");
    }
}
