package Pages.PagesElements.GenericElements;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.Link;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportDetailsElements {
    public WebDriver driver;

    public ReportDetailsElements(WebDriver driver) {
        this.driver = driver;
    }

    public Label reportNumber = new Label(By.xpath("//*[@id=\"chk.report.details.reportId\"]/p"));
    public Button showActions = new Button(By.id("chk.report.details.actions.button"));
    public Label txtReportState = new Label(By.xpath("//div[@id='chk.report.details.reportState']//p"));
    public Label txtAssignedTo = new Label(By.xpath("//div[@id='chk.report.details.assignedTo']//p"));

}
