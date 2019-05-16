package JavaStrings;

import org.testng.annotations.Test;

/**
 * Created by lovel on 03-Jan-19.
 */
public class RemoveSpacesFromString
{
    @Test
    public void removespacefromstring(){
        String s= " Sneha Sree        ";
        System.out.println("Length of string before removing white space" +s.length());
        //trim methodremoves spaces from beginning and end of the string
        String trim = s.trim();
        System.out.println("Length of string after removing white space" +trim.length());
        System.out.println("String after removing spaces" +trim);
        String withspace="ABC DEF IJK LMN OP";
        System.out.println("String with white space between words:" +withspace);
        String withoutspace=withspace.replaceAll("\\s","");
        System.out.println("String with white space between words:" +withoutspace);
   }
}
