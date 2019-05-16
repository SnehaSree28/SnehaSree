package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 25-Jan-19.
 */
public class WaitClass {
    WebDriver driver = null;
    @Test

    public void test(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.findElement(By.id("login-username")).sendKeys("abc");

    }
}
