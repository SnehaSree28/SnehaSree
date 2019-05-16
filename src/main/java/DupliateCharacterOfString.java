import org.testng.annotations.Test;

/**
 * Created by lovel on 27-Sep-18.
 */
public class DupliateCharacterOfString {
    @Test
    public void test() {
       /* String str = "SnehaS Sree";
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }

            }

        }*/
        int count = count("SnehaS Sree");
        System.out.println("No of Suplicate Charcters are" +count);

    }

    static int count(String str) {
        int cnt = 0;
        char[] inp = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (inp[i] == inp[j]) {
                    System.out.println(inp[j]);
                    cnt++;
                    break;
                }

            }

       }
        return cnt;
    }
}
