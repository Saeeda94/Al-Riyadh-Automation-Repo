package Pages.UserPortal;

import CoreElements.Element;
import CoreElements.Label;
import CoreElements.TextBox;
import Pages.PagesElements.CheckListElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckList {


    private WebDriver driver;

    public CheckList(WebDriver driver) {
        this.driver = driver;
    }
    CheckListElements checkListElements=new CheckListElements(Element.getWebDriver());
    public ReportDetailsPage fillForm() throws InterruptedException {

        checkListElements.mainFactorBtn.click();
         checkListElements.mainFactorValue.click();
        checkListElements.secondSection.click();
        checkListElements.length.setText("10");
        checkListElements.gpsField.click();
        checkListElements.importanceBtn.click();
        checkListElements.importanceValue.click();
        checkListElements.attachmentButton.setText("C:/Users/DELL/Pictures/images/Test.PNG");
        checkListElements.attachmentButton.setText("C:/Users/DELL/Pictures/images/Test2.PNG");
        Thread.sleep(70000);
        checkListElements.submitButton.click();
        return new ReportDetailsPage(driver);
    }
}
