package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by lovel on 19-Jan-19.
 */

@Listeners(ListenersTestNG.class)
public class ListenerTestNGTestCase {
    WebDriver driver= null;

    // Test to pass as to verify listeners .
    @Test(priority=1)
    public void TestToPass()
    {
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver=new ChromeDriver();

        System.out.println("This method to pass test");
        driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/");
        driver.getTitle();
        driver.quit();
    }

    @Test(priority = 2)
    public void testToSkip(){
        System.out.println("This method to skip test");
        try {
            throw new Exception("Skipping-This is not ready for testing");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test(priority=3)
    public void TestToFail()
    {
        driver.getTitle();
        System.out.println("This method to test fail");
    }



}
