package contextmenu;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuChecks extends BaseChecks {

    @Test
    public void showContextMenuCheck() {
        // Given
        var contextMenuChecks = homePage.clickContextMenuLink();

        // When
        contextMenuChecks.getContextMenu();

        // Then
        assertEquals(contextMenuChecks.alert_getText(), "You selected a context menu",
                "Alert text incorrect");
        contextMenuChecks.alert_clickToAccept();
    }
}
