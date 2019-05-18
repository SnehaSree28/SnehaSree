import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.nio.channels.SelectableChannel;
import java.util.List;

/**
 * Created by lovel on 02-Aug-18.
 */
public class Amazon {
@Test
        public void amazonWebsite(){

        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();
        WebElement selectDropDownBox=driver.findElement(By.id("searchDropdownBox"));
        selectDropDownBox.click();
        Select select= new Select(selectDropDownBox);
       List<WebElement> item= select.getOptions();
       for(WebElement items:item){
           System.out.println(items.getText());
       }
          WebElement defaultValue=select.getFirstSelectedOption();
        String text = defaultValue.getText();
  /*  SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(text,"all");
    softAssert.assertAll();*/
        Assert.assertEquals(text,"All ");
      System.out.println("Hello");
        driver.quit();

    }
    @Test

    public void nextMethod(){
        System.out.println("Its is executing");
    }


    @Test
    public void gitTesting(){
        System.out.println("Git Testing New ");
    }

}
