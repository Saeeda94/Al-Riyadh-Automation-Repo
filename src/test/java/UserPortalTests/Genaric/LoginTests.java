package UserPortalTests.Genaric;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends GlobalSetup {
    String successInspectorMail = "KK78";
    String successSupervisorMail = "road1.sup";
    String successPassword = "123456";
    LoginPage loginPage=new LoginPage(driver.getWebDriver());
    @Test(priority = 1)
    public void testInspectorValidLogin() throws InterruptedException {
        Assert.assertTrue(loginPage.fillLoginForm(successInspectorMail,successPassword).getGreetingLabel(),"Login Failed");
        System.out.println("Hello");
    }
    @Test(priority = 2)
    public void testSupervisorValidLogin() throws InterruptedException {
        Assert.assertTrue(loginPage.fillLoginForm(successSupervisorMail,successPassword).getGreetingLabel(),"Login Failed");
        System.out.println("Hello");
    }
    @Test(priority = 3)
    public void testInValidLogin(){
        loginPage.fillDataForInvalidLogin();
        //Assert.assertTrue((loginPage.checkInvalidMSG()),"Login Success");
    }
}
