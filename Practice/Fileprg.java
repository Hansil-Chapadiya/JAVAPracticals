import java.io.*;
public class Fileprg {
    public static void main(String[] args) {
        boolean b=false;
        try {
            File f = new File("MH1.txt");
            b = f.createNewFile();
            FileOutputStream fout = new FileOutputStream(f);
            try {
                byte b1[] = ("Hansil The Great").getBytes(); 
                fout.write(b1);
            } catch (IOException e) {
                // TODO: handle exception
            }
            try {
                int i;
                FileReader fin = new FileReader("CreatingFile.txt");
                while ((i = fin.read())!= -1) {
                    System.out.println((char)i);
                }
            } catch (IOException ee) {
                System.out.println(ee.getMessage());
            }

            
        } catch (IOException e) {
            // TODO: handle exception
        }
        System.out.println(b);
    }
    
}
