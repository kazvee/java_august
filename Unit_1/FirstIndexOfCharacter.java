class FirstIndexOfCharacter {
  public static void main(String[] args) {
    String motto = "Java is fun!";
    // Find the index of the 1st occurrence of the !.
    // The index of the 1st occurrence is zero-based
    int index = motto.indexOf('!');
    System.out.println("The exclamation mark is at index " + index +
        ".");
    // The length of the String is the actual # of characters
    int length = motto.length();
    System.out.println("The String has a length of " + length);
  }
}
