package Pages.PagesElements.GenericElements;

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
    public Button plusIcon = new Button(By.id("add.report.button"));

    public Link taskIcon = new Link(By.id("menu.item.tasks"));

    public Button arrowDownBTN = new Button(By.cssSelector("button.p-button-icon-only"));
    public Link logoutLink=new Link(By.xpath("//a/span[contains(text(),'تسجيل خروج')]"));
    public Link logoutButton=new Link(By.xpath("//modal-container/div[2]/div/div[3]/div/chk-button[2]/button/span"));
}

