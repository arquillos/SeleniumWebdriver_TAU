package javascript;

import base.BaseChecks;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownOptionChecks extends BaseChecks {

    @Test
    public void dropDownOptionChangeCheck() {
        // Given
        var dropDownPage = homePage.clickDropDownLink();

        // When
        dropDownPage.setMultipleOptions();
        var options = List.of("Option 1", "Option 2");
        options.forEach(dropDownPage::selectFromDropDown);

        // Then
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), options.size(), "Incorrect number of selections");
        assertTrue(selectedOptions.containsAll(options), "Option 1 not selected");
    }
}
