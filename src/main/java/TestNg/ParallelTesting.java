package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by lovel on 18-Jan-19.
 */
public class ParallelTesting {
    WebDriver driver =null;

    @Test
    public void chromeDriver() {
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        driver.quit();
    }
    @Test

    public void firefoxDriver(){
        System.setProperty("webdriver.gecko.driver","./server/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
        driver.quit();

    }
}

