package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicHiddenElementPage {
    private final WebDriver driver;
    private final By startButton = By.cssSelector("#start button");
    private final By loadingElement = By.id("loading");
    private final By finishLoadingText =  By.id("finish");

    public DynamicHiddenElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStart() {
        driver.findElement(startButton).click();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingElement)));
    }

    public String getLoadedText() {
        return driver.findElement(finishLoadingText).getText();
    }

    public boolean isStartDisplayed() {
        return driver.findElement(startButton).isDisplayed();
    }
}
