import java.util.Arrays;

class BinarySearch {
  public static void main(String[] args) {
    int[] scores = { 77, 89, 100, 68, 95 };
    int searchValue = 100;
    Arrays.sort(scores);
    System.out.println("Sorted Array: " + Arrays.toString(scores));
    int location = Arrays.binarySearch(scores, searchValue);
    if (location > -1) {
      System.out.println(searchValue + " found.");
    } else {
      System.out.println(searchValue + " not found.");
    }
  }
}