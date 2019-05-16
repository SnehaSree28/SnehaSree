import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 28-Oct-18.
 */
public class ImplicitWait {
    public static void main(String args[])
    {
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        String india= driver.findElement(By.xpath("//*[text()='India']")).getText();
        System.out.println(india);
        driver.findElement(By.id("selenium")).sendKeys("123");
        driver.quit();
    }
}
