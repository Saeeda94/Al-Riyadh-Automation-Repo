package CoreElements;

import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;

/**
 * This class represents a Button element in a web page.
 * It extends the Element class and inherits all its methods.
 * It provides a method to click the button and take a screenshot after clicking.
 */
public class Button extends Element{
    /**
     * Constructor for the Button class.
     * It sets the locator for the button element.
     * @param button The locator for the button element.
     */
    public Button(By button){
        this.setLocator(button);
    }

    /**
     * Clicks on the button element located by the locator.
     * Waits for the element to be visible before clicking.
     * Also takes a screenshot after clicking and saves it in the specified location.
     */
    @SneakyThrows
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