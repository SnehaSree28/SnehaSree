package JavaStrings;

import org.testng.annotations.Test;

/**
 * Created by lovel on 05-Feb-19.
 */
public class ReverseEachWordInString {

    @Test
    public void test1() {
        String s = "geekss@for@geekss";
        String[] split = s.split("@", 1);
        for (String a : split) {
            System.out.println(a);
        }
    }
        @Test
                public void reverseOfAWord(){
            String inputString="Java Concept Of the Day";
            String[] words = inputString.split(" ");
            String reverseString = "";
            for (int i = 0; i < words.length; i++)
            {
                String word = words[i];
                String reverseWord = "";
                for (int j = word.length()-1; j >= 0; j--)
                {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reverseString = reverseString + reverseWord + " ";
            }
            System.out.println(inputString);
            System.out.println(reverseString);
            System.out.println("-------------------------");
        }
    }



