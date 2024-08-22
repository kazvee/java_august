import java.util.ArrayList;

class EnhancedForCollectionArrayList {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Annette");
    names.add("John");
    names.add("Lee");
    System.out.println("ArrayList: " + names.toString());
    for (String name : names) {
      System.out.println(name + " has " + name.length() + " letters.");
    }
  }
}
