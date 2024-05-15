package Pages.UserPortal;

import CoreElements.Element;
import Pages.PagesElements.TasksElements;
import org.openqa.selenium.WebDriver;
public class TasksPage {
    WebDriver driver;

    public TasksPage(WebDriver driver) {
        this.driver = driver;
    }

   TasksElements tasksElements=new TasksElements(Element.getWebDriver());
    public boolean checkLabel(String reportNumber) throws InterruptedException {
        Thread.sleep(3000);
        return tasksElements.label1.getText().contains(reportNumber);}
}