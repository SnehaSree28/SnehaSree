import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by lovel on 22-Aug-18.
 */
public class IFrames {
    WebDriver driver;
@BeforeMethod
    public void initialize() {
        System.setProperty("webdriver.chrome.driver", "E:\\Selenium1stJuly\\server\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    public void iframes() throws InterruptedException {
        //driver.get("http://demo.guru99.com/test/guru99home/");
        driver.navigate().to("http://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("_mN_cksync_0");
        driver.manage().window().maximize();

        System.out.println("Frame has been selected" + driver);
        // driver.findElement(By.className("//*[normalize-space(text())='Home']")).click();
     //   driver.findElement(By.xpath("//*[text()='New Tours']")).click();
        WebElement element =driver.findElement(By.xpath("(//a[normalize-space(text()) ='Selenium'])[1]"));
        element.click();
        System.out.println("Home is navigated");


    }

    // public static void main(String args[]) throws InterruptedException {
    @Test
    public void mainMethod() throws InterruptedException {

        IFrames i = new IFrames();
        i.initialize();
        i.iframes();

    }

    @Test
    public void iframesCount(){
        driver.get("http://toolsqa.com/iframe-practice-page");
        driver.manage().window().maximize();
        List<WebElement> iframes= driver.findElements(By.tagName("iframe"));
        System.out.println(iframes.size());
        WebDriver frame = driver.switchTo().frame(0);
        System.out.println(frame);
        driver.switchTo().frame(1);
        driver.switchTo().frame(2);
        driver.switchTo().parentFrame();


    }

}

