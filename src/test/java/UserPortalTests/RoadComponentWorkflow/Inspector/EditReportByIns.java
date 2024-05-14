package UserPortalTests.RoadComponentWorkflow.Inspector;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.HomePage;
import Pages.UserPortal.LoginPage;
import org.testng.annotations.Test;

public class EditReportByIns extends GlobalSetup {
    LoginPage loginPage = new LoginPage(driver.getWebDriver());
    HomePage homePage = new HomePage(driver.getWebDriver());
    /**Assign To MOS TCs after reviewing**/
    @Test
    public void editReportTC() throws InterruptedException {
        loginPage.fillLoginForm("33s", "123456");
       // homePage.navigateToTaskPage().navigateToReportDetailsPage().editReportByInspector();
    }

    @Test
    public void editReportTC2() throws InterruptedException {
        loginPage.fillLoginForm("33s", "123456");
       // homePage.navigateToTaskPage().navigateToReportDetailsPage().approveTheEditedReportByIns();
    }
}
