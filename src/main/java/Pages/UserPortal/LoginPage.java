package Pages.UserPortal;

import CoreElements.Element;
import Pages.PagesElements.LoginElements;
import com.microsoft.schemas.office.office.STInsetMode;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    LoginElements loginElements = new LoginElements(Element.getWebDriver());
    Element element = new Element();
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    @Step("Fill Login Form")
    public HomePage fillLoginForm(String userName,String password) {
        loginElements.userNameInput.setText(userName);
        loginElements.passwordInput.setText(password);
        loginElements.loginBtn.click();
        return new HomePage(driver);
    }
    public void fillDataForInvalidLogin() {
        loginElements.userNameInput.setText("invalid username");
        loginElements.passwordInput.setText("invalid password");
        loginElements.loginBtn.click();
    }
}
