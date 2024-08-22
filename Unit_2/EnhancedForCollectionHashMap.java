import java.util.HashMap;

public class EnhancedForCollectionHashMap {
  public static void main(String[] args) {
    // HashMap holds key-value pairs.
    // The key (user ID) is a String (case sensitive).
    // The value (score) is an Integer (int)
    HashMap<String, Integer> scores = new HashMap<>();
    scores.put("ssmith04", 88);
    scores.put("tlang01", 100);
    scores.put("glewis03", 99);
    System.out.println("HashMap: " + scores.toString());
    /*
     * A HashMap isn't iterable, but the keySet() method returns
     * a Set with the keys in the HashMap, which can be interated
     * over. The value can be retrieved using the key value
     */
    for (var key : scores.keySet()) {
      // For each key retrieve the value (score) & print
      System.out.println(key + " has a score of " + scores.get(key) + ".");
    }
  }
}