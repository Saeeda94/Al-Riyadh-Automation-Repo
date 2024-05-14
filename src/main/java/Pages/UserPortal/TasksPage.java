package Pages.UserPortal;

import CoreElements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksPage {
    WebDriver driver;

    public TasksPage(WebDriver driver) {
        this.driver = driver;
    }

    Label label1 = new Label(By.xpath("/html/body/chk-root/div/div[2]/div/chk-tasks-overview/div/div[2]/div/chk-custom-table/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[1]/div/a/span[2]"));

    public boolean checkLabel(String reportNumber) throws InterruptedException {
        Thread.sleep(3000);
        return label1.getText().contains(reportNumber);}
}