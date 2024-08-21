import java.util.Scanner;

class WhileEven {
  public static void main(String[] args) {
    System.out.println("This program keeps prompting the user to enter numbers ");
    System.out.println("as long as the entries are even. When the user enters an ");
    System.out.println("odd number.\n");
    Scanner input = new Scanner(System.in);

    int number = 0;
    while (number % 2 == 0) {
      System.out.print("Enter a whole number: ");
      number = input.nextInt();
    }
    System.out.println("The loop is done.");
  }
}