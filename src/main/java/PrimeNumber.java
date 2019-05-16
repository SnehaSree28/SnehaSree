/**
 * Created by lovel on 07-Aug-18.
 */
public class PrimeNumber {
    public static void main(String args[]){
        ///Divided by Itself
        int num = 13;
        boolean flag = false;
        for(int i = 2; i <=num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                System.out.println("Ending of for loop");
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        }

    }

