import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputOutputStream {
    public static void main(String[] args) {
        try {
            FileInputStream file1 = new FileInputStream("./ReadFile.txt");
            FileOutputStream file2 = new FileOutputStream("./File2.txt");
            // file1.transferTo(file2);
            int content;
            while ((content = file1.read()) != -1) {
                System.out.println((char)content);
            }
            file1.close();
            file2.close();
        } catch(FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
