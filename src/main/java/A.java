import org.testng.annotations.Test;

/**
 * Created by lovel on 25-Sep-18.
 */
public class A {

    @Test(priority = -4)
    public void test(){
        System.out.println("Hello");
    }
    @Test(priority = 0)
    public void hello(){
        System.out.println("Hi");
    }

    @Test
    public void h(){
        System.out.println("ggg");
    }
}