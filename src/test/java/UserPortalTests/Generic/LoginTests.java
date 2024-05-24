package UserPortalTests.Generic;

import CoreElements.Label;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTests extends GlobalSetup {
    String loginTestData = "TestData/Data/roadComponentsLoginData.json";
    LoginPage loginPage = new LoginPage(driver.getWebDriver());

    @Test
    public void testInspectorValidLogin() {
        boolean greetingMSG =
                loginPage.setUserName(getJson(loginTestData, "inspector","inspectorUsername"))
                        .setPassword(getJson(loginTestData, "inspector","inspectorPassword"))
                        .fillLoginForm();
        Assert.assertTrue(greetingMSG, "Login Failed");
    }

    @Test
    public void testInValidLogin() {
        Label msg =
                loginPage.setInvalidUserName(getJson(loginTestData, "inspector.inspectorInvalidUsername"))
                        .setInvalidPassword(getJson(loginTestData, "inspector.inspectorInvalidPassword"))
                        .clickOnLoginBTNForInvalidCred();
        Assert.assertTrue((msg.isDisplayed()), "in valid login failed");
    }
}
