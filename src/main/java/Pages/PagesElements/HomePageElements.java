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

    public Label greetingMSG = new Label(By.xpath("//span[contains(@class,'greeting')]"));
   // public Button addButton = new Button(By.xpath("/html/body/chk-root/div/div[2]/chk-header/nav/div[2]/div[2]/chk-button/button/span"));
    public Button plusIcon = new Button(By.id("add.report.button"));

    public Link taskIcon = new Link(By.xpath("//*[@id=\"sidebar\"]/ul/li[7]/div[1]/a[2]"));


    public Button arrowDownBTN = new Button(By.cssSelector("button.p-button-icon-only"));
    public Link logoutLink=new Link(By.xpath("//a/span[contains(text(),'تسجيل خروج')]"));
    public Link logoutButton=new Link(By.xpath("//modal-container/div[2]/div/div[3]/div/chk-button[2]/button/span"));
}
