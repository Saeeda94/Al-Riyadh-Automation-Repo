package Pages.UserPortal;

import CoreElements.Element;
import CoreElements.Label;
import Pages.PagesElements.LoginElements;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    LoginElements loginElements = new LoginElements(Element.getWebDriver());
    Element element = new Element();
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage homePage=new HomePage(driver);

    @Step("Set User Name")
    public LoginPage setUserName(String userName){
        loginElements.userNameInput.setText(userName);
        return this;
    }

    @Step("Set Password")
    public LoginPage setPassword(String password){
        loginElements.passwordInput.setText(password);
        return this;
    }
    @Step("Click on login button")
    public boolean fillLoginForm(){
        loginElements.loginBtn.click();
        return homePage.getGreetingLabel();
    }
    @Step("Set in valid username")
    public LoginPage setInvalidUserName(String userName){
        loginElements.userNameInput.setText(userName);
        return this;
    }
    @Step("Set in valid password")
    public LoginPage setInvalidPassword(String password){
        loginElements.passwordInput.setText(password);
        return this;
    }
    @Step("Click on login button")
    public Label clickOnLoginBTNForInvalidCred(){
        loginElements.loginBtn.click();
        return loginElements.loginErrorMSG;
    }
    public void fillDataForInvalidLogin() {
        loginElements.loginBtn.click();
    }
}
