package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by lovel on 15-Jan-19.
 */
public class ActionsClassExample
{
    WebDriver driver = null;
    @BeforeTest(groups = {"sanity testing"})

    public void intializeChromeDriver(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver= new ChromeDriver();
    }
    @BeforeMethod(groups = {"sanity testing"})
    public void launchDriver(){
        driver.get("https://www.facebook.com//");
        String getCurrentURL= driver.getCurrentUrl();
        driver.get("");
        System.out.println("Current Url is:" +getCurrentURL);
        driver.manage().window().maximize();

    }

    @Test()
    public void testing(){
        Actions actions = new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username=driver.findElement(By.id("email"));
        WebElement pass= driver.findElement(By.id("pass"));
        Actions actions1 = actions.moveToElement(username);
        actions1.sendKeys("Hello");
        actions.moveToElement(pass).sendKeys("Hello",Keys.ENTER).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test(groups={"Car"})
    public  void test2(){
        System.out.println("Car");
    }
    @Test(groups = {"Car"})
    public void test3(){
        System.out.println("HelloCar");
    }

    @AfterMethod
    public void quit(){
        driver.quit();
    }

    @Test(priority = 0)
    public void draganddropTest(){
        driver.navigate().to("http://jqueryui.com/droppable/");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));
        WebElement drag = driver.findElement(By.xpath(" //div[@id='draggable']"));
        WebElement drop=driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();
    }
}
