import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/*
 * public class CreatingFile {
 * public static boolean b = false;
 * 
 * public static void main(String[] args) {
 * try {
 * File f1 = new File("CreatingFile.txt");
 * b = f1.createNewFile();
 * System.out.println(b);
 * try {
 * FileOutputStream fout = new FileOutputStream("CreatingFile.txt");
 * String s1 = "Hello The Great Hansil";
 * byte b1[] = s1.getBytes();
 * fout.write(b1);
 * f1.delete();
 * } catch (IOException ee) {
 * System.out.println(ee.getMessage());
 * }
 * } catch (IOException ee) {
 * System.out.println(ee.getMessage());
 * }
 * }
 * }
 */
public class CreatingFile {
    public static void main(String[] args) {
        try {
            int i;
            FileReader fin = new FileReader("CreatingFile.txt");
            while ((i = fin.read())!= -1) {
                System.out.println((char)i);
            }
        } catch (IOException ee) {
            System.out.println(ee.getMessage());
        }
    }
}
