package forgotpassword;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordChecks extends BaseChecks {

    @Test
    public void testRetrievePassword() {
        // Given
        var forgotPasswordPage = homePage.clickForgotPasswordLink();

        // When
        forgotPasswordPage.setEmailAddress("test@testing.com");
        var emailSentPage = forgotPasswordPage.clickRetrievePasswordButton();

        // Then
        assertEquals(emailSentPage.getContentText(), "Your e-mail's been sent!");
    }
}