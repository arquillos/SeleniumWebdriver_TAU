package fileupload;

import base.BaseChecks;
import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

public class FileUploadChecks extends BaseChecks {

    @Test
    public void uploadFileCheck() {
        // Given
        var fileUploaderPage = homePage.clickFileUploadLink();

        // When
        fileUploaderPage.setUploadFile("F:\\Programacion\\Proyectos\\TAU_SeleniumWebdriver\\src\\main\\resources\\chromedriver.exe");

        // Then
        assertEquals(fileUploaderPage.getUploadedFiles(), "chromedriver.exe", "Incorrect uploaded file");
        assertEquals(fileUploaderPage.getUploadResult(), "File Uploaded!", "Incorrect result message");
    }
}
