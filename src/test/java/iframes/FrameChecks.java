package iframes;

import base.BaseChecks;
import org.testng.annotations.Test;
import pages.EditorPage;

import static org.testng.Assert.assertEquals;

public class FrameChecks extends BaseChecks {

    @Test
    public void editorCheck() {
        // Given
        var editorPage = homePage.clickWYSIWYGEditorLink();

        // When
        editorPage.clearTextArea();
        editorPage.setTextArea("Hello");
        editorPage.increaseIndent();

        // Then
        assertEquals(editorPage.getTextArea(), "Hello", "Text area is incorrect");
    }
}
