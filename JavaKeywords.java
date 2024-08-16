import java.util.Arrays;

public class JavaKeywords {
  public static void main(String[] args) {
    String keywords = "abstract continue for new switch assert default goto package synchronized boolean do if private this break double implements protected throw byte else import public throws case enum instanceof return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while";

    // Split the keywords into an array
    String[] keywordArray = keywords.split(" ");

    // Sort the array alphabetically
    Arrays.sort(keywordArray);

    // Print sorted keywords
    System.out.println(String.join(" ", keywordArray));
  }
}
