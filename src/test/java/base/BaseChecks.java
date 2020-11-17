package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseChecks {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        // Executable Portable Chrome Driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("d:\\Internet\\brave-portable\\brave-portable.exe");
        driver = new ChromeDriver(options);

        // Full window
        driver.manage().window().maximize();

        goHome();

        homePage = new HomePage(this.driver);
    }

    @BeforeMethod
    public void goHome() {
        driver.get("http://the-internet.herokuapp.com");
    }

    @AfterClass
    public void tearDown() {
        // Close window and session
        driver.quit();
    }

    @AfterMethod
    public void screenshotOnFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot)driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            File destFile = new File("src/main/resources/screenshots/" + result.getName() + ".png");
            try {
                FileHandler.copy(screenshot, destFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Navigator checks
    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }
}