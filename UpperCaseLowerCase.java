class UpperCaseLowerCase {
  public static void main(String[] args) {
    String statement = "I am yelling!";
    String yelling = statement.toUpperCase();
    System.out.println(yelling);
    // Re-use the statement variable, no data type specified
    statement = "BE QUIET, PLEASE";
    // Overwrite uppercase with lowercase version
    statement = statement.toLowerCase();
    System.out.println(statement);
  }
}
