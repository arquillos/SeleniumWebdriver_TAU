package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private final WebDriver driver;

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTopLeftText() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();
        driver.switchTo().parentFrame();

        return text;
    }

    public String getBottomText() {
        driver.switchTo().frame("frame-bottom");
        String text = driver.findElement(By.tagName("body")).getText();
        driver.switchTo().parentFrame();

        return text;
    }

}
