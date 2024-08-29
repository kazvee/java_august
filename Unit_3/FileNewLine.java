import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileNewLine {
    public static void main(String[] args) {
        File flowerFile = new File("flowers.txt");
        try {
            Files.writeString(flowerFile.toPath(), "Roses are red\n", StandardOpenOption.CREATE);
            Files.writeString(flowerFile.toPath(), "Violets are blue\n", StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
