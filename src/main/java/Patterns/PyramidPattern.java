package Patterns;

/**
 * Created by lovel on 07-Jan-19.
 */
public class PyramidPattern {
    public static void main(String args[]){
        int n = 5;
        printTriagle(n);
    }
    // Take No.of rows ////Outer loop to handle no of rows

    public static void printTriagle(int n){
        for(int i=0;i<n;i++){
            // inner loop to handle number spaces
            // values changing acc. to requirement
            for(int j=n-i;j>1;j--){
                //printing spaces
                System.out.println(" ");
            }
            for(int j=0;j<=i;j++){
                // printing stars
                System.out.print("* ");
            }
            // ending line after each row
            System.out.println();
        }
    }
}
