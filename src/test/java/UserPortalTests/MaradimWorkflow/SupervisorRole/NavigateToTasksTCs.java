package UserPortalTests.MaradimWorkflow.SupervisorRole;
import GlobalSetup.GlobalSetup;
import Pages.UserPortal.GenericPages.HomePage;
import org.testng.annotations.Test;

public class NavigateToTasksTCs extends GlobalSetup{
    HomePage homePage = new HomePage(driver.getWebDriver());

    @Test(description = "Check that the supervisor can navigate to tasks")
    public void checkThatTheSupervisorCanNavigateToTasksTCs()  {
        homePage.navigateToTaskPage().showAllTasks().navigateToReportDetails().isReportNumberDisplayed();

    }
}
