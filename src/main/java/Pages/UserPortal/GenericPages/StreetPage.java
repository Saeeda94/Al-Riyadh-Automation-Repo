package Pages.UserPortal.GenericPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.StreetElements;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import Pages.UserPortal.RoadComponentsCustomPages.RoadComponentsCheckList;
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
    public StreetPage selectStreet(){

            streetElements.selectedStreet.radioBtnClick();


        return this;
    }
    @Step("Click on Next Button")
    public RoadComponentsCheckList navigateToRoadComponentCheckList()  {
        streetElements.nextButton.click();
        return new RoadComponentsCheckList(driver);
    }

    @Step("navigate To Maradim CheckList")
    public MaradimCheckList navigateToMaradimCheckList()  {
        streetElements.nextButton.click();
        return new MaradimCheckList(driver);
    }
}
