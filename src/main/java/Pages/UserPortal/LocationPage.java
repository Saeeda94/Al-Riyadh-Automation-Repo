package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Link;
import CoreElements.RadioButton;
import Pages.PagesElements.LocationPageElements;
import org.openqa.selenium.WebDriver;

public class LocationPage {

    private final WebDriver driver;
    private final LocationPageElements locationPageElements;
    private static final int LOCATION_TREE_COUNT = 2;

    public LocationPage(WebDriver driver) {
        this.driver = driver;
        this.locationPageElements = new LocationPageElements(Element.getWebDriver());
    }

    public CheckList navigateToCheckList() throws InterruptedException {
        Thread.sleep(50000);
        locationPageElements.locationTree1.click();
        for(int i = 0; i < LOCATION_TREE_COUNT; i++){
            locationPageElements.locationTree2.click();
        }
        locationPageElements.radioButton.radioBtnClick();
        return new CheckList(driver);
    }
}