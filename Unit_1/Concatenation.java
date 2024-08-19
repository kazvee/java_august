public class Concatenation {
  public static void main(String[] args) {
    // Joining literal String values
    // Joining 3 pieces for demonstration purposes.
    // This wouldn't happen in real-world code.
    System.out.println("Hello" + ", " + "world! (1)");
    // Joining Strings in variables
    String hello = "Hello";
    String comma = ", "; // Note space
    String world = "world! (2)";
    System.out.println(hello + comma + world);
    // Instead of using System.out.println() we
    // could put in the new line \n.
    // Note that we can change a values.
    world = "world! (3)";
    System.out.print(hello + comma + world + '\n');
  }
}