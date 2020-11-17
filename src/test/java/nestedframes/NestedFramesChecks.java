package nestedframes;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesChecks extends BaseChecks {

    @Test
    public void checkTwoFrames() {
        // Given
        var nestedFramesPage =homePage.clickFramesLink().clickNestedFramesLink();

        // When

        // Then
        assertEquals(nestedFramesPage.getTopLeftText(), "LEFT", "Incorrect top left frame text");
        assertEquals(nestedFramesPage.getBottomText(), "BOTTOM", "Incorrect bottom frame text");
    }
}
