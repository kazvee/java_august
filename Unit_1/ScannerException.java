import java.util.Scanner;

class ScannerException {
  /*
   * This program asks the user to enter his or her age & then
   * prints the entry back out.
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your age in years: ");
    int age = 0;
    try {
      age = input.nextInt();
      // Next line only executes if call to nextInt() works correctly
      System.out.println("You are " + age + " years old.");
    } catch (Exception ex) {
      System.out.println("You did not enter a valid integer.");
      System.out.println("Please run again & enter a valid age.");
    }
  }
}