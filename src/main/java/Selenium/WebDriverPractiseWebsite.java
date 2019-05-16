package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by lovel on 30-Jan-19.
 */
public class WebDriverPractiseWebsite {
    WebDriver driver = null;


    @BeforeMethod
    public void t(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
    }
    @Test
    public void checkBox() {
        java.util.List<WebElement> elements = driver.findElements(By.xpath("//*[@type='checkbox']"));
        for (int i = 0; i < elements.size(); i++) {
            String value = elements.get(i).getAttribute("value");

        }
    }
        @Test
           public void hello(){
        WebElement element= driver.findElement(By.xpath("//select[@id='selenium_suite']"));
            List<WebElement> elements = element.findElements(By.xpath(".//option"));
            for(WebElement element1:elements){
                Select select = new Select(element1);
                select.isMultiple();
                System.out.println("===="+element1.getText());
            //Failing Test Case

            }
        }
        @Test
            public void alertBoxes() throws InterruptedException {
               WebElement element=driver.findElement(By.id("promptBox"));
               element.click();
               Alert alert = driver.switchTo().alert();
               alert.sendKeys("hello");
               Thread.sleep(5000);
               alert.accept();
        }
        @Test
        public void windows() throws InterruptedException {
               WebElement element=driver.findElement(By.id("win1"));
               element.click();
               driver.manage().window().maximize();
               String window1=driver.getWindowHandle();
               driver.switchTo().window(window1).close();
               Thread.sleep(5000);
               WebElement element1=driver.findElement(By.id("win2"));
               element1.click();
               driver.manage().window().maximize();
               String window2=driver.getWindowHandle();
               driver.switchTo().window(window2).close();

        }
        @AfterMethod
       public void close(){
            driver.quit();
        }

    }


