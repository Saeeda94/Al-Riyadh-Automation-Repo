package Pages.UserPortal;
import CoreElements.Button;
import CoreElements.Label;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;

    /*** Login Page Locators ***/
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    TextBox userNameInput=new TextBox(By.xpath("//chk-input-text/input"));
    TextBox passwordInput=new TextBox(By.xpath("//chk-input-password/p-password/div/input"));
    Button loginBtn=new Button(By.xpath("//form/chk-button"));
    public HomePage fillLoginForm(String userName,String password) throws InterruptedException {
        Thread.sleep(4000);
        userNameInput.typeText(userName);
        passwordInput.typeText(password);
        loginBtn.click();
        return new HomePage(driver);
    }
    public void fillDataForInvalidLogin() {
        userNameInput.typeText("test70@gmail.com");
        passwordInput.typeText("wrong pass");
        loginBtn.click();
    }
}
