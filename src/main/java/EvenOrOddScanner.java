import java.util.Scanner;

/**
 * Created by lovel on 11-Aug-18.
 */
public class EvenOrOddScanner {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int sb= scanner.nextInt();
        if(sb%2==0) {
            System.out.println("It is even number");
        }
            else{
                System.out.println("It is odd number");

            }        }
    }

