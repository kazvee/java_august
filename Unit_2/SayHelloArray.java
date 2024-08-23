public class SayHelloArray {
  // Pass array of names to method
  static String sayHello(String[] names) {
    // Local variable to assemble greeting
    String greeting = "";
    for (String name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    String[] userNames = { "Sacha", "Sandra", "Sarah" };
    // Pass variable userNames as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    // Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}
