import java.util.ArrayList;
import java.util.Collections;

class MethodChangeCollection {
  // This method does not return anything but still
  // changes the order of items in the ArrayList passed
  // to it.
  public static void sortArrayList(ArrayList<Integer> values) {
    Collections.sort(values);
  }

  public static void main(String[] args) {
    // ArrayList collection of Integer values
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(4);
    numbers.add(3);
    numbers.add(2);
    numbers.add(1);
    // Display array contents before method call
    System.out.println("Original ArrayList:");
    System.out.println(numbers.toString());
    // Call method
    sortArrayList(numbers);
    System.out.println("ArrayList after method call:");
    // Display array contents after method call
    System.out.println(numbers.toString());
  }
}
