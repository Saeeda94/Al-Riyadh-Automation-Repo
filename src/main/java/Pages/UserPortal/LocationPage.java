package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Link;
import CoreElements.RadioButton;
import Pages.PagesElements.LocationPageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationPage {

    private WebDriver driver;

    /*** Location Page Locators ***/
    public LocationPage(WebDriver driver) {
        this.driver = driver;
    }
    LocationPageElements locationPageElements=new LocationPageElements(Element.getWebDriver());
    int locationTreeCount=2;
    public CheckList navigateToCheckList() throws InterruptedException {
        Thread.sleep(50000);
        locationPageElements.locationTree1.click();
        for(int i=0;i<locationTreeCount;i++){
        locationPageElements.locationTree2.click();}
        locationPageElements.radioButton.radioBtnClick();
//        locationPageElements.nextBtn.click();
        return new CheckList(driver);
    }
}
