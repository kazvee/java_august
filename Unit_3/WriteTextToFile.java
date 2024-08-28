import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class WriteTextToFile {
    public static void main(String[] args) {
        // Create ArrayList of Strings & add lines of text
        ArrayList<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        lines.add("Line 3");
        // File object pointing to output.txt file (which may not exist yet)
        File outputFile = new File("output.txt");
        try {
            // StandardOpenOption.CREATE creates a new file.
            // It will create the file if it doesn't exist or overwrite it if it does.
            Files.write(outputFile.toPath(), lines, StandardOpenOption.CREATE);
        } catch (IOException ex) {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }
}

// Output.txt file will contain 3 lines:
// Line 1
// Line 2
// Line 3