package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private final WebDriver driver;
    private final By slider = By.cssSelector(".sliderContainer input");
    private final By sliderValue = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void moveSlider(int amount) {
        for (int i = 0; i < amount; i++) {
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getValue() {
        return driver.findElement(sliderValue).getText();
    }
}
