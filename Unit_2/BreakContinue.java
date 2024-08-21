import java.util.Scanner;

class BreakContinue {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String textToAdd = "";
    String text = "";

    // Can't use == to check for equality of Strings. Need to use
    // the equals() or equalsIgnoreCase() to compare Strings.
    // Remember that ! means "not"
    // If the user enters a word longer than 4 letters, the loop ends.
    while (!textToAdd.equalsIgnoreCase("quit")) {
      System.out.println("Enter a string or enter quit. A word of more than 4 letters will be ignored: ");
      textToAdd = input.nextLine();
      if (textToAdd.length() > 4) {
        continue;
      }
      if (textToAdd.equalsIgnoreCase("quit")) {
        break;
      }
      // Append input to text with space after it.
      text += textToAdd + " ";
    }
    System.out.println("\n" + text);
  }
}
