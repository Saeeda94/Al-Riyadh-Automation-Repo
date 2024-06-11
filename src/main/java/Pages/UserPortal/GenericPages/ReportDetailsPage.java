package Pages.UserPortal.GenericPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.ReportDetailsElements;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import io.qameta.allure.Step;
import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReportDetailsPage {
    private WebDriver driver;
    // Locator for the card body element
    ReportDetailsElements reportDetailsElements = new ReportDetailsElements(Element.getWebDriver());

    // Constructor
    public ReportDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to interact with report details, for example, to get its text.
    public String getReportNumber() {
        return reportDetailsElements.reportNumber.getText();
    }

    @Step("check clicking on show actions")
    public ReportDetailsPage clickOnShowActionsBtn() {
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

    @Step("Select action")
    public ReportDetailsPage selectSpecificAction(String actionName) {
        reportDetailsElements.getSpecificAction(actionName).click();
        return this;
    }
    @SneakyThrows
    @Step("Check the required actions")
    public ReportDetailsPage checkRequiredActions(String optionName) {
        Thread.sleep(2000);
        if (reportDetailsElements.checkTheRequiredActions(optionName).getText().contains("*")) {
            System.out.println("The action is required");
            if (optionName.equals(" الملاحظة ")) {
                reportDetailsElements.notes.setText("This is a note");
            } else if (optionName.equals(" الملحقات ")) {
                    reportDetailsElements.attachments.uploadPhotoToAllElements("C:/Users/DELL/Pictures/images/Test.PNG");
                reportDetailsElements.attachments.uploadPhotoToAllElements("C:/Users/DELL/Pictures/images/test2.PNG");
            }
            //will check the action type(attachment or note) firstly then fill the required actions then click on the yes button
        }
        return this;
    }

    @Step("Click on Yes Button")
    public ReportDetailsPage clickYesBtn() {
        reportDetailsElements.btnYes.click();
        return this;
    }

    @Step("Assert the presence of the toast message")
    public ReportDetailsPage assertToastMessageIsDisplayed() {
        reportDetailsElements.txtSuccessMSG.isDisplayed();
        return this;
    }

    @Step("Click on No Button")
    public ReportDetailsPage clickNoBtn() {
        reportDetailsElements.btnNo.click();
        return this;
    }
}
