import Selenium.OpenNewtabCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by lovel on 20-Jan-19.
 */
public class OpenTabNewCodeTest {
    WebDriver driver=null;
    OpenNewtabCode op=null;

    @BeforeMethod

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("http://www.sayaportal.com/");
        driver.manage().window().maximize();
        op = new OpenNewtabCode();
        op.login("gaiandemo","gaian@123");
    }

    @Test(priority = -1)
    public void clickOnMyDesigner(){
        String title=op.hoverOnMySignage();
        driver.close();
    }
    @Test(priority = 0)
    public void h(){
        System.out.println("hello");
    }
}
