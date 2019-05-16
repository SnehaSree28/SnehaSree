package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by lovel on 04-Aug-18.
 */
public class Links {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","E:\\Selenium1stJuly\\server\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        int count=0;
        System.out.println("Total no.of links are" +links.size());
        for(WebElement link: links) {
            if (!link.getText().equals(" ")) {
                count=count+1;
                System.out.println(link.getText());
            }
            System.out.println("total no.of links witn text are "+count);
            if(link.getText().equalsIgnoreCase("Gmail")){
                link.click();
            }
        }
        driver.quit();



    }
}
