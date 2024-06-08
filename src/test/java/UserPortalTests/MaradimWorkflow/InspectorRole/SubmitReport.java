package UserPortalTests.MaradimWorkflow.InspectorRole;

import Pages.UserPortal.GenericPages.HomePage;
import Pages.UserPortal.GenericPages.ReportDetailsPage;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import UserPortalTests.Generic.LoginTests;
import UserPortalTests.Generic.LogoutTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import GlobalSetup.GlobalSetup;

public class SubmitReport extends GlobalSetup {
    HomePage homePage = new HomePage(driver.getWebDriver());
    MaradimCheckList maradimCheckList = new MaradimCheckList(driver.getWebDriver());
    ReportDetailsPage reportDetailsPage = new ReportDetailsPage(driver.getWebDriver());
    LogoutTests logoutTests = new LogoutTests();
    String testData = "TestData/Data/MaradimData.json";

    @BeforeMethod(description = "prepare the data for the test")
    public void fillTestDate() {
        homePage.navigateToActivitiesPage()
                .selectActivity(getJson(testData, "pages", "Activities", "ActivityName"))
                .selectReportType()
                .navigateToDistrictPage()
                .selectDistrict(getJson(testData, "pages", "Locations", "districtName"))
                .navigateToStreetPage()
                .selectStreet().navigateToMaradimCheckList()
                .answerSpecificQuestionOptionWithSpace
                        (getJson(testData, "checkList", "questions", "question1"), getJson(testData, "checkList", "answers", "answer1"))
                .answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question2"), getJson(testData, "checkList", "answers", "answer2")).
                answerSpecificQuestionOptionWithSpace
                        (getJson(testData, "checkList", "questions", "question3"), getJson(testData, "checkList", "answers", "answer3")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question4"), getJson(testData, "checkList", "answers", "answer4")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question5"), getJson(testData, "checkList", "answers", "answer5")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question6"), getJson(testData, "checkList", "answers", "answer6")).
                answerInputForQuestion
                        (getJson(testData, "checkList", "questions", "question7"), getJson(testData, "checkList", "answers", "answer7")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question8"), getJson(testData, "checkList", "answers", "answer8")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question9"), getJson(testData, "checkList", "answers", "answer9")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question10"), getJson(testData, "checkList", "answers", "answer10")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question11"), getJson(testData, "checkList", "answers", "answer11")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question12"), getJson(testData, "checkList", "answers", "answer12")).
                answerInputForQuestion
                        (getJson(testData, "checkList", "questions", "question13"), getJson(testData, "checkList", "answers", "answer13")).
                answerInputForQuestion
                        (getJson(testData, "checkList", "questions", "question14"), getJson(testData, "checkList", "answers", "answer14")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question15"), getJson(testData, "checkList", "answers", "answer15")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question16"), getJson(testData, "checkList", "answers", "answer16")).
                answerDropdown
                        (getJson(testData, "checkList", "questions", "question17"), getJson(testData, "checkList", "answers", "answer17")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question18"), getJson(testData, "checkList", "answers", "answer18")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question19"), getJson(testData, "checkList", "answers", "answer19")).
                answerSpecificQuestionOption
                        (getJson(testData, "checkList", "questions", "question20"), getJson(testData, "checkList", "answers", "answer20")).
                fillAllAttachments("C:/Users/DELL/Pictures/images/Test.PNG");

    }

    @Test(description = "Check that the inspector can navigate to Maradim CheckList")
    public void checkThatTheInspectorCanNavigateToChecklistTCs() {
        Assert.assertEquals(maradimCheckList.clickSubmit().assertTheDisplayOfTheSuccessfulMsg(), true);
        reportDetailsPage.assertReportState(getJson(testData, "reportStatus", "status1"))
                .assertAssignedTo(getJson(testData, "assignTo", "assignee1"));
        softAssert.assertAll();
        logoutTests.testLogout();
    }
}
