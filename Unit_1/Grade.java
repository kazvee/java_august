import java.util.Scanner;

public class Grade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your exam score (0 - 100): ");
    int score = input.nextInt();
    // && is logical/Boolean AND
    if (score >= 90 && score <= 100) {
      System.out.println("You got an A. Congratulations!");
    } else if (score >= 80 && score < 90) {
      System.out.println("You got a B. Well done!");
    } else if (score >= 70 && score < 80) {
      System.out.println("You got a C.");
    } else {
      System.out.println("You did not pass the exam.");
    }
  }
}
