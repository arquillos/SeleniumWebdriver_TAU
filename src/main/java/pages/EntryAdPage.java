package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class EntryAdPage {
    private final WebDriver driver;
    private final By closeLink = By.cssSelector(".modal-footer p");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public void closeModal() {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(closeLink)));

        driver.findElement(closeLink).click();
    }

    public Boolean isModalDisplayed() {
        System.out.println("Elements: " + driver.findElements(closeLink).size());
        return driver.findElement(closeLink).isDisplayed();
    }
}