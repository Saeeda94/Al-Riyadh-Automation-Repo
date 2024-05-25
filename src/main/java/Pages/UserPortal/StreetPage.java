package Pages.UserPortal;

import CoreElements.Element;
import Pages.PagesElements.DistrictElements;
import Pages.PagesElements.StreetElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class StreetPage {

    private final WebDriver driver;
    StreetElements streetElements;
    public StreetPage(WebDriver driver) {
        this.driver = driver;
        this.streetElements = new StreetElements(Element.getWebDriver());
    }

    @Feature("Submit Form")
    @Step("Select Street")
    public StreetPage selectStreet(String streetName){
        if(streetElements.getStreetName(streetName).getLabel().equals(streetName))
            streetElements.selectedStreet.radioBtnClick();
        else System.out.print("District not found");
        return this;
    }
    @Step("Click on Next Button")
    public CheckList navigateToCheckList()  {
        streetElements.nextButton.click();
        return new CheckList(driver);
    }
}
