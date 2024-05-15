package Pages.PagesElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReportDetailsElements {
    public WebDriver driver;
    public ReportDetailsElements(WebDriver driver){
        this.driver=driver;
    }
    public By reportNumber = By.xpath("//chk-card/div/div[2]/div/div/div/div[1]/p");
}
