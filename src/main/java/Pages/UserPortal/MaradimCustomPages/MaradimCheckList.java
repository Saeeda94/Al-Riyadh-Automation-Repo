package Pages.UserPortal.MaradimCustomPages;

import CoreElements.Driver;
import CoreElements.Element;
import Pages.PagesElements.MaradimCustomElements.CheckListElements;
import Pages.UserPortal.GenericPages.ReportDetailsPage;
import Pages.Utilities;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MaradimCheckList {


    private WebDriver driver;

    public MaradimCheckList(WebDriver driver) {
        this.driver = driver;
    }
    CheckListElements maradimElements = new CheckListElements(Element.getWebDriver());
    @Feature("check that the inspector navigated to the Maradim CheckList")
    @Step("check that the inspector navigated to the Maradim CheckList")
    public boolean isMaradimCheckListPage() {
        return maradimElements.checklistHeader.isDisplayed();
    }
    @Feature("Submit Maradim Form")
    @Step("check The Presence Of Trucks")
    public MaradimCheckList checkThePresenceOfTrucks() {
        maradimElements.thePresenceOfTrucksBTN.radioBtnClick();
        return this;
    }

    @Step("check Cleaning The Road")
    public MaradimCheckList checkCleaningTheRoad() {
        maradimElements.cleaningTheRoadBTN.radioBtnClick();
        return this;
    }

    @Step("check The Presence Of The Technical")
    public MaradimCheckList checkThePresenceOfTheTechnical() {
        maradimElements.thePresenceOfTheTechnicalBTN.radioBtnClick();
        return this;
    }

    @Step("check The Balance")
    public MaradimCheckList checkBalance() {
        maradimElements.balanceBTN.radioBtnClick();
        return this;
    }

    @Step("check The Internet")
    public MaradimCheckList checkInternet() {
        maradimElements.internetBTN.radioBtnClick();
        return this;
    }

    @Step("check The Devices")
    public MaradimCheckList checkDevices() {
        maradimElements.devicesBTN.radioBtnClick();
        return this;
    }

    @Step("Set number of mixed response")
    public MaradimCheckList setTheNumberOfMixedResponse(int count) {
        maradimElements.numberOfMixedResponse.setText(String.valueOf(count));
        return this;
    }

    @Step("check Disinfection Basin")
    public MaradimCheckList checkDisinfectionBasin() {
        maradimElements.disinfectionBasinBTN.radioBtnClick();
        return this;
    }

    @Step("check Spraying Water")
    public MaradimCheckList checkSprayingWater() {
        maradimElements.sprayingWaterBTN.radioBtnClick();
        return this;
    }

    @Step("check Surveillance Cameras")
    public MaradimCheckList checkSurveillanceCameras() {
        maradimElements.surveillanceCamerasBTN.radioBtnClick();
        return this;
    }

    @Step("check Control Tower")
    public MaradimCheckList checkControlTowerBTN() {
        maradimElements.controlTowerBTN.radioBtnClick();
        return this;
    }

    @Step("check Security Guard")
    public MaradimCheckList checkSecurityGuard() {
        maradimElements.securityGuardBTN.radioBtnClick();
        return this;
    }

    @Step("Set number of responses clean stone waste")
    public MaradimCheckList setNumberOfResponsesCleansToneWaste(int count) {
        maradimElements.numberOfResponsesCleanStoneWasteBTN.setText(String.valueOf(count));
        return this;
    }

    @Step("Set number of responses unclean stone waste")
    public MaradimCheckList setNumberOfResponsesUnCleansToneWaste(String value) {
        maradimElements.numberOfResponsesUncleanStoneWaste.setText(value);
        return this;
    }

    @Step("check Secretariat Network And MobilePhone Network")
    public MaradimCheckList checkSecretariatNetworkAndMobilePhoneNetwork() {
        maradimElements.secretariatNetworkAndMobilePhoneNetworkBTN.radioBtnClick();
        return this;
    }

    @Step("check The Presence Of Crusher")
    public MaradimCheckList checkThePresenceOfaCrusher() {
        maradimElements.thePresenceOfCrusherBTN.radioBtnClick();
        return this;
    }

    @Step("check Number Of Cells")
    public MaradimCheckList checkNumberOfCells() {
        maradimElements.numberOfCellsBTN.click();
        return this;
    }

    @Step("check Number Of Cells Value")
    public MaradimCheckList checkNumberOfCellsValue() {
        maradimElements.numberOfCellsValueBTN.click();
        return this;
    }

    @Step("check Sort Site")
    public MaradimCheckList checkSortSite() {
        maradimElements.sortSiteBTN.radioBtnClick();
        return this;
    }

    @Step("check Excreted Materials")
    public MaradimCheckList checkExcretedMaterials() {
        maradimElements.excretedMaterialsBTN.radioBtnClick();
        return this;
    }

    @Step("check Electronic Gate")
    public MaradimCheckList checkElectronicGate() {
        maradimElements.electronicGateBTN.radioBtnClick();
        return this;
    }

    @Step("Click on submit")
    public ReportDetailsPage clickOnSubmit() {
        driver.navigate().refresh();
        maradimElements.submitBTN.click();
        return new ReportDetailsPage(driver);
    }

    @Step("Get successful submit message")
    public boolean getSuccessfulSubmitMSG() {
        return maradimElements.successSubmitMSG.isDisplayed();
    }
    public void clickOnSuccessMSG(){
        maradimElements.successSubmitMSG.click();
    }

    public boolean getErrorMessage() {
        return maradimElements.missingFiled.isDisplayed();
    }
}
