package CoreElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Arrays;

public class Driver {
    static WebDriver webDriver;

    public Driver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments
                (Arrays.asList
                        ("--disable-notifications--"
                                , "--remote-allow-origins=*"
                                , "--incognito"));

        webDriver = new ChromeDriver(options);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void maximizeWindow() {
        webDriver.manage().window().maximize();
    }

    public void goTo(String url) {
        webDriver.get(url);
    }

    public void tearDown() {
        webDriver.quit();
    }
}
