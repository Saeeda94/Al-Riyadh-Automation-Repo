package Pages.UserPortal;

import CoreElements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class AddNewReportPage {
    private WebDriver driver;

    /*** AddNewReport Page Locators ***/
    public AddNewReportPage(WebDriver driver) {
        this.driver = driver;
    }

    public LocationPage selectActivity() throws InterruptedException {
        Thread.sleep(10000);
        Button activityDropdown = new Button(By.xpath("/html/body/chk-root/div/div[2]/div/chk-add-report/chk-report-submission/div/form/chk-card/div/div[2]/div/div/div/div/chk-search-input[1]/ngx-select-dropdown/div/button"));
        Button activityName=new Button(By.xpath("/html/body/chk-root/div/div[2]/div/chk-add-report/chk-report-submission/div/form/chk-card/div/div[2]/div/div/div/div/chk-search-input[1]/ngx-select-dropdown/div/div/ul[2]/li[1]")); // To expand the dropdown
        WebElement activityDropdown2 = driver.findElement(By.xpath("//ngx-select-dropdown/div[@tabindex='0']"));
        activityDropdown2.click(); // To expand the dropdown
        WebElement selectReportType = driver.findElement(By.xpath("//ngx-select-dropdown/div/div/ul[2]/li[1]"));
        selectReportType.click();
        WebElement nextButton = driver.findElement(By.cssSelector("button.chk-primary-btn[title='التالي']"));
        nextButton.click();
        return new LocationPage(driver);
    }
//    public LocationPage selectEvent() {
//
//    }
}
