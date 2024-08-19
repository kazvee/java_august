import java.util.Scanner;

class PetsArray {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] petList = { "dog", "cat", "fish" };
    System.out.println("Select a pet: ");
    System.out.println("1. " + petList[0]);
    System.out.println("2. " + petList[1]);
    System.out.println("3. " + petList[2]);
    System.out.print("Enter selection #: ");
    // Declare the variable choice before try block so it can
    // be used later in the program.
    int choice = 0;
    try {
      choice = input.nextInt();
    } catch (Exception ex) { // If user doesn't enter a number
      System.out.println("That is not a number.");
    }
    // Subtract 1 from choice
    choice--;
    // try to access element in array
    try {
      System.out.println("You selected a " + petList[choice]);
    } catch (ArrayIndexOutOfBoundsException ex) { // Number out of range
      System.out.println("Not a valid selection.");
    }
  }
}