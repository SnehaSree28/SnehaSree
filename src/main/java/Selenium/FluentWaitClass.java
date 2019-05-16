package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 15-Jan-19.
 */
public class FluentWaitClass {
    WebDriver driver= null;
    @Test

    public void fluentWait(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
         driver = new ChromeDriver();
        Wait wait = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        driver.get("https://www.youtube.com");

    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

}
