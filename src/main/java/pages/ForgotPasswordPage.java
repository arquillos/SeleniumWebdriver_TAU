package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private final WebDriver driver;
    private final By emailTextBox = By.id("email");
    private final By retrievePasswordButton = By.id("form_submit");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailAddress(String email) {
        driver.findElement(emailTextBox).sendKeys(email);
    }

    public EmailSentPage clickRetrievePasswordButton() {
        this.driver.findElement(retrievePasswordButton).click();
        return new EmailSentPage(this.driver);
    }
}
