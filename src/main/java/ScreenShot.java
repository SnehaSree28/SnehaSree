import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by lovel on 04-Aug-18.
 */
public class ScreenShot {
    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        File file= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       // FileUtils.copyFile(file,new File("./ScreenShots.png"));


    }

}
