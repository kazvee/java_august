import java.util.Arrays;

class NumbersArraySort {
  public static void main(String[] args) {
    int[] numArray = { 24, 45, 39, 17, 61, 58 };
    System.out.println("Original array: " + Arrays.toString(numArray));
    Arrays.sort(numArray);
    System.out.println("Sorted array: " + Arrays.toString(numArray));
  }
}