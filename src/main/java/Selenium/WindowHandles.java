package Selenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by lovel on 13-Jan-19.
 */
public class WindowHandles {
    public static Logger log=Logger.getLogger(WindowHandles.class.getName());

    WebDriver driver = null;
   @BeforeMethod

    public void launchURL(){
       System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("http://www.naukri.com/");
       driver.manage().window().maximize();

   }
   @Test
    public void firstWayOfHandling(){
       String parentWindow = driver.getWindowHandle();
       log.info("Hello");
       System.out.println("ParentWindow: " +parentWindow);
       Set<String> windowHandles = driver.getWindowHandles();

       Iterator<String> i=windowHandles.iterator();
       while(i.hasNext()){
           String childWindow=i.next();


           System.out.println("Child Window: "+childWindow);
           if(!parentWindow.equals(childWindow)){
               driver.switchTo().window(childWindow);
               System.out.println("Title is"+driver.switchTo().window(childWindow).getTitle());
               System.out.println("Current url is" +driver.switchTo().window(childWindow).getCurrentUrl());
               System.out.println("PageSourceis" +driver.switchTo().window(childWindow).getPageSource());

           }
           driver.switchTo().window(parentWindow);
           }

   }
   @Test
   public void anotherWay(){
            String parentWindow=driver.getWindowHandle();
            System.out.println("Parent Window:" +parentWindow);
            System.out.println(driver.switchTo().window(parentWindow).getTitle());
            for(String childWindow:driver.getWindowHandles())
            {
                if(!parentWindow.equals(childWindow))
                driver.switchTo().window(childWindow);
                System.out.println(driver.switchTo().window(childWindow).getTitle());

            }
       driver.switchTo().window(parentWindow);

       Reporter.log("Browser Opened");
   }

}
