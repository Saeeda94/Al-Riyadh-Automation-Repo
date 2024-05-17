package Pages;

import CoreElements.Driver;
import CoreElements.Element;
import org.openqa.selenium.JavascriptExecutor;

import java.util.Iterator;
import java.util.Set;

public class Utilities {
    public Driver webDriver;

    public Utilities(Driver webDriver) {
        this.webDriver = webDriver;
        Element.setWebDriver(webDriver.getWebDriver());
    }

    /****************  open the user/admin portal *******************/
    public void openSite() {
        webDriver.goTo("http://yxdemo.eastus.cloudapp.azure.com/CHECK/Demo/AlRiyadh/Site/login");
        webDriver.maximizeWindow();
    }

    /**************** Switch to new tab *******************/
    public void switchToNewTab() {
        String mainWindowHandle = webDriver.getWebDriver().getWindowHandle();
        Set<String> allWindowHandles = webDriver.getWebDriver().getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                webDriver.getWebDriver().switchTo().window(ChildWindow);
            }
        }
    }

    /**************** Switch to first tab *******************/
    public void switchToFirstTab() {
        String currentWindowHandle = webDriver.getWebDriver().getWindowHandle();
        Set<String> windowHandles = webDriver.getWebDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (windowHandle.equals(currentWindowHandle)) {
                continue; // Skip the current window
            }
            webDriver.getWebDriver().switchTo().window(windowHandle);
            break;
        }
    }

}
