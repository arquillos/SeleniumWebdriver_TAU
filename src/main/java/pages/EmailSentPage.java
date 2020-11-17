package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSentPage {
    private final WebDriver driver;
    private final By emailSentText = By.id("content");

    public EmailSentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getContentText() {
        return driver.findElement(emailSentText).getText();
    }
}
