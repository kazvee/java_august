import java.util.ArrayList;
import java.util.Scanner;

class ArrayListIndexRange {
  public static void main(String[] args) {
    ArrayList<String> choices = new ArrayList<>();
    // Add as many choices as needed, ArrayList grows to fit.
    choices.add("coffee");
    choices.add("tea");
    choices.add("water");
    System.out.println("1. " + choices.get(0));
    System.out.println("2. " + choices.get(1));
    System.out.println("3. " + choices.get(2));

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a selection #: ");
    int selection = input.nextInt();
    // Subtract 1 from menu choice to get index
    int index = selection - 1;
    if (index >= 0 && index < choices.size()) {
      System.out.println("You selected " + choices.get(selection - 1) + ".");
    } else {
      System.out.println("Not a valid selection");
    }
  }
}