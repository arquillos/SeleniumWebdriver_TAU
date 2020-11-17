package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {
    private final WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicHiddenElementPage clickHiddenElementLink() {
        driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
        return new DynamicHiddenElementPage(driver);
    }

    public DynamicLoadedElementPage clickHiddenElement2Link() {
        driver.findElement(By.linkText("Example 2: Element rendered after the fact")).click();
        return new DynamicLoadedElementPage(driver);
    }

    public DynamicHiddenElementPage rightClickLinkTwo() {
        Actions action = new Actions(driver);
        action.keyDown((Keys.LEFT_CONTROL))
                .click(driver.findElement(By.linkText("Example 2: Element rendered after the fact")))
                .perform();

        return new DynamicHiddenElementPage(driver);
    }
}
