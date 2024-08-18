import java.util.Scanner;

class Hungry {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char hungry;
    char healthy;
    System.out.print("Are you hungry? (Y/N): ");
    String response = input.nextLine();
    hungry = response.charAt(0);
    if (hungry == 'n' || hungry == 'N') {
      System.out.println("Not hungry.");
    } else {
      System.out.print("Do you want a healthy meal? (Y/N): ");
      response = input.nextLine();
      healthy = response.charAt(0);
      if (healthy == 'n' || healthy == 'N') {
        System.out.println("Getting some junk food.");
      } else {
        System.out.println("Getting a healthy meal.");
      }
    }
  }
}