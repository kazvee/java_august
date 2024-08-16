import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 2 or more words separated by spaces: ");
    String inputRead = input.nextLine();
    System.out.println("Input read by nextLine(): " + inputRead);
  }
}
