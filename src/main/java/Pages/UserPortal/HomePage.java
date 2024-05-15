package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Label;
import CoreElements.Link;
import Pages.PagesElements.HomePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    /*** Home Page Locators ***/
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    HomePageElements homePageElements=new HomePageElements(Element.getWebDriver());
    public boolean getGreetingLabel() throws InterruptedException {
        Thread.sleep(2000);
        return homePageElements.greetingMSG.isDisplayed(By.xpath("//span[contains(@class,'greeting')]"));
    }
    public AddNewReportPage openForm() throws InterruptedException {
        Thread.sleep(10000);
        homePageElements.addButton.click();
        return new AddNewReportPage(driver);
    }
    public TasksPage navigateToTaskPage() throws InterruptedException {
        Thread.sleep(3000);
        homePageElements.taskIcon.click();
        return new TasksPage(driver);
    }
}
