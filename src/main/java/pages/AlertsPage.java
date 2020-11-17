package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private final WebDriver driver;
    private final By triggerAlertButton = By.xpath(".//button[text()='Click for JS Alert']");
    private final By triggerConfirmButton = By.xpath(".//button[text()='Click for JS Confirm']");
    private final By triggerPromptButton = By.xpath(".//button[text()='Click for JS Prompt']");
    private final By resultText = By.id("result");
    private final By confirmText = By.id("");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        driver.findElement(triggerAlertButton).click();
    }

    public void alert_clickToAccept() {
        driver.switchTo().alert().accept();
    }

    public void triggerConfirm() {
        driver.findElement(triggerConfirmButton).click();
    }

    public String confirm_getText() {
        return driver.switchTo().alert().getText();
    }

    public void confirm_clickToDismiss() {
        driver.switchTo().alert().dismiss();
    }

    public void triggerPrompt() {
        driver.findElement(triggerPromptButton).click();
    }

    public void prompt_setText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }

    public void prompt_clickToAccept()  {
        driver.switchTo().alert().accept();
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }

    public void back() {
        driver.navigate().back();
    }
}