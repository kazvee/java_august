import java.io.*;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;

public class WriteNumbersToFile {
    public static void main(String[] args) {
        ArrayList<Integer> years = new ArrayList<>();
        years.add(1970);
        years.add(1982);
        years.add(1999);
        File numbersOutput = new File("years.txt");
        // Iterate over ArrayList of years
        for (int year : years) {
            try {
                // Use Integer.toString() to convert years to strings.
                // Need to convert years one at a time, so they have to be
                // written one at a time using Files.writeString(). Add \n after each
                Files.writeString(numbersOutput.toPath(), Integer.toString(year) + "\n",
                        StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}

// years.txt will contain:
// 1970
// 1982
// 1999