package slider;

import base.BaseChecks;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SliderChecks extends BaseChecks {

    @Test
    public void testSlider() {
        // Given
        var horizontalSliderPage = homePage.clickHorizontalSliderLink();

        // When
        horizontalSliderPage.moveSlider(8);

        // Then
        assertEquals(horizontalSliderPage.getValue(), "4");
    }
}