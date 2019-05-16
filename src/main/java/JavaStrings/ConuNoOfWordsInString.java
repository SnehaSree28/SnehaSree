package JavaStrings;

/**
 * Created by lovel on 15-Jan-19.
 */
public class ConuNoOfWordsInString {
    public static void main(String args[]){
        String s = "Sneha Sree ddd";

        int count = 1;

        for (int i = 0; i < s.length() - 1; i++)
        {
            if ((s.charAt(i) == ' ' ) && (s.charAt(i + 1) != ' '))
            {
                count++;

            }
        }
        System.out.println("Number of words in a string = " + count);
    }
    }





