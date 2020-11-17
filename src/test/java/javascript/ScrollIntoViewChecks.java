package javascript;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ScrollIntoViewChecks extends BaseChecks {

    @Test
    public void scrollIntoViewCheck() {
        // Given
        var largeAndDeepDOMPage = homePage.clickLargeAndDeepDOMLink();

        // When
        largeAndDeepDOMPage.scrollToTable();

        // Then
        assertTrue(largeAndDeepDOMPage.isTableHeaderVisible(), "Table header is not visible");
    }

    @Test
    public void scrollToNBlock() {
        // Given
        var infiniteScrollPage = homePage.clickInfiniteScrollLink();

        // When
        infiniteScrollPage.scrollToParagraph(5);

        // Then
        assertEquals(infiniteScrollPage.getNumberOfParagraphs(), 5, "Error number of paragraphs");
    }
}
