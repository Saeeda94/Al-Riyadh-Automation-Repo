package Pages.UserPortal.GenericPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.DistrictElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class DistrictPage {

    private final WebDriver driver;
    DistrictElements districtElements;
    public DistrictPage(WebDriver driver) {
        this.driver = driver;
        this.districtElements = new DistrictElements(Element.getWebDriver());
    }

    @Feature("Submit Form")
    @Step("Select District")
    public DistrictPage selectDistrict(String districtName){
        if(districtElements.getDistrictName(districtName).getLabel().equals(districtName))
            districtElements.showStreets.click();
        else System.out.print("District not found");
        return this;
    }
    @Step("Navigate To Street Page")
    public StreetPage navigateToStreetPage()  {
         return new StreetPage(driver);
    }
}
