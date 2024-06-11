package Pages.PagesElements.GenericElements;

import CoreElements.*;
import Pages.UserPortal.MaradimCustomPages.MaradimCheckList;
import io.qameta.allure.Step;
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

    public Label getSpecificAction(String actionName) {
        return new Label(By.xpath("//ul[@id='dropdown-basic']//li//a[text()='" + actionName + "']"));
    }
    public Label checkTheRequiredActions(String optionName){
        return new Label(By.xpath("//*[@id=\"chk.report.details.actions.modal.note.textArea\"]//parent::div[1]//label[text()='"+optionName+"']"));
    }
    public TextBox notes= new TextBox(By.xpath("//*[@id=\"chk.report.details.actions.modal.note.textArea\"]//textarea"));
    public Button attachments= new Button(By.id("file"));
    public Button btnYes = new Button(By.xpath("//chk-button[@id='chk.report.details.actions.modal.submit.button']//button"));
    public Button btnNo = new Button(By.xpath("//chk-button[@id='chk.report.details.actions.modal.cancel.button']//button"));
    public Label txtSuccessMSG =new Label(By.xpath("//div[contains(@class, 'toast-title')]"));

}

