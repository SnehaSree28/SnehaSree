package TestNg.FailedTestCasesExecution;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by lovel on 19-Jan-19.
 */
public class TestCases {
    @Test
    public void test1(){
        System.out.println("Test 1");
        Assert.assertTrue(true);

    }
    @Test
    public void test2(){
        System.out.println("Test 2");
        Assert.assertTrue(false);
    }
}
