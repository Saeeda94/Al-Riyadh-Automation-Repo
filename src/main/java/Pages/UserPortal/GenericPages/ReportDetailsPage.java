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
    public String getReportNumber(){
       return reportDetailsElements.reportNumber.getText();
    }
    @Step("check the report number")
    public boolean isReportNumberDisplayed() {
        if (getReportNumber().equals(getReportNumber())){
        return reportDetailsElements.reportNumber.isDisplayed();}
        else return false;
    }
}
