package dropdown;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownChecks extends BaseChecks {

    @Test
    public void testSelectOption() {
        String option = "Option 2";

        //Given
        var dropDownPage = homePage.clickDropDownLink();

        // When
        dropDownPage.selectFromDropDown(option);

        // Then
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
