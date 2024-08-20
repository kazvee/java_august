import java.util.Arrays;

class ArraySort {
  public static void main(String[] args) {
    // Declare and initialize array with values
    int[] scores = { 77, 89, 100, 68, 95 };
    // System.out.println("Incorrect way to print: " + scores);
    System.out.println("Scores: " + Arrays.toString(scores));
    Arrays.sort(scores);
    System.out.println("Sorted Scores: " + Arrays.toString(scores));
    // Use the length property (or attribute) to get size of array
    int size = scores.length;
    System.out.println("Array Size: " + size);
    // Element 0 contains the lowest value
    System.out.println("Lowest Score: " + scores[0]);
    // Last index is 1 less than the size
    int lastIndex = size - 1;
    System.out.println("Highest Score: " + scores[lastIndex]);
  }
}