package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

/**
 * Created by lovel on 20-Jan-19.
 */
public class OpenNewtabCode {
    WebDriver driver =null;
    @FindBy(id="txtActorUserName")
    public WebElement userName;

    @FindBy(id="txtActorPassword")
    public WebElement password;

    @FindBy(name="btnLogin")
    public WebElement login;

    @FindBy(xpath = "//*[contains(text(),'My Signage')]")
    public WebElement mySignage;

    @FindBy(xpath = "//*[contains(text(),'My Designer')]")
    public WebElement myDesigner;

    public void login(String username, String pwd){
    userName.sendKeys(username);
    password.sendKeys(pwd);
    login.click();
    }

    public String hoverOnMySignage(){
        Actions actions = new Actions(driver);
        actions.moveToElement(mySignage).build().perform();
        actions.moveToElement(myDesigner).click();
        String title=driver.getWindowHandle();

        System.out.println("Title is " +title);
        return title;
    }

     public OpenNewtabCode(){
        PageFactory.initElements(driver,this);
    }


}
