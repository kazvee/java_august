import java.util.Scanner;

class AppendWhile {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String textToAdd = "";
    String text = "";

    // Can't use == to check for equality of Strings. Need to use
    // the equals() or equalsIgnoreCase() to compare Strings.
    // Remember that ! means "not"
    while (!textToAdd.equalsIgnoreCase("quit")) {
      System.out.print("Enter a string, enter quit to exit the loop: ");
      textToAdd = input.nextLine();
      // Append input to text with space after it.
      text += textToAdd + " ";
    }
    System.out.println("\n" + text);
  }
}
