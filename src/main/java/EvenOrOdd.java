/**
 * Created by lovel on 11-Aug-18.
 */
public class EvenOrOdd {
    public static void main(String args[]) {
        int limit = 5;

        System.out.println("Printing Even numbers between 1 and " + limit);

        for (int i = 1; i <= limit; i++) {

            // if the number is divisible by 2 then it is even
            if (i % 2 == 0) {
                System.out.print(i + " " +"it is even number" );
            }
            else {
                System.out.println( +i + "It is odd number" );
            }
        }
    }
}
