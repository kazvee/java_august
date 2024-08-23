import java.util.Scanner;

class LoopUntilDoneContinue {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
      System.out.print("Enter input or type done to end: ");
      String line = input.nextLine();
      if (line.charAt(0) == '#') {
        continue;
      }
      if (line.equalsIgnoreCase("done")) {
        break;
      }
      System.out.println(line);
    }
    System.out.println("Done!");

  }
}
