import java.util.ArrayList;
import java.util.List;

/**
 * Created by lovel on 24-Dec-18.
 */
public class DuplicateElementsInArray {
    public static void main(String args[]){
        int a1[]={1,2,3,3,5,4,6,7};
        int a2[]={7,8,3,1};
        for(int i=0; i<a1.length;i++)
        {
            for(int j=0; j< a2.length;j++ ){
                if(a1[i]== a2[j]){
                    System.out.println(a1[i]);
                }
            }
        }

    }
}
