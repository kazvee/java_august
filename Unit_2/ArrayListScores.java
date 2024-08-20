import java.util.ArrayList;
import java.util.Collections;

class ArrayListScores {
  public static void main(String[] args) {
    // Construct an ArrayList named scores to hold Integer values
    ArrayList<Integer> scores = new ArrayList<>();
    // Add some scores
    scores.add(99);
    scores.add(88);
    scores.add(100);
    scores.add(85);
    System.out.println("First score: " + scores.get(0));
    int listLength = scores.size();
    System.out.println("Last score: " + scores.get(listLength - 1));
    Collections.sort(scores);
    System.out.println("Lowest score: " + scores.get(0));
    System.out.println("Highest score: " + scores.get(listLength - 1));
  }
}