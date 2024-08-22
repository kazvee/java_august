import java.util.HashSet;

class EnhancedForCollectionHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("HashSet: " + names.toString());
    for (String name : names) {
      System.out.println(name + " has " + name.length() + " letters.");
    }
  }
}
