/**
 * Created by lovel on 28-Dec-18.
 */
public class StringPalindrome {
    public static void main(String  args[]) {
        //String s="SnehaSree";
        String s = "radar";
        String rev="";
        int length = s.length();
        for(int i=s.length()-1;i>=0;i--)
            rev=rev+s.charAt(i);
            if(s.equals(rev))
                System.out.println("String is palindrome");
            else
                System.out.println("String is not palindrome");
        }



    }

