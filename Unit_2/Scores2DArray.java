class Scores2DArray {
  public static void main(String[] args) {
    // Array of 3 rows & 4 columns
    // 2 pairs of square brackets declare 2D array of int
    int[][] scores = new int[3][4];
    // Assign a 1D array to each row in the 2D array
    scores[0] = new int[] { 100, 92, 99, 85 };
    scores[1] = new int[] { 100, 95, 88, 91 };
    scores[2] = new int[] { 99, 100, 100, 100 };
    // Print out just the element in the first row,
    // third column as int. No toString() needed.
    System.out.println("1st student, 3rd score: " + scores[0][2]);
  }
}
