package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by lovel on 04-Jan-19.
 */
public class ToWriteIntoaFile {
    public static void main(String args[]) throws IOException {
        FileOutputStream fileOutputStream= new FileOutputStream("E:\\Sneha.txt");
        byte b[]={1,2,3,4};
        fileOutputStream.write('s');
        fileOutputStream.write('n');
        fileOutputStream.write(b);

        System.out.println(fileOutputStream.toString());
    }
}
