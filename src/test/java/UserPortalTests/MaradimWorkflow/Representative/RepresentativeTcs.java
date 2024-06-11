package UserPortalTests.MaradimWorkflow.Representative;

import Pages.UserPortal.GenericPages.HomePage;
import Pages.UserPortal.GenericPages.ReportDetailsPage;
import UserPortalTests.Generic.LoginTests;
import GlobalSetup.GlobalSetup;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RepresentativeTcs extends GlobalSetup {
    HomePage homePage;
    ReportDetailsPage reportDetailsPage;
    LoginTests loginTests;
    String testData;

    @BeforeClass
    public void setup() {
        homePage = new HomePage(driver.getWebDriver());
        reportDetailsPage = new ReportDetailsPage(driver.getWebDriver());
        loginTests = new LoginTests();
        testData = "TestData/Data/MaradimData.json";
        loginTests.testRepresentativeValidLogin();
    }

    @Test(priority = 1, description = "Check that the representative can navigate to tasks")
    public void checkThatTheRepresentativeCanNavigateToTheCurrentlySubmittedReportTC() {
        performTask("status3", "assignee2");
    }

    @Test(priority = 2, description = "Check that the representative can approve the report", dependsOnMethods = "checkThatTheRepresentativeCanNavigateToTheCurrentlySubmittedReportTC")
    public void checkThatTheRepresentativeCanApproveTheReportTC() {
        performApproval("action3", "option1", "option2", "status4", "assignee2", "action4");
        softAssert.assertAll();
    }

    private void performTask(String status, String assignee) {
        homePage.navigateToTaskPage().showAllTasks()
                .navigateToReportDetails()
                .assertReportState(getJson(testData, "reportStatus", status))
                .assertAssignedTo(getJson(testData, "assignTo", assignee));
    }

    private void performApproval(String action, String option1, String option2, String status, String assignee, String action2) {
        reportDetailsPage.clickOnShowActionsBtn()
                .selectSpecificAction(getJson(testData, "actions", action))
                .checkRequiredActions(getJson(testData, "actionOptions", option1))
                .checkRequiredActions(getJson(testData, "actionOptions", option2))
                .clickYesBtn()
                .assertToastMessageIsDisplayed()
                .assertReportState(getJson(testData, "reportStatus", status))
                .assertAssignedTo(getJson(testData, "assignTo", assignee))
                .clickOnShowActionsBtn().selectSpecificAction(getJson(testData, "actions", action2))
                .checkRequiredActions(getJson(testData,"actionOptions", option1))
                .checkRequiredActions(getJson(testData, "actionOptions", option2))
                .clickYesBtn()
                .assertToastMessageIsDisplayed();
    }
}