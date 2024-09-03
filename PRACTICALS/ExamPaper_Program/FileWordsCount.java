import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWordsCount {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java FileWordsCount <filename>");
            return;
        }

        try {
            char[] ch = {'a', ' ', 'b', ' ', 'd'};
            File file = new File(args[0]);
            FileOutputStream fileWrite = new FileOutputStream(file);
            for (char c : ch) {
                fileWrite.write(c);
            }
            fileWrite.close();

            FileInputStream fileInput = new FileInputStream(file);
            StringBuilder fileContent = new StringBuilder();
            int character;
            while ((character = fileInput.read()) != -1) {
                fileContent.append((char) character);
            }
            fileInput.close();

            System.out.println("File content: " + fileContent.toString());

            // Count words
            String[] words = fileContent.toString().split("\\s+");
            int wordCount = words.length;
            System.out.println("Number of words (without counting spaces): " + wordCount);

        } catch (FileNotFoundException fe) {
            System.out.println("File not found: " + fe.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
