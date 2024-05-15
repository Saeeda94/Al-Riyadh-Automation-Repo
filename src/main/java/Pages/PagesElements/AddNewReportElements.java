package Pages.PagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewReportElements {
    public WebDriver driver;

    public AddNewReportElements(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement activityDropdown2 = driver.findElement(By.xpath("//ngx-select-dropdown/div[@tabindex='0']"));
    public WebElement selectReportType = driver.findElement(By.xpath("//ngx-select-dropdown/div/div/ul[2]/li[1]"));

    public WebElement nextButton = driver.findElement(By.cssSelector("button.chk-primary-btn[title='التالي']"));
}
