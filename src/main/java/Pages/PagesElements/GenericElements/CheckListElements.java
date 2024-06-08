package Pages.PagesElements.GenericElements;

import CoreElements.Button;
import CoreElements.Label;
import CoreElements.RadioButton;
import CoreElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckListElements {
    public WebDriver driver;

    public CheckListElements(WebDriver driver) {
        this.driver = driver;
    }

    public RadioButton getSpecificQuestionOptionWithSpace(String question, String option) {
        return new RadioButton(By.xpath("//div[text()='" + " " + question + "  " + "']/parent::label/following-sibling::div//label[text()='" + option + "']")); // /preceding-sibling::input
    }

    public RadioButton getSpecificQuestionOption(String question, String option) {
        return new RadioButton(By.xpath("//div[text()='" + " " + question + " " + "']/parent::label/following-sibling::div//label[text()='" + option + "']"));
    }

    public TextBox getInputForQuestion(String question) {
        return new TextBox(By.xpath("//div[text()='" + " " + question + " " + "']/ancestor::label/following-sibling::div//input"));
    }

    public Button getSelectButtonForDropdown(String question) {
        return new Button(By.xpath("//div[text()='" + " " + question + " " + "']/ancestor::label/following-sibling::div//button[@class='ngx-dropdown-button']"));
    }

    public Button getOptionFromDropdown(String index) {
        return new Button(By.xpath("(//ul[@class='available-items']//li)[" + index + "]"));
    }

    public Button btnAttachment = new Button(By.xpath("//div[contains(@class, 'input-file-button')]//input[@type='file']"));
    public Button btnSubmit = new Button(By.xpath("//chk-button[@title='root.global.submit']"));
    public Button btnCancel = new Button(By.xpath("//chk-button[@title='root.global.cancel']"));
    public Label txtSuccessMsg = new Label(By.xpath("//*[@id='toast-container']"));

}
