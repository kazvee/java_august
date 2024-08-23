class VarargsAverage {
  // The ... indicates that the method can take a variable
  // number of values as its parameter (in this case, doubles)
  public static double getAverage(double... values) {
    double sum = 0;
    int count = 0;
    // Use an enhanced for loop to iterate through values
    for (double number : values) {
      sum += number;
      count++;
    }
    return sum / count;
  }

  public static void main(String[] args) {
    double avg1 = getAverage(1.2, 3.3);
    System.out.println("avg1 = " + avg1);
    double avg2 = getAverage(1.2, 3.3, 4.5, 5.1);
    System.out.println("avg2 = " + avg2);
  }
}
