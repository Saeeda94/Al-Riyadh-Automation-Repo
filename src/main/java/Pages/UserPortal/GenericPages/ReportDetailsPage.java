package Pages.UserPortal.GenericPages;
import CoreElements.Element;
import Pages.PagesElements.GenericElements.ReportDetailsElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReportDetailsPage {
    private WebDriver driver;

    // Locator for the card body element
    ReportDetailsElements reportDetailsElements=new ReportDetailsElements(Element.getWebDriver());
    // Constructor
    public ReportDetailsPage(WebDriver driver){
        this.driver = driver;
    }

    // Method to interact with report details, for example, to get its text.
    public String getReportNumber()  {


       return reportDetailsElements.reportNumber.getText();
    }
    @Step("check the report number")
    public boolean isReportNumberDisplayed()  {
       return reportDetailsElements.reportNumber.isDisplayed();
    }
    @Step("check clicking on show actions")
    public ReportDetailsPage clickOnShowActionsBtn()  {
        reportDetailsElements.showActions.click();
        return this;
    }
    @Step("Assert the content of the report state")
    public ReportDetailsPage assertReportState(String reportState) {
        reportDetailsElements.txtReportState.softAssertionEqual(reportState);
        return this;
    }

    @Step("Assert the content of the assigned to")
    public ReportDetailsPage assertAssignedTo(String assignedToName) {
        reportDetailsElements.txtAssignedTo.softAssertionEqual(assignedToName);
        return this;
    }

}
