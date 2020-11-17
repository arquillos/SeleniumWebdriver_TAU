package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    private final WebDriver driver;
    private final By inputField = By.id("target");
    private final By resultText = By.id("result");

    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText(Keys key) {
        driver.findElement(inputField).sendKeys(key);
    }

    public String getResultText() {
        return driver.findElement(resultText).getText();
    }
}
