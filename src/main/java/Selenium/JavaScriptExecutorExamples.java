package Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * Created by lovel on 09-Jan-19.
 */
public class JavaScriptExecutorExamples
{
    @FindBy(id="email")
    public WebElement email;

    @FindBy(id="pass")
    public WebElement password;

    @FindBy(id="u_0_2")
    public WebElement login;


    @Test(priority = 1)
    public void test(){
        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //To sendkeys for an element
      /*  js.executeScript("document.getElementById('email').value='lovelysneha77'");
        js.executeScript("document.getElementById('pass').value='karunakar@1957'");*/
     /*   String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);*/


      //  String windowHandle = driver.getWindowHandle();
        //To click on Element
     //   js.executeScript("document.getElementById('u_0_2').click");
        //Another way to click on element
    //    js.executeScript("arguments[0].click();",login);
       // String text=js.executeScript("return document.URL").toString();
       // System.out.println("URl is: "+text);
        String title = driver.getTitle();
        System.out.println("Title" +title);
        //Assert.assertTrue/(title);
        boolean b = false;
        boolean c= false;
      /*  Assert.assertEquals(title,"Facebook – log in or sign up");
        Assert.assertFalse(b,"Hello");
        Assert.assertTrue(c,"Found true");*/
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(title,"Facebook – log in or sign up");
        softAssert.assertTrue(c,"Hello");
        System.out.println("Hi");
        softAssert.assertAll();
            }

            @Test(priority = 2)
             public void testing(){
                System.out.println("Second Method Priority 2 has been executed");
            }
}
