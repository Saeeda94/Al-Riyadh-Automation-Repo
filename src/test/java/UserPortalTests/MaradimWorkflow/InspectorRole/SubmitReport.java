package UserPortalTests.MaradimWorkflow.InspectorRole;

import Pages.UserPortal.GenericPages.HomePage;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import UserPortalTests.Generic.LoginTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import GlobalSetup.GlobalSetup;

public class SubmitReport extends GlobalSetup {
    HomePage homePage = new HomePage(driver.getWebDriver());
    MaradimCheckList maradimCheckList = new MaradimCheckList(driver.getWebDriver());
    String testData = "TestData/Data/MaradimData.json";

    @Test(description = "Check that the inspector can navigate to Maradim CheckList")
    public void checkThatTheInspectorCanNavigateToChecklistTCs() {
        homePage.navigateToActivitiesPage()
                .selectActivity(getJson(testData, "pages", "Activities", "ActivityName"))
                .selectReportType()
                .navigateToDistrictPage()
                .selectDistrict(getJson(testData, "pages", "Locations", "districtName"))
                .navigateToStreetPage()
                .selectStreet().navigateToMaradimCheckList().isMaradimCheckListPage();
        Assert.assertEquals(maradimCheckList.isMaradimCheckListPage(), true, "Maradim CheckList Page is not displayed");
    }

    @Test(description = "Check that the inspector can submit the form")
    public void checkThatTheInspectorCanSubmitFormTCs() {
        maradimCheckList.checkThePresenceOfTrucks()
                .checkCleaningTheRoad()
                .checkThePresenceOfTheTechnical()
                .checkBalance()
                .checkInternet()
                .checkDevices()
                .setTheNumberOfMixedResponse(5)
                .checkDisinfectionBasin()
                .checkSprayingWater()
                .checkSurveillanceCameras()
                .checkControlTowerBTN()
                .checkSecurityGuard()
                .setNumberOfResponsesCleansToneWaste(5)
                .setNumberOfResponsesUnCleansToneWaste("1")
                .checkSecretariatNetworkAndMobilePhoneNetwork()
                .checkThePresenceOfaCrusher()
                .checkNumberOfCells()
                .checkNumberOfCellsValue()
                .checkSortSite()
                .checkExcretedMaterials()
                .checkElectronicGate()
                .clickOnSubmit();
        Assert.assertTrue(maradimCheckList.getSuccessfulSubmitMSG(), "The Form is not submitted successfully");
        maradimCheckList.clickOnSuccessMSG();
    }

}
