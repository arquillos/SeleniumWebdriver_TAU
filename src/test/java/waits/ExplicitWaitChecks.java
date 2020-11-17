package waits;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ExplicitWaitChecks extends BaseChecks {

    @Test
    public void dynamicLoadingCheck() {
        // Given
        var dynamicHiddenElementPage = homePage.clickDynamicLoadingLink().clickHiddenElementLink();

        // When
        dynamicHiddenElementPage.clickStart();

        // Then
        assertEquals(dynamicHiddenElementPage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }
}
