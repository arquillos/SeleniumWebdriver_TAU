package login;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginChecks extends BaseChecks {

    @Test
    public void testSuccessfulLogin() {
        // Given
        var loginPage = homePage.clickFormAuthentication();

        // When
        loginPage.setUserName("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");

        // Then
        var secureAreaPage = loginPage.clickLoginButton();
        String actual = secureAreaPage.getStatusAlertText();
        assertEquals(actual, "You logged into a secure area!\n" + "×");
    }
}