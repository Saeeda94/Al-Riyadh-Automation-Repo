package Pages.UserPortal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReportDetailsPage {
    private WebDriver driver;

    // Locator for the card body element
    public By reportNumber = By.xpath("//chk-card/div/div[2]/div/div/div/div[1]/p");

    // Constructor
    public ReportDetailsPage(WebDriver driver){
        this.driver = driver;
    }
    // Method to interact with report details, for example, to get its text.
    public String getCardBodyText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//chk-card/div/div[2]/div/div/div/div[1]/p"))));
        return driver.findElement(reportNumber).getText();
    }
}
