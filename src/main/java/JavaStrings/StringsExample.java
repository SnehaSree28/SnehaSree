package JavaStrings;

/**
 * Created by lovel on 28-Aug-18.
 */
public class StringsExample {

   static public String method(String s) {

       return s;
    }
  static public String method2(String s1, String s2)
    {
     return s1.concat(s2);
    }
    public int method3(int a){
       return a;
    }


    public static void main(String args[]) {
       StringsExample stringsExample = new StringsExample();

int length= method("GeeksForGeeks").length();
        System.out.println("Lenghth is "+ length);
        System.out.println("Char at postion " + method("GeeksForGeeks").charAt(5));
        System.out.println("Substring us " +method("GeeksForGeeks").substring(5));
        System.out.println("Substring from"+method("GeeksForGeeks").substring(3,6));
        //System.out.println("Sting Concatenation"+method2("GeeksForGeeks").concat());

    }


}