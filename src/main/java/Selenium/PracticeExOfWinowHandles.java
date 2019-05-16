package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;

/**
 * Created by lovel on 18-Jan-19.
 */
public class PracticeExOfWinowHandles {
    @Test

    public void handleWindows(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://www.naukri.com/");
        driver.manage().window().maximize();

        String parentWindow=driver.getWindowHandle();
        System.out.println("Parent Window is" +parentWindow);
        Set<String> windowHandles=driver.getWindowHandles();
        Iterator<String> iterator = windowHandles.iterator();

        while (iterator.hasNext()){
            String childWindow=iterator.next();
            System.out.println("Child Window is"+childWindow);
            if(!parentWindow.equals(childWindow)){
                driver.switchTo().window(childWindow);
            }
        }



    }
}
