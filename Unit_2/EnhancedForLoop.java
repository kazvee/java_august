import java.util.Arrays;

class EnhancedForLoop {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 5 };
    System.out.println("Values in array: " + Arrays.toString(numbers));
    for (int number : numbers) {
      /* value can be used in statements in loop body */
      System.out.println(number + " * 2 = " + number * 2);
    }
  }
}
