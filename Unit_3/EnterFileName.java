import java.io.*;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

class EnterFileName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter existing file name: ");
        String fileName = input.nextLine();
        File inputFile = new File(fileName);
        // Warn if file does not exist
        if (!Files.exists(inputFile.toPath())) {
            System.out.println("The file " + fileName + " does not exist.");
        }
        // Then warn if user does not have read permission
        else if (!Files.isReadable(inputFile.toPath())) {
            System.out.println("User does not have read permission on " + fileName + ".");
        }
        // If file exists and can be read by user, try to read it.
        // Other I/O errors may be possible, so try/catch needed, but such
        // errors are much less likely.
        else {
            try {
                List<String> lines = Files.readAllLines(inputFile.toPath());
                System.out.println(inputFile.getName() + " contains " + lines.size() + " lines.");
            } catch (IOException ex) {
                System.out.println("File error: " + ex.getMessage());
            }
        }
    }
}

// Output:

// When entering a file that does not exist:
// nonexistentfile.txt does not exist.

// When entering a file that exists but cannot be read (because permissions were
// changed with `chmod a-r wrongpermissions.txt`):
// User does not have read permission on wrongpermissions.txt.

// When entering a file that exists and can be read:
// poem.txt contains 4 lines.