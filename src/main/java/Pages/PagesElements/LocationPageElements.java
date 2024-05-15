package Pages.PagesElements;

import CoreElements.Button;
import CoreElements.Link;
import CoreElements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationPageElements {
    public WebDriver driver;
    public LocationPageElements(WebDriver driver){
        this.driver=driver;
    }
    public Link locationTree1=new Link(By.xpath("//chk-tree-view/div/div[3]/div[2]/div/span"));
    public Link locationTree2=new Link(By.cssSelector(".tree-node .sub-tree"));
    public RadioButton radioButton=new RadioButton(By.cssSelector("div.node-radio-button.mx-1.position-relative"));
    public Button nextBtn=new Button(By.cssSelector("button.chk-btn.chk-primary-btn[title='التالي']"));
}
