package JavaStrings;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by lovel on 02-Aug-18.
 */
public class String1 {
    public static void main(String args[]){
        String s="Sachin";
        String s2= "Jambula";
        String s3="SnehaSree";
        String s4="SnehaSree";
        String s5="sneha sree ";

        String s6=50+30+"Sachin"+40+40;
        String s1= s.concat(" Tendulkar");//concat() method appends the string at the end
        System.out.println(s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s4));
        System.out.println(s5.compareTo(s4));
        System.out.println(s6);

        System.out.println(s5.substring(5));
        System.out.println(s5.substring(1,4));


    }
}
