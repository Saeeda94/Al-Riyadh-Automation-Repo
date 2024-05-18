package Pages.UserPortal;

import CoreElements.Button;
import CoreElements.Element;
import CoreElements.Label;
import CoreElements.Link;
import Pages.PagesElements.HomePageElements;
import Pages.PagesElements.LoginElements;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    LoginElements loginElements=new LoginElements(Element.getWebDriver());

    HomePageElements homePageElements=new HomePageElements(Element.getWebDriver());

    public boolean getGreetingLabel()  {
        return homePageElements.greetingMSG.isDisplayed();
    }
    public AddNewReportPage openForm() throws InterruptedException {
//        homePageElements.addButton.click();
        return new AddNewReportPage(driver);
    }
    public TasksPage navigateToTaskPage() throws InterruptedException {
        homePageElements.taskIcon.click();
        return new TasksPage(driver);
    }

    /*********************************************************************/

    @Feature("Logout")
    @Step("click on arrow button")
    public HomePage clickOnArrowBTN(){
        homePageElements.arrowDownBTN.click();
        return this;
    }
    @Step("click on Logout Link")
    public HomePage clickOnLogoutLink(){
        homePageElements.logoutLink.click();
        return this;
    }
    @Step("click on Logout Button")
    public boolean clickOnLogoutBTN(){
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
      homePageElements.logoutButton.click();
       return loginElements.loginBtn.isDisplayed();
    }
}
