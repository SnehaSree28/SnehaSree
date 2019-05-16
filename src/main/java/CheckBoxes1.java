import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by lovel on 30-Jan-19.
 */
public class CheckBoxes1 {
    WebDriver driver=null;
    public void t1(List<CheckBoxes> checkBoxes){
        for(CheckBoxes checkBoxes1:checkBoxes) {
            WebElement element = driver.findElement(By.xpath("//*[@value='" + checkBoxes1 + "']"));
            if (element.isDisplayed()) {
                element.click();
            }
        }
    }
}
