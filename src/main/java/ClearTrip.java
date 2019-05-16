import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by lovel on 11-Aug-18.
 */
public class ClearTrip {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cleartrip.com");
        WebElement roundTrip=driver.findElement(By.id("MultiCity"));
        roundTrip.click();
        ////*[text()='Return on'
        WebElement returnOn=driver.findElement(By.xpath("//*[text()='Return on']"));
        String text=returnOn.getText();
        if(roundTrip.isDisplayed()==returnOn.isDisplayed())
        {
            System.out.println("Validated");
        }else {
            System.out.println("Not");
        }
        Select select = new Select(returnOn);


    }
}
