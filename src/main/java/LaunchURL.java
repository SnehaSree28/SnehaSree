import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

/**
 * Created by lovel on 01-Jul-18.
 */

public class LaunchURL {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/recharge");
        driver.manage().window().maximize();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement menuButton=driver.findElement(By.xpath("//i[@class='icon-hamburger _2eUq']"));
        menuButton.click();
        String s= driver.getWindowHandle();
        Set<String> s1= driver.getWindowHandles();
        for (String s2 : s1 ){
            driver.switchTo().window(s2);
        }
        s1.size();
        System.out.println("window handle is " +s);
        driver.quit(); //Closes only current window
   }
}
