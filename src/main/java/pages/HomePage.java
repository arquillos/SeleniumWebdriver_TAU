package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication() {
        clickLink(By.linkText("Form Authentication"));
        return new LoginPage(this.driver);
    }

    public DropDownPage clickDropDownLink() {
        clickLink(By.linkText("Dropdown"));
        return new DropDownPage(this.driver);
    }

    public ForgotPasswordPage clickForgotPasswordLink() {
        clickLink(By.linkText("Forgot Password"));
        return new ForgotPasswordPage(this.driver);
    }

    public HoversPage clickHoversLink() {
        clickLink(By.linkText("Hovers"));
        return new HoversPage(this.driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink(By.linkText("Key Presses"));
        return new KeyPressesPage(this.driver);
    }

    public HorizontalSliderPage clickHorizontalSliderLink() {
        clickLink(By.linkText("Horizontal Slider"));
        return new HorizontalSliderPage(this.driver);
    }

    public AlertsPage clickJavaScriptAlertLink() {
        clickLink(By.linkText("JavaScript Alerts"));
        return new AlertsPage(this.driver);
    }

    public FileUploaderPage clickFileUploadLink() {
        clickLink(By.linkText("File Upload"));
        return new FileUploaderPage(this.driver);
    }

    public EntryAdPage clickEntryAdLink() {
        clickLink(By.linkText("Entry Ad"));
        return new EntryAdPage(this.driver);
    }

    public ContextMenuPage clickContextMenuLink() {
        clickLink(By.linkText("Context Menu"));
        return new ContextMenuPage(this.driver);
    }

    public EditorPage clickWYSIWYGEditorLink() {
        clickLink(By.linkText("WYSIWYG Editor"));
        return new EditorPage(this.driver);
    }

    public FramesPage clickFramesLink() {
        clickLink(By.linkText("Frames"));
        return new FramesPage(this.driver);
    }

    public DynamicLoadingPage clickDynamicLoadingLink() {
        clickLink(By.linkText("Dynamic Loading"));
        return new DynamicLoadingPage(this.driver);
    }

    public LargeAndDeepDOMPage clickLargeAndDeepDOMLink() {
        clickLink(By.linkText("Large & Deep DOM"));
        return new LargeAndDeepDOMPage(this.driver);
    }

    public InfiniteScrollPage clickInfiniteScrollLink() {
        clickLink(By.linkText("Infinite Scroll"));
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLink(By.linkText("Multiple Windows"));
        return new MultipleWindowsPage(driver);
    }

    private void clickLink(By linkIdentifier) {
        driver.findElement(linkIdentifier).click();
    }
}
