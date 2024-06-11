package UserPortalTests.Generic;

import CoreElements.Label;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.GenericPages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTests extends GlobalSetup {
    String loginTestData = "TestData/Data/MaradimData.json";
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
    public void testSupervisorValidLogin() {
        boolean greetingMSG =
                loginPage.setUserName(getJson(loginTestData, "roles","supervisor","supervisorUsername"))
                        .setPassword(getJson(loginTestData, "roles","supervisor","supervisorPassword"))
                        .clickLoginBtn()
                        .getGreeting(getJson(loginTestData, "roles","supervisor","supervisorName"));
        Assert.assertTrue(greetingMSG, "Login Failed");
    }

    @Test
    public void testRepresentativeValidLogin() {
        boolean greetingMSG =
                loginPage.setUserName(getJson(loginTestData, "roles","representative","representativeUsername"))
                        .setPassword(getJson(loginTestData, "roles","representative","representativePassword"))
                        .clickLoginBtn()
                        .getGreeting(getJson(loginTestData, "roles","representative","representativeName"));
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
