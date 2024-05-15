package Pages.UserPortal;

import CoreElements.Element;
import Pages.PagesElements.DataTableElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataTablePage {
    private WebDriver driver;
    public DataTablePage(WebDriver driver) {
        this.driver = driver;
    }
    DataTableElements dataTableElements=new DataTableElements(Element.getWebDriver());
    // Method to verify if the data table is displayed.
    public boolean isDataTableDisplayed() {
        return driver.findElement(dataTableElements.dataTable).isDisplayed();
    }
}