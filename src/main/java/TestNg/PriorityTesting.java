package TestNg;

import org.testng.annotations.Test;

/**
 * Created by lovel on 10-May-19.
 */
public class PriorityTesting {
    @Test( priority = 0 )
    public void testA1() {
        System.out.println("testA1");
    }

    @Test( priority = 1 )
    public void testA2() {
        System.out.println("testA2");
    }

    @Test( priority = 1 )
    public void aestA3() {
        System.out.println("testA3");
    }
}
