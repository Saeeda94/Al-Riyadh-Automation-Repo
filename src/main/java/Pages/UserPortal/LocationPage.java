package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Link;
import CoreElements.RadioButton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocationPage {

    private WebDriver driver;

    /*** Location Page Locators ***/
    public LocationPage(WebDriver driver) {
        this.driver = driver;
    }
    Link locationTree1=new Link(By.xpath("//chk-tree-view/div/div[3]/div[2]/div/span"));
    Link locationTree2=new Link(By.cssSelector(".tree-node .sub-tree"));
    RadioButton radioButton=new RadioButton(By.cssSelector("div.node-radio-button.mx-1.position-relative"));
    Button nextBtn=new Button(By.cssSelector("button.chk-btn.chk-primary-btn[title='التالي']"));
    int locationTreeCount=2;
    public CheckList navigateToCheckList() throws InterruptedException {
        Thread.sleep(50000);
        locationTree1.click();
        for(int i=0;i<locationTreeCount;i++){
        locationTree2.click();}
        radioButton.radioBtnClick();
        nextBtn.click();
        return new CheckList(driver);
    }
}
