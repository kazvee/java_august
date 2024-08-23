import java.util.Arrays;

class MethodChangeArray {
  // This method does not return anything but still
  // changes the order of items in the array passed
  // to it.
  public static void sortArray(int[] values) {
    Arrays.sort(values);
  }

  public static void main(String[] args) {
    int[] numbers = { 5, 4, 3, 2, 1 };
    // Display array contents before method call
    System.out.println("Original array:");
    System.out.println(Arrays.toString(numbers));
    // Call method
    sortArray(numbers);
    System.out.println("Array after method call:");
    // Display array contents after method call
    System.out.println(Arrays.toString(numbers));
  }
}