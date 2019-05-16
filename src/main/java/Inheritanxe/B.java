package Inheritanxe;

/**
 * Created by lovel on 07-Oct-18.
 */
public class B extends A{
    public void c(){
        System.out.println( "Hello");
        System.out.println(getA());
    }

    public static void main(String args[]){
        B b = new B();
        b.c();
    }
}
