import java.util.Scanner;

class LoopUntilDone {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter input or type done to end: ");
      String line = input.nextLine();
      // Check if line is "done" (ignoring case)
      if (line.equalsIgnoreCase("done")) {
        break; // end loop when done has been entered
      } else {
        // Print out entry is not equal to "done"
        System.out.println(line);
      }
    }
    System.out.println("Done!");
  }
}
