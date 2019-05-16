import java.util.*;

/**
 * Created by lovel on 04-Jan-19.
 */
public class ArrayIntoCollection {
    public static void main(String args[]){
        String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

        // Conversion of array to ArrayList
        // using Arrays.asList

        //geeks.length




        List<String> al = new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(al);

        // Adding some more values to the List.
        al.add("Shashank");
        al.add("Nishant");
        al.add("Sneha");
        al.add("Sneha");
        Set set= new HashSet();
       ///
        for(int i=0;i<al.size();i++){
            String items=al.get(i);
            System.out.println(items
            );
            if(!set.add(items)){
                System.out.println("Duplicate elements are"  +set);
            }
            //Iteratin over a list
            Iterator<String> iterator = al.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
            //Searching of an element in a list

            if(items.contains("Sneha")){
                System.out.println("Element fount");
            }else{
                System.out.println("Not found");
            }
            int firstIndex=items.indexOf("Rahul");
            System.out.println(firstIndex);
            int lastIndex=items.indexOf(1);
            System.out.println(lastIndex);
        }

        //Reversing elements in alist
        List<Integer> reverseElements= new ArrayList<Integer>();
            for(int i=0;i <=10 ;i++)
                reverseElements.add(i);
                System.out.println("Before Reversing" +reverseElements);

                Collections.reverse(reverseElements);
        System.out.println("After reversing" +reverseElements);
    }
}
