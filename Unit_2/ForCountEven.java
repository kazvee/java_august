import java.util.Arrays;

class ForCountEven {
  public static void main(String[] args) {
    int[] numbers = { 3, 41, 12, 9, 74, 15 };
    // Counter initialized to 0
    int evenCount = 0;
    // Loop variable starts at 0, since first element index in array is 0.
    // Remember the last index is 1 less than length of array.
    for (int index = 0; index < numbers.length; index++) {
      if (numbers[index] % 2 == 0) {
        evenCount++;
      }
    }
    // Display result
    System.out.print("The array " + Arrays.toString(numbers) + " ");
    System.out.println("contains " + evenCount + " even values.");
  }
}
