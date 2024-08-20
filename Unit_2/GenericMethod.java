import java.util.Arrays;

public class GenericMethod {

  // The angle brackets <> indicate a generic method.
  // T is a type variable that stands for the data type. The method
  // returns a value of the same data type as the data type for the array.
  public static <T> T getMidPointItem(T[] array) {
    // division of an int by an int results in an int quotient - no decimal.
    // Returns array element at index length / 2.
    return array[array.length / 2];
  }

  public static void main(String[] args) {
    String[] names = { "Ann", "George", "Kim", "Pat", "Steve" };
    String midPointName = getMidPointItem(names);
    System.out.print("The middle item in the array " + Arrays.toString(names));
    System.out.println(" is " + midPointName + ".");

    // Instead of primitive type char, use Character - note capital C
    Character[] letters = { 'a', 'b', 'c' };
    char midPointLetter = getMidPointItem(letters);
    System.out.print("The middle item in the array " + Arrays.toString(letters));
    System.out.println(" is " + midPointLetter + ".");

    // Instead of primitive type int use Integer - note capital I
    Integer[] agesInYears = { 27, 33, 33, 39, 40, 40, 42, 45 };
    int midPointAge = getMidPointItem(agesInYears);
    System.out.print("The middle item in the array " +
        Arrays.toString(agesInYears));
    System.out.println(" is " + midPointAge + ".");

    // Instead of primitive type double use Double - note capital D
    Double[] temperatures = { 10.0, 21.5, 22.3, 25.0, 31.85, 35.99 };
    double midPointTemp = getMidPointItem(temperatures);
    System.out.print("The middle item in the array " +
        Arrays.toString(temperatures));
    System.out.println(" is " + midPointTemp + ".");
  }
}