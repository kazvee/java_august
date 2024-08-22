class NestedEnhancedForLoops {
  public static void main(String[] args) {
    int[][] numbers = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    // Without counters in loops, need rowNumber, colNumber
    int rowNumber = 1;
    int colNumber = 1;
    // Outer loop iterates over rows. Each row is a single-dimensional array
    for (int[] row : numbers) {
      // Inner loop iterates over columns in each row
      for (int value : row) {
        // Note space between colNumber++ and following +
        // Remember that ++ is increment operator, + is concatenation operator
        System.out.println("Row: " + rowNumber + " Col: " + colNumber++ +
            " = " + value);
      }
      colNumber = 1; // Reset colNumber after down with columns in row
      rowNumber++; // increment rowNumber after done with row
    }
  }
}
