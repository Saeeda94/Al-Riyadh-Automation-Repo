package UserPortalTests.RoadComponentWorkflow.SupervisorRole;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.*;
import org.testng.annotations.Test;

public class IntegrationTCs extends GlobalSetup {
    LoginPage loginPage=new LoginPage(driver.getWebDriver());
    HomePage homePage=new HomePage(driver.getWebDriver());
    CheckList checkList=new CheckList(driver.getWebDriver());
    ReportDetailsPage reportDetailsPage=new ReportDetailsPage(driver.getWebDriver());
    TasksPage tasksPage=new TasksPage(driver.getWebDriver());
    public String getReportNumber1() {
        return reportDetailsPage.getCardBodyText();
    }
    @Test
    public void testIntegration1()throws InterruptedException{
        loginPage.fillLoginForm("33s","123456");
        homePage.openForm();
        checkList.fillForm(2);
    }
    @Test
    public void testIntegration2() throws InterruptedException {
        loginPage.fillLoginForm("33K","123456");
        homePage.navigateToTaskPage();
        tasksPage.checkLabel("004103124000018");
        System.out.println("Hello");
    }
}
