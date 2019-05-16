package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 13-Jan-19.
 */
public class Frames {
    WebDriver driver=null;
    JavascriptExecutor js=null;
    WebDriverWait wait=null;
    @BeforeTest
    public void intializeDriver(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
    //    WebDriver driver = new ChromeDriver();
    }
    @BeforeMethod
    public void launchDriver(){
        driver= new ChromeDriver();
        driver.get("https://www.toolsqa.com/iframe-practice-page/");
        driver.manage().window().maximize();
    }
    public void scroll(String scroll){
        js= (JavascriptExecutor)driver;
        js.executeScript("scroll");
    }

    @Test
    public void iframeTest() throws InterruptedException {
        System.out.println("Webdriver launched");
        wait=  new WebDriverWait(driver,10);
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("IF2"));
        WebElement if1 = driver.findElement(By.xpath("//iframe[@id='IF1']"));
        driver.switchTo().frame(if1);
        Thread.sleep(2000);
       // js.executeScript("window.scrollBy(0,100)");
//        driver.findElement(By.linkText("#")).click();
        String text=driver.getTitle();
        System.out.println(text);
        driver.findElement(By.xpath("(//*[@class='dt-mobile-menu-icon'])[1]")).click();
        driver.switchTo().frame(3);
        WebDriver webDriver = driver.switchTo().defaultContent();
        String title = webDriver.getTitle();
        System.out.println("Title is" +title);
        driver.close();
        /*Thread.sleep(2000);
        driver.findElement(By.xpath("(/*//*[@class='dt-mobile-menu-icon'])[1]")).click();*/
    }

    /*@AfterMethod

    public void quit(){
        driver.quit();
    }*/
}
