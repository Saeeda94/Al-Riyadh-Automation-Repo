package Pages.PagesElements.MaradimCustomElements;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.RadioButton;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckListElements {
    public WebDriver driver;

    public CheckListElements(WebDriver driver) {
        this.driver = driver;
    }

    public Label checklistHeader = new Label(By.xpath("//div[contains(@class,'card-header')]/div[contains(@class,'font-weight-bold')]"));
    public RadioButton
            thePresenceOfTrucksBTN = new RadioButton(By.xpath("//label[@for='6cb0c549-4dba-40f9-a3e5-808e7fd0ce1b-موجودة0']"));
    public RadioButton
            cleaningTheRoadBTN = new RadioButton(By.xpath("//label[text()='نظيف']"));
    public RadioButton
            thePresenceOfTheTechnicalBTN = new RadioButton(By.xpath("//label[@for='c5bd8ed5-7d51-4fd2-b692-679f4b20341d-موجود0']"));
    public RadioButton
            balanceBTN = new RadioButton(By.xpath("//label[@for='c864f77d-1463-44ff-8501-1cf0c06099c2-يعمل0']"));
    public RadioButton
            internetBTN = new RadioButton(By.xpath("//label[@for='bd85b77b-f7f8-4f72-9696-9aa67e5e93c3-موجود0']"));
    public RadioButton
            devicesBTN = new RadioButton(By.xpath("//label[@for='b30e1e96-dece-460e-ae83-51bab44bbe76-موجود0']"));
    public TextBox
            numberOfMixedResponse = new TextBox(By.xpath("(//input[@id='feedback_min_accepted_value'])[1]"));
    public RadioButton
            disinfectionBasinBTN = new RadioButton(By.xpath("//label[@for='9a9c9d3e-339d-4841-8b71-4be8da83fd5b-يوجد0']"));
    public RadioButton
            sprayingWaterBTN = new RadioButton(By.xpath("//label[@for='9dce0f50-c7f4-490f-b274-bc878732b4aa-يوجد0']"));
    public RadioButton
            surveillanceCamerasBTN = new RadioButton(By.xpath("//label[@for='2b340fc3-00cb-469e-86f1-ba1d6b5eb6e2-غير موجود1']"));
    public RadioButton
            controlTowerBTN = new RadioButton(By.xpath("//label[@for='68f4074d-c198-43f5-a74d-0652c90ab2d7-موجود0']"));
    public RadioButton
            securityGuardBTN = new RadioButton(By.xpath("//label[@for='eda2df0d-6b59-4f19-a572-13ab0e0bfb34-غير موجود1']"));
    public TextBox
            numberOfResponsesCleanStoneWasteBTN = new TextBox(By.xpath("(//input[@id='feedback_min_accepted_value'])[2]"));
    public TextBox
            numberOfResponsesUncleanStoneWaste = new TextBox(By.xpath("(//input[@id='feedback_min_accepted_value'])[3]"));
    public RadioButton
            secretariatNetworkAndMobilePhoneNetworkBTN = new RadioButton(By.xpath("//label[@for='646c937c-d2e5-43fe-9dc5-45b77944fc83-غير موجود1']"));
    public RadioButton
            thePresenceOfCrusherBTN = new RadioButton(By.xpath("//label[@for='0751e7af-668b-44c9-bd67-f464f8002279-تعمل0']"));
    public Button
            numberOfCellsBTN = new Button(By.xpath("//button[@type='button' and @tabindex='-1' and contains(@class, 'ngx-dropdown-button')]"));
    public Button
            numberOfCellsValueBTN = new Button(By.xpath("//li[text()=' 7 ']"));
    public RadioButton
            sortSiteBTN = new RadioButton(By.xpath("//label[contains(@for,'مناسب0')]"));
    public RadioButton
            excretedMaterialsBTN = new RadioButton(By.xpath("//label[contains(@for,'معزولة0')]"));
    public RadioButton
            electronicGateBTN = new RadioButton(By.xpath("//label[@for='2213f42c-aa38-4bfc-b771-fb59b36943ce-تعمل0']"));
    public Button
            submitBTN = new Button(By.xpath("//span[text()='تسجيل']"));
    public Label
            successSubmitMSG = new Label(By.xpath("//*[@id=\"toast-container\"]"));
    public Label
            missingFiled = new Label(By.xpath("//div[text()=' هذا الحقل مطلوب. ' and contains(@class, 'chk-text-error')]"));
    public Label bodyElement=new Label(By.cssSelector(".chk-main-content"));

}
