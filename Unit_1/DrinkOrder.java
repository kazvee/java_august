import java.util.Scanner;

public class DrinkOrder {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What type of drink would you like to order?");
    // Note use of new line \n to print 3 lines with 1 statement.
    System.out.println("1. Water\n2. Coffee\n3. Tea");
    System.out.print("Drink selection #: ");
    // String variable to hold drink details
    String drinkDetails = "No drink chosen.";
    int choice = input.nextInt();
    // Remove \n left in input to avoid problems with later inputs
    input.nextLine();
    if (choice == 1) {
      drinkDetails = "Water";
      System.out.println("Would you like that 1) hot or 2) cold?");
      System.out.print("Enter temperature selection #: ");
      choice = input.nextInt();
      // Remove new line left in input stream to avoid problems with later inputs
      input.nextLine();
      if (choice == 1) {
        drinkDetails += ", hot";
      } else if (choice == 2) {
        drinkDetails += ", cold";
        System.out.print("Would you like ice? (Y/N) ");
        // Read input as a String
        String response = input.nextLine();
        // Extract 1st char
        char yesNo = response.charAt(0);
        // Y or y is yes, anything else interpreted as no
        if (yesNo == 'Y' || yesNo == 'y') {
          drinkDetails += ", with ice";
        }
      } else {
        System.out.println("Not a valid temperature selection.");
      }
    } else if (choice == 2) {
      drinkDetails = "Coffee";
      System.out.print("Would you like decaf? (Y/N): ");
      String decafResponse = input.nextLine();
      char decafYesNo = decafResponse.charAt(0);
      if (decafYesNo == 'Y' || decafYesNo == 'y') {
        drinkDetails += ", decaf";
      }
      System.out.println("Would you like 1) milk, 2) cream, or 3) none?");
      System.out.print("Enter choice #: ");
      int milkCreamChoice = input.nextInt();
      // Remove new line left in input stream to avoid problems with later inputs
      input.nextLine();
      if (milkCreamChoice == 1) {
        drinkDetails += ", milk";
      } else if (milkCreamChoice == 2) {
        drinkDetails += ", cream";
      }
      System.out.print("Would you like sugar? (Y/N): ");
      String sugarResponse = input.nextLine();
      char sugar = sugarResponse.charAt(0);
      if (sugar == 'Y' || sugar == 'y') {
        drinkDetails += ", sugar";
      }
    } else if (choice == 3) {
      drinkDetails = "Tea";
      System.out.print("Type of tea: 1) Black or 2) Green: ");
      int teaChoice = input.nextInt();
      // Remove \n left in input to avoid problems with later inputs
      input.nextLine();
      if (teaChoice == 1) {
        drinkDetails += ", black";
      } else if (teaChoice == 2) {
        drinkDetails += ", green";
      } else {
        // Invalid selection - assume black tea
        drinkDetails += ", black";
        System.out.println("Not a valid choice. Assuming black tea.");
      }
    } else {
      System.out.println("Sorry, not a valid drink selection.");
    }

    // Print out final drink selection
    System.out.println("Your drink selection: " + drinkDetails + ".");
  }
}