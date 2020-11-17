package hover;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverChecks extends BaseChecks {

    @Test
    public void testHoverUser1() {
        // Given
        var hoversPage = homePage.clickHoversLink();

        // When
        var caption = hoversPage.hoverOverFigure(1);

        // Then
        assertTrue(caption.isDisplayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption tittle incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link test incorrect");
        assertEquals(caption.getLink(), "https://the-internet.herokuapp.com/users/1", "Caption link incorrect");
    }
}