package UserPortalTests.RoadComponentWorkflow.Inspector;

import GlobalSetup.GlobalSetup;
import Pages.UserPortal.CheckList;
import Pages.UserPortal.HomePage;
import UserPortalTests.Generic.LoginTests;
import org.testng.annotations.Test;

public class SubmitForm extends GlobalSetup {

    HomePage homePage=new HomePage(driver.getWebDriver());
    CheckList checkList=new CheckList(driver.getWebDriver());

    @Test
    public void submitChecklist() throws InterruptedException {
        homePage.openForm().selectActivity();
        checkList.fillForm();
    }
}
