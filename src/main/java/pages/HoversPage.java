package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    private final WebDriver driver;
    private final By figureBoxes = By.className("figure");
    private final By figureCaption = By.className("figcaption");

    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     *
     * @param index starts at 1!!!
     */
    public FigureCaption hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figureBoxes).get(index - 1);

        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();

        return new FigureCaption(figure.findElement(figureCaption));
    }

    public static class FigureCaption {
        private final WebElement caption;
        private final By header = By.tagName("h5");
        private final By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isDisplayed() {
            return this.caption.isDisplayed();
        }

        public String getTitle() {
            return this.caption.findElement(header).getText();
        }

        public String getLinkText() {
            return this.caption.findElement(link).getText();
        }

        public String getLink() {
            return this.caption.findElement(link).getAttribute("href");
        }
    }
}