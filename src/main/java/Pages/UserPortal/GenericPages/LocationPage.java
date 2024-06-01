package Pages.UserPortal.GenericPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.LocationPageElements;
import Pages.UserPortal.RoadComponentsCustomPages.RoadComponentsCheckList;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LocationPage {

    private final WebDriver driver;
    private final LocationPageElements locationPageElements;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
        this.locationPageElements = new LocationPageElements(Element.getWebDriver());
    }

    @Feature("Submit Form")
    @Step("Select street")
    public LocationPage selectStreet()  {
       locationPageElements.selectedStreet.radioBtnClick();
        return this;
    }
    @Step("Click on Next Button")
    public RoadComponentsCheckList navigateToCheckList()  {
        locationPageElements.nextBtn.click();
        return new RoadComponentsCheckList(driver);
    }
}