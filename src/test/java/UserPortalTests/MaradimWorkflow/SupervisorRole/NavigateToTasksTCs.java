package UserPortalTests.MaradimWorkflow.SupervisorRole;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.GenericPages.HomePage;
import Pages.UserPortal.GenericPages.ReportDetailsPage;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import UserPortalTests.Generic.LoginTests;
import UserPortalTests.Generic.LogoutTests;
import org.testng.annotations.*;

public class NavigateToTasksTCs extends GlobalSetup {
    HomePage homePage;
    ReportDetailsPage reportDetailsPage;
    LoginTests loginTests;
    String testData;
    MaradimCheckList maradimCheckList = new MaradimCheckList(driver.getWebDriver());
    LogoutTests logoutTests = new LogoutTests();

    @BeforeClass
    public void setup() {
        homePage = new HomePage(driver.getWebDriver());
        reportDetailsPage = new ReportDetailsPage(driver.getWebDriver());
        loginTests = new LoginTests();
        testData = "TestData/Data/MaradimData.json";
        loginTests.testSupervisorValidLogin();
    }

    @Test(priority = 1, description = "Check that the supervisor can navigate to tasks")
    public void checkThatTheSupervisorCanNavigateToTheCurrentlySubmittedReportTC() {
        performTask("status1", "assignee1");
    }

    @Test(priority = 2, description = "Check that the supervisor can approve the report", dependsOnMethods = "checkThatTheSupervisorCanNavigateToTheCurrentlySubmittedReportTC")
    public void checkThatTheSupervisorCanApproveTheReportTCs() {
        performApproval("action1", "option1", "option2", "status3", "assignee2");
        softAssert.assertAll();
    }

    private void performTask(String status, String assignee) {
        homePage.navigateToTaskPage().showAllTasks()
                .navigateToReportDetails()
                .assertReportState(getJson(testData, "reportStatus", status))
                .assertAssignedTo(getJson(testData, "assignTo", assignee));
    }

    private void performApproval(String action, String option1, String option2, String status, String assignee) {
        reportDetailsPage.clickOnShowActionsBtn().selectSpecificAction(getJson(testData, "actions", action))
                .checkRequiredActions(getJson(testData, "actionOptions", option1))
                .checkRequiredActions(getJson(testData, "actionOptions", option2))
                .clickYesBtn()
                .assertToastMessageIsDisplayed()
                .assertReportState(getJson(testData, "reportStatus", status))
                .assertAssignedTo(getJson(testData, "assignTo", assignee));
    }
    @AfterClass
    public void clickOnSignOut() {
        maradimCheckList.clickOnSuccessMsg();
        logoutTests.testLogout();
    }
}