class StringConcat {
  public static void main(String[] args) {
    String firstWord = "Hello, ";
    String greeting = firstWord.concat("world!");
    // Note how .concat() can be called on a literal String value
    String question = "How are ".concat("you?");
    System.out.println(greeting);
    System.out.println(question);
    char letter = 'A';
    // This line will not display A5
    System.out.println(letter + 5);
    // This line will not display A+
    System.out.println(letter + '+');
    // This line will display A5
    System.out.println("" + letter + 5);
    // This line will display A+
    System.out.println("" + letter + '+');

  }
}
