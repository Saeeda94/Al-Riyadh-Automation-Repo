package Pages.PagesElements;

import CoreElements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TasksElements {

    public WebDriver driver;
    public TasksElements(WebDriver driver){
        this.driver=driver;
    }
    public Label label1 = new Label(By.xpath("/html/body/chk-root/div/div[2]/div/chk-tasks-overview/div/div[2]/div/chk-custom-table/ngx-datatable/div/datatable-body/datatable-selection/datatable-scroller/datatable-row-wrapper[1]/datatable-body-row/div[2]/datatable-body-cell[1]/div/a/span[2]"));
}
