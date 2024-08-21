import java.util.Scanner;

class DoWhile {
  public static void main(String[] args) {
    System.out.println("This program keeps prompting the user to enter numbers ");
    System.out.println("as long as the entries are even. When the user enters an ");
    System.out.println("odd number, the program will terminate.\n");
    Scanner input = new Scanner(System.in);
    // number not initialized since it will get a value in the body of the loop
    int number;
    do {
      System.out.print("Enter a whole number: ");
      number = input.nextInt();
    } while (number % 2 == 0);

    System.out.println("The loop is done.");
  }
}
