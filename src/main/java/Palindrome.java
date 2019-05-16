import java.util.Scanner;

/**
 * Created by lovel on 28-Sep-18.
 */
public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anumber");
        int n =sc.nextInt();
        int t=n;
        int sum=0;
        int rev =0;
        while(n>0){
            rev=n%10;  //getting remainder
            sum=(sum*10)+rev;
            n=n/10;
        }

        if (t==sum)
            System.out.println(t+" is a palindrome number");
        else
            System.out.println(t+" is not a palindrome number");

    }
}
