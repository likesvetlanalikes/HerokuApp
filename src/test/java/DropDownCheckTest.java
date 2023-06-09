import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownCheckTest extends BaseTest {
    @Test
    public void checkDropdownList() {?

        driver.get("https://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.id("dropDownList")));

        List<WebElement>options = dropdown.getOptions();
        if(options.size()==2) {
            System.out.println("Dropdown list contains two elements");
        }else {
            System.out.println("Dropdown list doesn't contain two elements!");
        }

        driver.quit();


    }
}
