package UserPortalTests.MaradimWorkflow.SupervisorRole;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.GenericPages.HomePage;
import Pages.UserPortal.GenericPages.ReportDetailsPage;
import org.testng.annotations.Test;

public class NavigateToTasksTCs extends GlobalSetup{
    HomePage homePage = new HomePage(driver.getWebDriver());
    ReportDetailsPage reportDetailsPage = new ReportDetailsPage(driver.getWebDriver());
    @Test(description = "Check that the supervisor can navigate to tasks")
    public void checkThatTheSupervisorCanNavigateToTasksTCs()  {
       homePage.navigateToTaskPage().showAllTasks().navigateToReportDetails().isReportNumberDisplayed();
    }
    @Test(description = "Check that the supervisor can approve the report")
    public void checkThatTheSupervisorCanApproveTheReportTCs()  {
        reportDetailsPage.clickOnShowActionsBtn();
    }
}
