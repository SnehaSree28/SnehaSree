/**
 * Created by lovel on 03-Jan-19.
 */
public class MaxTwoValuesInArray {

    public void printTwoMaxNumbers(int[] num){
        int maxOne = 0;
        int maxTwo = 0;
        for(int n:num){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: "+maxOne);

         System.out.println("Second Max Number: "+maxTwo);
    }

    public static void main(String a[]){
        int num[] = {1,2,3,4,5};
        MaxTwoValuesInArray m= new MaxTwoValuesInArray();
        m.printTwoMaxNumbers(num);
    }
}
