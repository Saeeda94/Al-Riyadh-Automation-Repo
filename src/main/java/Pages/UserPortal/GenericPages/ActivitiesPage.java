package Pages.UserPortal.GenericPages;
import CoreElements.Element;
import Pages.PagesElements.GenericElements.ActivitiesElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
public class ActivitiesPage {
    private WebDriver driver;

    /*** AddNewReport Page Locators ***/
    public ActivitiesPage(WebDriver driver) {
        this.driver = driver;
    }
    ActivitiesElements activitiesElements=new ActivitiesElements(Element.getWebDriver());


    @Feature("Submit Form")
    @Step("select activity")

    public ActivitiesPage selectActivity(String activityName) {
        activitiesElements.activityDropdown2.click();
        activitiesElements.getActivityName(activityName).click();
        return this;
    }

    @Step("select report type")
    public ActivitiesPage selectReportType(){
        activitiesElements.selectReportType.click();
        return this;
    }
    @Step("click on next button and navigate to location page")
    public MunicipalityPage NavigateToMunicipalityPage() {
        activitiesElements.nextButton.click();
        return new MunicipalityPage(driver);
    }
    @Step("click on next button and navigate to District page")
    public DistrictPage navigateToDistrictPage() {
        activitiesElements.nextButton.click();
        return new DistrictPage(driver);
    }

}
