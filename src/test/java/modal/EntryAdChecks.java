package modal;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class EntryAdChecks extends BaseChecks {

    @Test
    public void closeModal() {
        // Given
        var entryAdPage = homePage.clickEntryAdLink();

        // When
        entryAdPage.closeModal();

        // Then
        assertFalse(entryAdPage.isModalDisplayed(), "Modal is displayed");
    }
}
