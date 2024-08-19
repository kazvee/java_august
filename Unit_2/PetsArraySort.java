import java.util.Arrays;

class PetsArraySort {
  public static void main(String[] args) {
    String[] petsArray = { "dog", "cat", "groundhog", "fish", "iguana", "emu", "hamster", "bird", "alpaca" };
    System.out.println("Original array: " + Arrays.toString(petsArray));
    Arrays.sort(petsArray);
    System.out.println("Sorted array: " + Arrays.toString(petsArray));
  }
}