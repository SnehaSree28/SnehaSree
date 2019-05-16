import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by lovel on 11-Aug-18.
 */
public class RemoveSpaces {
    public static void  main(String args[]){
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://projects.qedgetech.com/xpath/");
        WebElement d= driver.findElement(By.xpath("//*[@class='btn btn-info btn-lg']"));
        System.out.println(d.getText());

    }
}
