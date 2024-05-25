package UserPortalTests.Generic;

import CoreElements.Label;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTests extends GlobalSetup {
    String loginTestData = "TestData/Data/roadComponentsData.json";
    LoginPage loginPage = new LoginPage(driver.getWebDriver());

    @Test
    public void testInspectorValidLogin() {
        boolean greetingMSG =
                loginPage.setUserName(getJson(loginTestData, "roles","inspector","inspectorUsername"))
                        .setPassword(getJson(loginTestData, "roles","inspector","inspectorPassword"))
                        .clickLoginBtn()
                        .getGreeting(getJson(loginTestData, "roles","inspector","InspectorName"));
        Assert.assertTrue(greetingMSG, "Login Failed");
    }

    @Test
    public void testInValidLogin() {
        Label errorMsg =
                loginPage.setInvalidUserName(getJson(loginTestData, "roles","inspector","inspectorInvalidUsername"))
                        .setInvalidPassword(getJson(loginTestData, "roles","inspector","inspectorInvalidPassword"))
                        .clickOnLoginBTNForInvalidCred();
        Assert.assertTrue((errorMsg.isDisplayed()), "in valid login failed");
    }
}
