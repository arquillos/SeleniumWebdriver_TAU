package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InfiniteScrollPage {
    private final WebDriver driver;
    private final By textBlock = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Scroll until paragraph with index specified is in view
     * @param index 1-based
     */
    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";

        while(getNumberOfParagraphs() < index) {
            ((JavascriptExecutor)driver).executeScript(script);
        }

    }

    public int getNumberOfParagraphs() {
        return driver.findElements(textBlock).size();
    }
}
