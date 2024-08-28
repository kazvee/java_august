import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbers {
    public static void main(String[] args) {
        File yearsFile = new File("years.txt");
        ArrayList<Integer> years = new ArrayList<>();
        try {
            List<String> yearsAsStrings = Files.readAllLines(yearsFile.toPath());
            for (String yearString : yearsAsStrings) {
                years.add(Integer.parseInt(yearString));
            }
        } catch (IOException ex) {
            System.out.println("Error reading file: " + ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Number format error: " + ex.getMessage());
        }
        System.out.println(years.toString());
    }
}

// Output from years.txt:
// [1970, 1982, 1999]