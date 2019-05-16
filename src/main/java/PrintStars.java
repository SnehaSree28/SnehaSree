/**
 * Created by lovel on 11-Aug-18.
 */
public class PrintStars {
    public static void main(String args[]) {
        int i, j;

        // outer loop to handle number of rows
        //  n in this case
        int n=5;
        for (i = n; i >=1; i--) {

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for (j = 1; j <= i; j++) {
                // printing stars
                System.out.print( j+" ");
            }

            // ending line after each row
            System.out.println();
        }
    }
}

