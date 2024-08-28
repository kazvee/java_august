import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScannerExample {
    public static void main(String[] args) {
        // Scanner can read from File pointing to file
        File poemFile = new File("poem.txt");
        int lineCount = 0;

        try {
            // Throws FileNotFoundException if file not found
            Scanner fileScanner = new Scanner(poemFile);
            // while loop runs as long another line is available
            while (fileScanner.hasNextLine()) {
                // Read line as String
                String line = fileScanner.nextLine();
                lineCount++;
            }
            // Must close Scanner when reading from a file.
            fileScanner.close();
            System.out.println("Line count: " + lineCount);
        } catch (FileNotFoundException ex) {
            System.out.println("Error accessing file: " + ex.getMessage());
        }
    }
}
