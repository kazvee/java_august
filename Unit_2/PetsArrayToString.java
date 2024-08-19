import java.util.Arrays;

class PetsArrayToString {
  public static void main(String[] args) {
    String[] petList = { "dog", "kitten", "fish" };
    petList[1] = "kitten";
    System.out.println(petList); // Displays [Ljava.lang.String;@35a50a4c 
    System.out.println(Arrays.toString(petList));
  }
}