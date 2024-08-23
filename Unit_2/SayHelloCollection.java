import java.util.ArrayList;

public class SayHelloCollection {
  // Pass ArrayList of names to method
  // Remember that collections are generic. T is placeholder
  // for the data type
  static <T> String sayHello(ArrayList<T> names) {
    // Local variable to assemble greeting
    String greeting = "";
    // T is the data type
    for (T name : names) {
      greeting += "Hello, " + name + "\n";
    }
    return greeting;
  }

  public static void main(String[] args) {
    ArrayList<String> userNames = new ArrayList<>();
    userNames.add("Sacha");
    userNames.add("Sandra");
    userNames.add("Sarah");
    // Pass variable userNames as parameter to sayHello()
    String greetingOutput = sayHello(userNames);
    // Pass variable greetingOutput to as parameter println()
    System.out.println(greetingOutput);
  }
}
