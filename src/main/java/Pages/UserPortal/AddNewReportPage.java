package Pages.UserPortal;
import CoreElements.Element;
import Pages.PagesElements.AddNewReportElements;
import org.openqa.selenium.WebDriver;
public class AddNewReportPage {
    private WebDriver driver;

    /*** AddNewReport Page Locators ***/
    public AddNewReportPage(WebDriver driver) {
        this.driver = driver;
    }
    AddNewReportElements addNewReportElements=new AddNewReportElements(Element.getWebDriver());

    public LocationPage selectActivity() throws InterruptedException {
        Thread.sleep(10000);
        addNewReportElements.activityDropdown2.click(); // To expand the dropdown
        addNewReportElements.selectReportType.click();
        addNewReportElements.nextButton.click();
        return new LocationPage(driver);
    }
}
