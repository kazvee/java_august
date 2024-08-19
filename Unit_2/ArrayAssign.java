class ArrayAssign {
  public static void main(String[] args) {
    String[] petList = { "dog", "cat", "fish" };
    System.out.print("Original array: ");
    System.out.println(petList[0] + ", " + petList[1] + ", " + petList[2]);
    petList[1] = "hamster";
    System.out.print("Modified array: ");
    System.out.println(petList[0] + ", " + petList[1] + ", " + petList[2]);
  }
}