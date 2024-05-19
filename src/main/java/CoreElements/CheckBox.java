package CoreElements;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

/**
 * This class represents a CheckBox element in a web page.
 * It extends the Element class and inherits all its methods.
 * It provides a method to click the CheckBox and take a screenshot after clicking.
 */
public class CheckBox extends Element {
    /**
     * Constructor for the CheckBox class.
     * It sets the locator for the CheckBox element.
     * @param checkBox The locator for the CheckBox element.
     */
    public CheckBox(By checkBox) {
        this.setLocator(checkBox);
    }

    /**
     * Clicks on the CheckBox element located by the locator.
     * Waits for the element to be visible before clicking.
     * Also takes a screenshot after clicking and saves it in the specified location.
     */
    public void click() {
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