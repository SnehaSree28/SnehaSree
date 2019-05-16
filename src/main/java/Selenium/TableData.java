package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.awt.SystemColor.text;

/**
 * Created by lovel on 29-Jan-19.
 */
public class TableData {

    WebDriver driver=null;
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/WebTable.html");
        driver.manage().window().maximize();
        WebElement s=driver.findElement(By.xpath("//*[text()='Sebastian']"));
        s.getSize().getHeight();
        if(s.isDisplayed()){
            Actions actions = new Actions(driver);
            WebElement element=driver.findElement(By.xpath("(//*[@class='btn btn-danger btn-xs'])[5]"));
            actions.moveToElement(element).build().perform();
            actions.contextClick().moveToElement(element).build().perform();
        }
        boolean displayed = s.isDisplayed();
        Assert.assertTrue(displayed,"It is displayed");
    }

    @Test
    public void select(){
    }
}
