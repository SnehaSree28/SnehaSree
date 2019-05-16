/**
 * Created by lovel on 27-Oct-18.
 */
public class Exam {
    public static void main(String args[]){
        int i =010;
        int j =07;
        System.out.println(i);
        System.out.println(j);
        Boolean b1 = new Boolean("false");
        boolean b2;
        b2= b1.booleanValue();
        System.out.println(b2);
        if (!b2)
        {
            b2 = true;
            System.out.print("x ");
        }
        if (b1 & b2) /* Line 13 */
        {
            System.out.print("y ");
        }
        System.out.println("z");

    }
}
