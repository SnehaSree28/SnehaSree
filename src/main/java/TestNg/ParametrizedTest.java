package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**{
 *
 }
 * Created by lovel on 09-Jan-19.
 */
public class ParametrizedTest {

    @Test
    @Parameters("browser")
    public void parameterizedTest(String browser)
    {
        if(browser.equals("chrome")){
            System.out.println("open chrome browsrr");
        }else if(browser.equals("firefox")){
            System.out.println("Open firefox browser");
        }
    }
}
