import java.util.Scanner;

class CarSpeed {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter car's speed between 0 and 200: ");
    int speed = input.nextInt();

    if (speed > 100) {
      System.out.println("The car's speed is fast!");
    } else { // Speed not over 100
      // Nested selection statements apply
      if (speed < 100) {
        System.out.println("The car's speed is slow!");
      } else {
        System.out.println("The car's speed is exactly 100.");
      }
    }
  }
}