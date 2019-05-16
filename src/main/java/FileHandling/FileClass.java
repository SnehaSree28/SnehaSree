package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by lovel on 04-Jan-19.
 */
public class FileClass
{
    public static void main(String args[]){
        File f = new File("E:\\Sneha.txt");
        try {
            System.out.println(f.exists());//To check the file exists or not
            FileInputStream fileInputStream = new FileInputStream(f);// To read the file line by line we should use file input stream class

            int read = fileInputStream.read();
            while (read!=-1){
                System.out.println((char)read);
                read=fileInputStream.read();
            }

            fileInputStream.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
