package Pages.PagesElements;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginElements {
    public WebDriver driver;
    public LoginElements(WebDriver driver) {
        this.driver = driver;
    }
    public TextBox userNameInput=new TextBox(By.xpath("//chk-input-text/input"));
    public TextBox passwordInput=new TextBox(By.xpath("//chk-input-password/p-password/div/input"));
    public Button loginBtn=new Button(By.xpath("//*[@id=\"login.button\"]/button"));
    public Label loginErrorMSG=new Label(By.cssSelector("p.error-text"));
}
