package Pages.PagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class represents the elements on the 'Add New Report' page.
 * It provides WebElements for the activity dropdown, report type selector, and the next button.
 */
public class AddNewReportElements {
    public WebDriver driver;

    /**
     * Constructor for the AddNewReportElements class.
     * It sets the WebDriver instance.
     * @param driver The WebDriver instance.
     */
    public AddNewReportElements(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * WebElement representing the activity dropdown on the 'Add New Report' page.
     */
    public WebElement activityDropdown2 = driver.findElement(By.xpath("//ngx-select-dropdown/div[@tabindex='0']"));

    /**
     * WebElement representing the report type selector on the 'Add New Report' page.
     */
    public WebElement selectReportType = driver.findElement(By.xpath("//ngx-select-dropdown/div/div/ul[2]/li[1]"));

    /**
     * WebElement representing the next button on the 'Add New Report' page.
     */
    public WebElement nextButton = driver.findElement(By.cssSelector("button.chk-primary-btn[title='التالي']"));
}