package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Link;
import CoreElements.RadioButton;
import Pages.PagesElements.LocationPageElements;
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
    public CheckList navigateToCheckList()  {
        locationPageElements.nextBtn.click();
        return new CheckList(driver);
    }
}