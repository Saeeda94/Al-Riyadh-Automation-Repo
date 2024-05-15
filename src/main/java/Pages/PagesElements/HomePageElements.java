package Pages.PagesElements;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageElements {
    public WebDriver driver;
    public HomePageElements(WebDriver driver) {
        this.driver = driver;
    }
    public Label greetingMSG=new Label(By.xpath("//span[contains(@class,'greeting')]"));
    public Button addButton=new Button(By.xpath("/html/body/chk-root/div/div[2]/chk-header/nav/div[2]/div[2]/chk-button/button/span"));
    public Link taskIcon=new Link(By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/div[1]/a[2]"));
}
