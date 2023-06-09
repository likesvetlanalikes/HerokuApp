import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
import java.util.List;

public class AddRemoveElementsTest extends BaseTest{

    @Test
    public void addRemoveElements(){

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElementButton = driver.findElement(By.cssSelector("[onclick='addElement()'"));
        addElementButton.click();
        addElementButton.click();

        List<WebElement> deleteButtonList = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtonList.size(), 2,"Элемент не 2");

        deleteButtonList.get(0).click();
        deleteButtonList = driver.findElements(By.cssSelector("[onclick='deleteElement()']"));
        assertEquals(deleteButtonList.size(), 1,"Элемент не 2");
    }
}
