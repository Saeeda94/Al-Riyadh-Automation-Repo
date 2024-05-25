package Pages.UserPortal;

import CoreElements.Element;
import Pages.PagesElements.MunicipalityElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MunicipalityPage {

    private final WebDriver driver;
    MunicipalityElements municipalityElements;
    public MunicipalityPage(WebDriver driver) {
        this.driver = driver;
        this.municipalityElements = new MunicipalityElements(Element.getWebDriver());
    }

    @Feature("Submit Form")
    @Step("Select Municipality")
    public MunicipalityPage selectMunicipality(String municipalityName){
        if(municipalityElements.getMunicipalityName(municipalityName).getLabel().equals(municipalityName))
            municipalityElements.showDistricts.click();
        else System.out.print("Municipality not found");
        return this;
    }
    @Step("Navigate To District Page")
    public DistrictPage navigateToDistrictPage()  {
       return new DistrictPage(driver);
    }
}
