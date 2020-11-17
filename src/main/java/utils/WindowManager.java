package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private final WebDriver driver;
    private final WebDriver.Navigation navigation;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigation = driver.navigate();
    }

    public void goBack() {
            navigation.back();
    }

    public void goForward() {
        navigation.forward();
    }

    public void refresh() {
        navigation.refresh();
    }

    public void goTo(String url) {
        navigation.to(url);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void switchToTab(String tabName) {
        var windowHandles = driver.getWindowHandles();
        System.out.println("Number of opened tabs: " + windowHandles.size());

        System.out.println("Window handles: ");
        windowHandles.forEach(System.out::println);

        for(String window: windowHandles) {
            System.out.println("Switching to " + window);
            driver.switchTo().window(window);

            System.out.println("Current window title: " + driver.getTitle());

            if(tabName.equals(driver.getTitle())) {
                break;
            }
        }
    }

    public void switchToNewTab() {
        var windowHandles = driver.getWindowHandles();

        windowHandles.forEach(driver.switchTo()::window);
    }
}
