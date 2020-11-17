package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditorPage {
    private final WebDriver driver;
    private final By testArea = By.id("tinymce");
    private final By increaseIndentButton = By.cssSelector("#mceu_12 button");

    public EditorPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(testArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(testArea).sendKeys(text);
        switchToMainArea();
    }

    public String getTextArea() {
        switchToEditArea();
        String text = driver.findElement(testArea).getText();
        switchToMainArea();

        return text;
    }

    public void increaseIndent() {
        driver.findElement(increaseIndentButton).click();
    }

    private void switchToEditArea() { driver.switchTo().frame("mce_0_ifr"); }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
