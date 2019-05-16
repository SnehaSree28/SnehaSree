package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 18-Jan-19.
 */
public class SelectClassEx {
    WebDriver driver =null;
    @BeforeMethod
    public void launchDriver(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
       driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
    }

    @Test

    public void select() throws InterruptedException, AWTException {
        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
      //  Wait wait = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(5,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        WebElement selectDropDownBox=driver.findElement(By.id("searchDropdownBox"));
        selectDropDownBox.click();
        Select select =new Select(selectDropDownBox);
        /*Actions actions  = new Actions(driver);
        actions.keyDown(Keys.DOWN);
        */

        Robot  robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        List<WebElement> options = select.getOptions();
        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String text = firstSelectedOption.getText();
        System.out.println(firstSelectedOption);
        boolean multiple = select.isMultiple();
        if(text.equalsIgnoreCase("All Categories")){
            int size=options.size();
            for(int i=0; i<size;i++) {
                options.get(1).click();
                System.out.println("Options are"+options.get(i).getText());
                Thread.sleep(2000);
            }
        }
     //   Assert.assertEquals(text,text);



    }

    @AfterMethod

    public void quit(){
        driver.quit();
    }


}
