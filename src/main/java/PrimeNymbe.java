import java.util.Scanner;

/**
 * Created by lovel on 28-Sep-18.
 */
public class PrimeNymbe {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number");
        int n =sc.nextInt();
        boolean flag =true;
        for(int i=0; i< n;i++){
            for(int j=2;j<i; j++){
                if(i%j==0){
                    flag=false;
                    break;
                }

            }
            if(flag){
                System.out.println("Prime Numebr");
            }else {
                System.out.println("Not a prome");
            }
        }
    }
}
