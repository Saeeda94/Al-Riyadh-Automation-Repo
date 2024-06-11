package Pages.UserPortal.GenericPages;

import CoreElements.Element;
import Pages.PagesElements.GenericElements.TasksElements;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static CoreElements.Element.webDriver;

public class TasksPage {
    WebDriver driver;

    public TasksPage(WebDriver driver) {
        this.driver = driver;
    }
    ReportDetailsPage reportDetailsPage = new ReportDetailsPage(Element.getWebDriver());
   TasksElements tasksElements=new TasksElements(Element.getWebDriver());


   @Step("show all tasks")
    public TasksPage showAllTasks() {
        tasksElements.showAllBTN.click();
        return this;
    }
    @Step("Select Task")
    public ReportDetailsPage navigateToReportDetails(){
        tasksElements.task.click();
        ArrayList<String> tabs = new ArrayList<String>(webDriver.getWindowHandles());
        if(tabs.size()>2){
            webDriver.switchTo().window(tabs.get(2));
        }
        else{
            webDriver.switchTo().window(tabs.get(1));
        }
        return reportDetailsPage;
    }
}