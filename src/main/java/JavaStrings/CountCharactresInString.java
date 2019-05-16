package JavaStrings;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * Created by lovel on 04-Feb-19.
 */
public class CountCharactresInString {
@Test
    public void charcterCount(){

    String str="www.facebook.com/snehasree";

    HashMap<Character,Integer> charCountMap=new HashMap<Character,Integer>();
    char[] chars = str.toCharArray();

    for(char c: chars){
        if(charCountMap.containsKey(c)){
            charCountMap.put(c,charCountMap.get(c)+1);
        }
        else{
            charCountMap.put(c,1);
        }
    }
    System.out.println(charCountMap);
}
}
