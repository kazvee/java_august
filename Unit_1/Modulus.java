public class Modulus {
  public static void main(String[] args) {
    int two = 2;
    int three = 3;
    int four = 4;
    System.out.println("Modulus Examples: ");
    int modulus = three % two;
    // The + is for concatenation not addition
    System.out.println("\t3 % 2 = " + modulus);
    modulus = four % two;
    System.out.println("\t4 % 2 = " + modulus);
    modulus = two % three;
    System.out.println("\t2 % 3 = " + modulus);
  }
}
