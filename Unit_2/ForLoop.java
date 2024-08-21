class ForLoop {
  public static void main(String[] args) {
    System.out.println("This for loop will count to 5: ");
    /*
     * The loop variable, count, starts with a value of 1.
     * The loop keeps running as long as count <= 5.
     * After each iteration - before returning to the top of the loop
     * count is incremented by 1.
     */
    for (int count = 1; count <= 5; count++) {
      System.out.println(count);
    }
    System.out.println("The loop is done.");
  }
}
