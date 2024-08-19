import java.util.Arrays;

class ChangeWholeArray {
  public static void main(String[] args) {
    // Original array
    int[] numbers = { 1, 2, 3 };
    System.out.println("Array contents: " + Arrays.toString(numbers));
    // Assign whole new array using new and =
    numbers = new int[] { 4, 5, 6 };
    System.out.println("New array contents: " + Arrays.toString(numbers));
  }
}