import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class FileExample {
    public static void main(String[] args) {
        File poemFile = new File("poem.txt");

        // Print file information
        System.out.println("File Information: ");
        System.out.println("File Name: " + poemFile.getName());
        System.out.println("File Path: " + poemFile.getPath());
        System.out.println("Full Path: " + poemFile.getAbsolutePath());
        System.out.println("File Size: " + poemFile.length());
        System.out.println("Can Read: " + poemFile.canRead());
        System.out.println("Can Write: " + poemFile.canWrite());
        System.out.println("Can Execute: " + poemFile.canExecute());

        int lineCount = 0;

        try {
            // Scanner can read from File
            Scanner fileScanner = new Scanner(poemFile);

            // Count the number of lines in the file
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine(); // Read line (not used)
                lineCount++;
            }

            // Must close Scanner when done
            fileScanner.close();
            System.out.println("Line count: " + lineCount);
        } catch (FileNotFoundException ex) {
            System.out.println("Error accessing file: " + ex.getMessage());
        }

        try {
            // Files.readAllLines() reads entire file & puts lines in the List<String>
            List<String> lines = Files.readAllLines(poemFile.toPath());
            System.out.println("File Contents: ");
            // Loop through the list and print out the lines
            for (String line : lines) {
                System.out.println(line);
            }
        }
        // If Files.readAllLines() can't find or read file, it throws an IOException
        catch (IOException ex) {
            System.out.println("Error accessing file: " + ex.getMessage());
        }
    }
}
