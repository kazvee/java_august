import java.util.Arrays;

class FinalArray {
  public static void main(String[] args) {
    // Original array - declared final (constant)
    final int[] numbers = {1, 2, 3};
    System.out.println("Array contents: " + Arrays.toString(numbers));
    // Assign new values to individual elements
    numbers[0] = 4;
    numbers[1] = 5;
    numbers[2] = 6;
    System.out.println("New array contents: " + Arrays.toString(numbers));
  }
}