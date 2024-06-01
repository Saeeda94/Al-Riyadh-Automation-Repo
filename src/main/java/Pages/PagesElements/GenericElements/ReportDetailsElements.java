package Pages.PagesElements.GenericElements;

import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportDetailsElements {
    public WebDriver driver;
    public ReportDetailsElements(WebDriver driver){
        this.driver=driver;
    }
    public Label reportNumber =new Label(By.xpath("//*[@id=\"chk.report.details.reportId\"]/p"));
}
