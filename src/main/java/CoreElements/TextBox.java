package CoreElements;

import lombok.SneakyThrows;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TextBox extends Element {
    // constructor
    public TextBox(By typedElement) {
        this.setLocator(typedElement);
    }
    // Type method
    @SneakyThrows
    public void setText(String data) {
        waitElement(locator);
        find(locator).isEnabled();
        find(locator).clear();
        find(locator).sendKeys(data);
    }

    public void clearText(){
        waitElement(locator);
        find(locator).isEnabled();
        find(locator).clear();
        find(locator).clear();
    }

}
