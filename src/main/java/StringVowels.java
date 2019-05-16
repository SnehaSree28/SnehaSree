import org.testng.annotations.Test;

/**
 * Created by lovel on 26-Sep-18.
 */
public class StringVowels {
     static int count(String str){
        int count=0;
        for(int i=0;i < str.length(); i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='o' ||str.charAt(i)=='i'|| str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
  @Test
    public void test(){

         System.out.println(StringVowels.count("Sneha Sree"));
  }
}
