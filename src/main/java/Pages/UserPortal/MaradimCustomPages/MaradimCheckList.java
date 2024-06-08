package Pages.UserPortal.MaradimCustomPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.CheckListElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MaradimCheckList {


    private WebDriver driver;

    public MaradimCheckList(WebDriver driver) {
        this.driver = driver;
    }
    String testData = "TestData/Data/MaradimData.json";
    CheckListElements maradimElements = new CheckListElements(Element.getWebDriver());
    @Feature("check that the inspector navigated to the Maradim CheckList")

    @Step("Answer question option with space")
    public MaradimCheckList answerSpecificQuestionOptionWithSpace(String question, String option){
       maradimElements.getSpecificQuestionOptionWithSpace(question, option).radioBtnClick();
        return this;
    }
//    @Step("Upload first image")
//    public MaradimCheckList uploadFirstImage(String parentQuestion,int questionIndex,String path){
//        maradimElements.uploadImage(parentQuestion,questionIndex).setText(path);
//        return this;
//    }
    @Step("Answer specific question option")
    public MaradimCheckList answerSpecificQuestionOption(String question, String option){
        maradimElements.getSpecificQuestionOption(question, option).radioBtnClick();
        return this;
    }
    @Step("Answer question input")
    public MaradimCheckList answerInputForQuestion(String question, String value){
        maradimElements.getInputForQuestion(question).setText(value);
        return this;
    }
    @Step("Answer dropdown")
    public MaradimCheckList answerDropdown(String question, String index){
        maradimElements.getSelectButtonForDropdown(question).click();
        maradimElements.getOptionFromDropdown(index).click();
        return this;
    }
    @Step("fill all attachments")
    public MaradimCheckList fillAllAttachments(String filePath){
        maradimElements.btnAttachment.uploadPhotoToAllElements(filePath);
        return this;
    }
    @Step("Click on the submit button")
    public MaradimCheckList clickSubmit(){
        driver.navigate().refresh();
        maradimElements.btnSubmit.click();
        return this;
    }
    @Step("Click on the cancel button")
    public MaradimCheckList clickCancel(){
        maradimElements.btnCancel.click();
        return this;
    }


    @Step("Assert the presence of the successful message")
    public boolean assertTheDisplayOfTheSuccessfulMsg(){
        return maradimElements.txtSuccessMsg.isDisplayed();
    }
}
