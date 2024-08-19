import java.util.Random;
import java.util.Scanner;

public class MentalismValidate {
  public static void main(String[] args) {
    Random randomGenerator = new Random();
    // final indicates that the value doesn't - indeed can't - change.
    // These are constants rather than variables.
    final int maxValue = 5;
    final int minValue = 1;
    int numberToGuess = randomGenerator.nextInt(5) + minValue;
    int numberToAdd = numberToGuess * 2;

    System.out.print("Hello. What is your name? ");
    Scanner keyboardInput = new Scanner(System.in);
    String name = keyboardInput.nextLine();
    System.out.print("Welcome, " + name + ", we'll perform some mind reading.\n");

    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.println("Multiply the number by 2.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.println("Now add " + numberToAdd);

    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.println("Now, divide the number by 2.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.println("Now, subtract the original number that you thought of.");
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.print("Well, " + name + " let me read your mind... ");
    System.out.println("The number that you have now is " + numberToGuess + ".");
    // Validation code
    System.out.print("Enter the number guessed between 1 and 10: ");
    int enteredNumber = keyboardInput.nextInt();
    // The following code is needed to remove leftover new line in input steam
    keyboardInput.nextLine();
    // Check result of multiplying user's number by 2
    int userNumber = enteredNumber * 2;
    System.out.println("Multiplied by 2 = " + userNumber);
    // Confirm result of adding
    userNumber = userNumber + numberToAdd;
    System.out.println("Plus " + numberToAdd + " = " + userNumber);
    // Check the result of division by 2
    userNumber = userNumber / 2;
    System.out.println("Divided by 2 = " + userNumber);
    // Confirm difference produced by final subtraction
    userNumber = userNumber - enteredNumber;
    System.out.println("Minus " + "original number (" + enteredNumber + ") = " +
        userNumber);
  }
}