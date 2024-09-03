import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * ReadFile
 */
public class ReadFile {

    public static void main(String[] args) throws FileNotFoundException {
        try{
            File f = new File("./ReadFile.txt");
            FileReader fr = new FileReader(f);
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.println((char)ch);
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
