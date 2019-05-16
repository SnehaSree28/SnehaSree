package Selenium;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

/**
 * Created by lovel on 11-Jan-19.
 */
public class ReportTest
{

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        ExtentReports reports= new ExtentReports("E:\\Logs");
        ExtentTest logger= reports.startTest("Verify Titles");
        WebDriver driver = new ChromeDriver();
        logger.log(LogStatus.INFO,"Browser Started");
        driver.get("https://www.google.com/");
        logger.log(LogStatus.INFO,"Application is starting");
        String  title= driver.getTitle();
        Assert.assertEquals("Google",title);
        logger.log(LogStatus.PASS,"Title Matched");
        reports.endTest(logger);
        driver.quit();
    }
}
