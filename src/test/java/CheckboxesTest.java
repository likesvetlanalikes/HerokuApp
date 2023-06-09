import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest extends BaseTest {

    @Test
    public void verificationCheckboxes() {

    driver.get("https://the-internet.herokuapp.com/checkboxes");
    List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type = 'checkbox']"));
        assertFalse(checkBoxes.get(0).isSelected(), "Checkbox is clicked");

        checkBoxes.get(0).click();

        assertTrue(checkBoxes.get(0).isSelected(),"Checkbox is not clicked");
    }

    @Test
    public void userDisabledCheckboxNumber2(){
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));

        assertFalse(checkboxes.get(1).isSelected(),"Checkbox is clicked");

        checkboxes.get(1).click();

        assertTrue(checkboxes.get(1).isSelected(),"Checkbox is not clicked");
    }
}

