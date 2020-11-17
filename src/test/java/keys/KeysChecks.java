package keys;


import base.BaseChecks;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysChecks extends BaseChecks {

    @Test
    public void testBackspace() {
        // Given
        var keyPressesPage = homePage.clickKeyPressesLink();

        // When
        keyPressesPage.enterText(Keys.BACK_SPACE);

        // Then
        assertEquals(keyPressesPage.getResultText(), "You entered: BACK_SPACE");
    }
}