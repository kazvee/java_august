import java.io.*;
import java.nio.*;
import java.nio.file.*;

public class AppendStringToFile {
    public static void main(String[] args) {
        File output = new File("output.append.txt");
        try {
            // Use both StandardOpenOption.CREATE and StandardOpenOption.APPEND
            // so that the file is created if it doesn't exist.
            // If the file already exists, text is appended.
            Files.writeString(output.toPath(), "Hello, world\n", StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}

// File output.append.txt will contain:
// Hello, world
// for each time the program is run