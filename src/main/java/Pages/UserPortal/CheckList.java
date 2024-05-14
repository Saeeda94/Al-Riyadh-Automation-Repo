package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckList {


    private WebDriver driver;

    public CheckList(WebDriver driver) {
        this.driver = driver;
    }


    Button mainFactorBtn = new Button(By.cssSelector(".ngx-dropdown-container .ngx-dropdown-button"));
    Label secondSection = new Label(By.xpath("//chk-form-builder/nav/div[2]/label[2]"));
    TextBox length = new TextBox(By.id("feedback_min_accepted_value"));
    Button importanceBtn = new Button(By.xpath("//div/div[3]/div/div/div[1]/chk-search-input/ngx-select-dropdown"));
    Label importanceValue = new Label(By.xpath("//chk-search-input/ngx-select-dropdown/div/div/ul[2]/li[1]"));

    Button submitButton = new Button(By.xpath("//chk-button[2]/button/span"));

    TextBox attachmentButton = new TextBox(By.cssSelector("chk-attatchment input[type='file']"));

    Button gpsField = new Button(By.cssSelector(".chk-map-leaflet.leaflet-container"));

    public ReportDetailsPage fillForm(int mainFactorIndex) throws InterruptedException {
        Thread.sleep(3000);
        mainFactorBtn.click();
        Label mainFactorValue = new Label(By.xpath("//chk-search-input/ngx-select-dropdown/div/div/ul[2]/li['" + mainFactorIndex + "']"));
        mainFactorValue.click();
        secondSection.click();
        length.typeText("10");
        gpsField.click();
        importanceBtn.click();
        importanceValue.click();
        attachmentButton.typeText("C:/Users/DELL/Pictures/images/Test.PNG");
        attachmentButton.typeText("C:/Users/DELL/Pictures/images/Test2.PNG");
        Thread.sleep(30000);
        submitButton.click();
        Thread.sleep(30000);
        return new ReportDetailsPage(driver);
    }
}
