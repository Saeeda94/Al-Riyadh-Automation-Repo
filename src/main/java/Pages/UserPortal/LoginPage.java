package Pages.UserPortal;
import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Label;
import CoreElements.TextBox;
import Pages.PagesElements.LoginElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    LoginElements loginElements=new LoginElements(Element.getWebDriver());
    public HomePage fillLoginForm(String userName,String password) throws InterruptedException {
        Thread.sleep(4000);
        loginElements.userNameInput.typeText(userName);
        loginElements.passwordInput.typeText(password);
        loginElements.loginBtn.click();
        return new HomePage(driver);
    }
    public void fillDataForInvalidLogin() {
        loginElements.userNameInput.typeText("test70@gmail.com");
        loginElements.passwordInput.typeText("wrong pass");
        loginElements.loginBtn.click();
    }
}
