package GlobalSetup;

import CoreElements.Driver;
import Pages.Utilities;
import org.testng.annotations.*;

public class GlobalSetup {
    public static Driver driver = new Driver();
    public static Utilities utilities = new Utilities(driver);

    @BeforeTest
    public void setUp() {
        utilities.openSite();
        utilities = new Utilities(driver);
    }
    @AfterSuite
    public void closeSite() {
        driver.tearDown();
    }
}
