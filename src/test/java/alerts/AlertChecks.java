package alerts;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertChecks extends BaseChecks {

    @Test
    public void testAlertAccept() {
        // Given
        var alertsPage = homePage.clickJavaScriptAlertLink();

        // When
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();

        // Then
        assertEquals(alertsPage.getResult(), "You successfuly clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testConfirmDismiss() {
        // Given
        var alertsPage = homePage.clickJavaScriptAlertLink();

        // When
        alertsPage.triggerConfirm();

        // Then
        assertEquals(alertsPage.confirm_getText(), "I am a JS Confirm", "Confirm text incorrect");

        alertsPage.confirm_clickToDismiss();
        assertEquals(alertsPage.getResult(), "You clicked: Cancel", "Result text incorrect");
    }

    @Test
    public void testPromptText() {
        // Given
        String expected = "Hello!";
        var alertsPage = homePage.clickJavaScriptAlertLink();

        // When
        alertsPage.triggerPrompt();
        alertsPage.prompt_setText(expected);
        alertsPage.prompt_clickToAccept();

        // Then
        assertEquals(alertsPage.getResult(), "You entered: " + expected, "Result not expected");
    }
}