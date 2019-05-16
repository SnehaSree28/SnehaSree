/**
 * Created by lovel on 11-Aug-18.
 */
public class Fibonacci {
    public static void main(String args[]) {

        int n = 7, t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i)
        {
            System.out.println( +t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}



