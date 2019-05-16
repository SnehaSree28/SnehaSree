/**
 * Created by lovel on 10-Aug-18.
 */
public class Factorial {
    public static void main(String args[]){
        int fact=1,number=5;
        int fact1;
        for(int i=1; i<=number;i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of" +number+ "is" +fact);

    }
}

