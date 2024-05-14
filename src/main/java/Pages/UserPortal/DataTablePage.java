package Pages.UserPortal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablePage {
    private WebDriver driver;

    // Locator for the ngx-datatable element
    private By dataTable = By.cssSelector("ngx-datatable");

    // Constructor
    public DataTablePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to verify if the data table is displayed.
    public boolean isDataTableDisplayed() {
        return driver.findElement(dataTable).isDisplayed();
    }
}