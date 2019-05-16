package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by lovel on 09-Jan-19.
 */
public class DataProviders {


    @Test(dataProvider = "getData")
    public void loginTest(String uid, String pwd){

        System.out.println("Username is: " +uid);
        System.out.println("pwd is: " +pwd);



        }
    @DataProvider(name="getData")
    public Object[][] getData(){
                Object[][] data = new Object[2][2];
        data [0][0] = "FirstUid";
        data [0][1] = "FirstPWD";

        data[1][0] = "SecondUid";
        data[1][1] = "SecondPWD";


        return data;
    }
}
