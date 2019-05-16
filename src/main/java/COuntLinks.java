import TestNg.ListenersTestNG;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.List;


/**
 * Created by lovel on 17-Nov-18.
 */
@Listeners(ListenersTestNG.class)
public class COuntLinks {
@Test

        public void countLinks(){
    Logger logger= Logger.getLogger(COuntLinks.class);

    System.setProperty("webdriver.chrome.driver", ".//server//chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    List<WebElement> countLinks = driver.findElements(By.tagName("a"));
    int count = 0;
    for (int i = 0; i < countLinks.size(); i++) {
        System.out.println("links are" + countLinks.get(i).getText());
        count ++;
    }
            //System.out.println(count);
    logger.info(count);
    }
    }

