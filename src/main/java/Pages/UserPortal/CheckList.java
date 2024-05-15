package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Label;
import CoreElements.TextBox;
import Pages.PagesElements.CheckListElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckList {


    private WebDriver driver;

    public CheckList(WebDriver driver) {
        this.driver = driver;
    }
    CheckListElements checkListElements=new CheckListElements(Element.getWebDriver());
    public ReportDetailsPage fillForm() throws InterruptedException {
        Thread.sleep(3000);
        checkListElements.mainFactorBtn.click();
         checkListElements.mainFactorValue.click();
        checkListElements.secondSection.click();
        checkListElements.length.typeText("10");
        checkListElements.gpsField.click();
        checkListElements.importanceBtn.click();
        checkListElements.importanceValue.click();
        checkListElements.attachmentButton.typeText("C:/Users/DELL/Pictures/images/Test.PNG");
        checkListElements.attachmentButton.typeText("C:/Users/DELL/Pictures/images/Test2.PNG");
        Thread.sleep(30000);
        checkListElements.submitButton.click();
        Thread.sleep(30000);
        return new ReportDetailsPage(driver);
    }
}
