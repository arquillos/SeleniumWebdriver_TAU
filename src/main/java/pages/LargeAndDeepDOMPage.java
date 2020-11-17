package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {
    private final WebDriver driver;
    private final By table = By.id("large-table");
    private final By header = By.id("header-1");

    public LargeAndDeepDOMPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToTable() {
        WebElement tableElement = driver.findElement(table);

        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script, tableElement);
    }

    public boolean isTableHeaderVisible() {
        return driver.findElement(header).isDisplayed();
    }
}
