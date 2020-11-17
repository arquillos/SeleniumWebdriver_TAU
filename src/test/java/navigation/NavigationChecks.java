package navigation;

import base.BaseChecks;
import org.testng.annotations.Test;
import pages.DynamicHiddenElementPage;
import pages.DynamicLoadedElementPage;
import pages.MultipleWindowsPage;
import utils.WindowManager;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NavigationChecks extends BaseChecks {

    @Test
    public void navigatorCheck() {
        // Given
        homePage.clickDynamicLoadingLink().clickHiddenElementLink();

        // When
        var windowManager = getWindowManager();
        windowManager.goBack();
        windowManager.refresh();
        windowManager.goForward();
        windowManager.goTo("https://duckduckgo.com");

        // Then
        assertEquals(windowManager.getTitle(), "DuckDuckGo — La privacidad, simplificada.", "Incorrect page title");
    }

    @Test
    public void switchTabCheck() {
        // Given
        var multipleWindowsPage = homePage.clickMultipleWindowsLink();

        // When
        multipleWindowsPage.openWindow();
        getWindowManager().switchToTab("New Window");

        // Then
        assertEquals(getWindowManager().getTitle(), "New Window", "Incorrect window title");
    }

    @Test
    public void openNewTabCheck() {
        // Given
        var dynamicLoadedElementPage = homePage.clickDynamicLoadingLink();

        // When
        var dynamicHiddenElementPage = dynamicLoadedElementPage.rightClickLinkTwo();
        getWindowManager().switchToNewTab();

        // Then
        assertTrue(dynamicHiddenElementPage.isStartDisplayed());
    }
}