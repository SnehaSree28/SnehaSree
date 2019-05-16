import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by lovel on 23-Aug-18.
 */
public class Frames {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("_mN_cksync_0");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        System.out.println("Frame has been selected" + driver);
        // driver.findElement(By.className("//*[normalize-space(text())='Home']")).click();
        //   driver.findElement(By.xpath("//*[text()='New Tours']")).click();
        WebElement element =driver.findElement(By.xpath("(//a[normalize-space(text()) ='Selenium'])[1]"));
        element.click();
        System.out.println("Home is navigated");
    }
}


