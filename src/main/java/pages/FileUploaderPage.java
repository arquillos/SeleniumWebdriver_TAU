package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploaderPage {
    private final WebDriver driver;
    private final By fileToUpload = By.id("file-upload");
    private final By fileUploadButton = By.id("file-submit");
    private final By uploadedFiles = By.id("uploaded-files");
    private final By uploadResultText = By.cssSelector(".example h3");

    public FileUploaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUploadButton() {
        driver.findElement(fileUploadButton).click();
    }

    public void setUploadFile(String absolutePathOfFile) {
        driver.findElement(fileToUpload).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles() {
        return driver.findElement(uploadedFiles).getText();
    }

    public String getUploadResult() {
        return driver.findElement(uploadResultText).getText();
    }
}
