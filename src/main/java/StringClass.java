import org.testng.annotations.Test;

/**
 * Created by lovel on 04-Jul-18.
 */
public class StringClass {
        //String s="Sneha";


    @Test
            public void hello(){
        StringsExample stringsExample = new StringsExample();
        String s3 ="SnehaSree";
        System.out.println("Lenghth is " +s3.length());
        System.out.println("character at position"+s3.charAt(6));
        System.out.println(stringsExample.method2("Sneha", "Sree"));
        System.out.println(stringsExample.method3(s3.indexOf('a',5)));
        System.out.println("Upper case"+s3.toUpperCase());
        System.out.println("Lower Case"+s3.toLowerCase());
        boolean b =s3.equals("SnehaSree");
        System.out.println(b);
        boolean b1= s3.equalsIgnoreCase("snehasree");
        System.out.println(b1);
        System.out.println(s3.trim());
        System.out.println("HashCode" +s3.hashCode());
        System.out.println(s3.replace("sneha","sne"));
        String s= StringsExample.method("Sneha");
        StringBuffer stringBuffer= new StringBuffer(s);
        StringBuilder stringBuilder = new StringBuilder(s);
        System.out.println( stringBuffer.reverse());
        System.out.println("String Buffera append" +
                stringBuffer.append("sree"));
        String sbr =stringBuffer.toString();
        System.out.println("String Builder Object to string" +sbr);
        char[] st =s.toCharArray();
        System.out.println("Char array:" +st.toString());

        int i=10;
        String.valueOf(i);


    }
}
