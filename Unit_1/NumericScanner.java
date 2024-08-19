import java.util.Scanner;

class NumericScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a whole number: ");
    int wholeNumber = input.nextInt();
    System.out.println("You entered " + wholeNumber + ".");
  }
}
