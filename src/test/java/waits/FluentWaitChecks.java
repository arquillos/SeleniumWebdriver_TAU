package waits;

import base.BaseChecks;
import org.testng.annotations.Test;
import pages.DynamicLoadedElementPage;

import static org.testng.Assert.assertEquals;

public class FluentWaitChecks extends BaseChecks {

    @Test
    public void dynamicLoadingCheck() {
        // Given
        var dynamicLoadedElementPage = homePage.clickDynamicLoadingLink().clickHiddenElement2Link();

        // When
        dynamicLoadedElementPage.clickStart();

        // Then
        assertEquals(dynamicLoadedElementPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
