/* Description: This program has 2 methods to find the maximum value of 3 numbers.
 Example of usage: maxOfThree(20, 30, -10)
 Result: method returns 30 */

public class Max {

  /*
   * Method: maxOfTwo
   * Purpose: This method accepts two numbers, compares them
   * and returns the value that is larger.
   */
  public static int maxOfTwo(int firstNumber, int secondNumber) {
    if (firstNumber > secondNumber) {
      return firstNumber;
    }
    return secondNumber;
  }

  /*
   * Method: maxOfThree
   * Purpose: This method accepts three numbers, sends second and third
   * number to maxOfTwo. It then takes the result of that comparison to
   * send the first number and the result to get the larger value
   * of all three.
   */
  public static int maxOfThree(int firstNumber, int secondNumber, int thirdNumber) {
    return maxOfTwo(firstNumber, maxOfTwo(secondNumber, thirdNumber));
  }

  // Test of maxOfThree() method
  public static void main(String[] args) {
    System.out.println("Highest number is " + maxOfThree(20, 30, -10) + ".");
  }
}