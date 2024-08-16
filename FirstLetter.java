class FirstLetter {
  public static void main(String[] args) {
    String name = "Tina";
    /*
     * The charAt() method takes a parameter indicating the
     * position at which to get the character. Passing 0 as
     * the argument gets the first character in the String.
     */
    char firstLetter = name.charAt(0);
    System.out.println("The first letter in " + name +
        " is " + firstLetter + ".");
  }
}
