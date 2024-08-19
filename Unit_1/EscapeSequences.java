public class EscapeSequences {
  public static void main(String[] args) {
    char firstLetter = 'A';
    char lastLetter = 'Z';
    char newLine = '\n';
    /*
     * System.out.print() doesn't automatically add
     * a new line character at the end the way that
     * System.out.println() does.
     */
    System.out.print(firstLetter);
    System.out.print(newLine); // Output new line
    System.out.print(lastLetter);
    System.out.print(newLine); // Output new line
    System.out.println("The computer said, \"Hello!\"");
    System.out.print(firstLetter);
    System.out.print('\t'); // Output tab
    System.out.print(lastLetter);
    System.out.print(newLine); // Output new line

  }
}
