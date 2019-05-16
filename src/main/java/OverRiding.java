import org.testng.annotations.Test;

/**
 * Created by lovel on 08-Sep-18.
 */
public class OverRiding {
    public void method(int a, int b) {

        System.out.println(a+b);
    }


    class B extends OverRiding{
        public void method(int a, int b) {

            System.out.println(a-b);
        }

    }

 @Test
    public void test(){
        B b = new B();
        b.method(8,7);

    }
}