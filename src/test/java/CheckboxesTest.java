import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckboxesTest extends BaseTest {

    @Test
    public void verificationCheckboxes() {

    driver.get("https://the-internet.herokuapp.com/checkboxes");
    List<WebElement> checkBoxes = driver.findElements(By.cssSelector("[type = 'checkbox']"));
      Assert.assertFalse(checkBoxes.get(1).isSelected(), "Чек-бокс включен");
}
}

