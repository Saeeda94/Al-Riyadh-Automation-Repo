package CoreElements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

/**
 * This class represents a Link element in a web page.
 * It extends the Element class and inherits all its methods.
 * It provides a method to click the Link.
 */
public class Link extends Element{
    static WebDriver driver;

    /**
     * Constructor for the Link class.
     * It sets the locator for the Link element.
     * @param link The locator for the Link element.
     */
    public Link(By link){
        this.setLocator(link);
    }

    /**
     * Clicks on the Link element located by the locator.
     * Waits for the element to be visible before clicking.
     * Also takes a screenshot after clicking and saves it in the specified location.
     */
    public void click(){
        waitElement(locator);
        find(locator).click();
        try {
            TakesScreenshot screenshot = (TakesScreenshot) webDriver;
            File src = screenshot.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File(
                    ".\\TestData\\ScreenShots\\" + getClass().getSimpleName() + "\\" + new Throwable().getStackTrace()[0].getMethodName() + "_" + getCurrentDate() + ".png"));
        } catch (Exception ignored) {
        }
    }
}