class NestedLoops {
  public static void main(String[] args) {
    int[][] numbers = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    // Outer loop iterates over rows
    for (int row = 0; row < numbers.length; row++) {
      // Inner loop iterates over columns in each row
      for (int col = 0; col < numbers[row].length; col++) {
        /*
         * (row + 1) displays row # starting with 1 rather than 0.
         * (col + 1) displays column # starting with 1 rather than 0.
         * Parentheses needed so expression is evaluated before printing.
         * These expressions do not change the values of row and col so
         * array access works as expected.
         */
        System.out.println("Row: " + (row + 1) + " Col: " + (col + 1) +
            " = " + numbers[row][col]);
      }
    }
  }
}
