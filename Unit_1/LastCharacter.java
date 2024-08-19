class LastCharacter {
  public static void main(String[] args) {
    String text = "The quick brown fox jumps over the lazy dog";
    int length = text.length();
    int lastIndex = length - 1;
    char lastCharacter = text.charAt(lastIndex);
    System.out.println("Text: " + text);
    System.out.println("Last Character: " + lastCharacter);
  }
}