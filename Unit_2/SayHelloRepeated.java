public class SayHelloRepeated {
  static String sayHello(String name, int count) {
    // Local variable to assemble greeting
    String greeting = "";
    for (int i = 0; i < count; i++) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    String userName = "Sacha";
    // Pass variable userName as parameter to sayHello()
    String greetingOutput = sayHello(userName, 3);
    // Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}
