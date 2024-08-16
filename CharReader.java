import java.util.Scanner;

class CharReader {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    // There shouldn't be a space, so use next()
    String stringInput = input.next();
    // 1st & only char is at index/position 0
    char singleChar = stringInput.charAt(0);
    System.out.println("You entered " + singleChar + ".");
  }
}
