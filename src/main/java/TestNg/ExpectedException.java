package TestNg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lovel on 18-Jan-19.
 */
public class ExpectedException
{
    DataProviders d ;

    @Test(expectedExceptions = NullPointerException.class)

    public void t1(){
                d= new DataProviders();
            System.out.println("Hello");
    }


    @Test(expectedExceptions = ArithmeticException.class)
    public void t2(){
        System.out.println("SoftwareTestingMaterial.com");
        int i = 1 / 0;
    }
}
