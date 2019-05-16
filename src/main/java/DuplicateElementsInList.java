import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by lovel on 03-Jan-19.
 */
public class DuplicateElementsInList {
    public static void main(String args[]){
    List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("2");
        list.add("5");
        list.set(4,"6");

        Set<String > checkDuplicates = new HashSet<String>();
        System.out.println("Actual List"+list);
        for(int i=0;i<list.size();i++){
            String items=list.get(i);
            if(!checkDuplicates.add(items)){
                System.out.println("Duplicates are" +items);
            }

        }
///Didnt get the program, need to understand it
    }
}
