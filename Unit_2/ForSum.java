import java.util.Arrays;

class ForSum {
  public static void main(String[] args) {
    int[] numbers = { 3, 41, 12, 9, 74, 15 };
    // Sum initialized to 0
    int sum = 0;
    // Loop variable starts at 0, since the first element index in array is 0.
    // Remember that last index is 1 less than length of array.
    for (int index = 0; index < numbers.length; index++) {
      sum += numbers[index];
    }
    // Display result
    System.out.print("The sum of the values in the array ");
    System.out.print(Arrays.toString(numbers));
    System.out.println(" = " + sum + ".");
  }
}
