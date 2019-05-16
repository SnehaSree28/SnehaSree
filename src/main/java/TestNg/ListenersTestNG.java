package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


/**
 * Created by lovel on 19-Jan-19.
 */
public class ListenersTestNG implements ITestListener {

    @Override
    public void onTestStart(ITestResult result){

    }
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("The name of the testcase passed is :"+result.getName());

    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("The name of the testcase failed is :"+ result.getName());

    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of the testcase Skipped is :"+result.getName());

    }
   @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }
    @Override
    public void onStart(ITestContext context) {

    }
    @Override
    public void onFinish(ITestContext context) {

    }

}
