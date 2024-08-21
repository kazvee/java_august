import java.util.Scanner;

class WhileLoop {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("This loop will run as long as the input is > 0.");
    // Initialize loop variable so the loop will run (> 0)
    int entry = 1;
    while (entry > 0) {
      System.out.print("Enter a number (0 or less to quit): ");
      entry = input.nextInt();
    }
    System.out.println("=== End of Loop ===\n");
  }
}
