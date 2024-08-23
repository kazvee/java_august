import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeLoop {
  public static void main(String[] args) {
    String[][] board = { { " - ", " - ", " - " },
        { " - ", " - ", " - " },
        { " - ", " - ", " - " } };

    System.out.println("\t" + Arrays.toString(board[0]));
    System.out.println("\t" + Arrays.toString(board[1]));
    System.out.println("\t" + Arrays.toString(board[2]) + "\n");

    Scanner input = new Scanner(System.in);
    // Initialize col & row so that the input validation works
    int col = 0;
    int row = 0;
    // Variable to keep track of current player
    char player;

    // for loop to provide total of 9 turns
    for (int turn = 0; turn < 9; turn++) {
      // If an even turn number, player is X
      if (turn % 2 == 0) {
        player = 'X';
      }
      // Otherwise, odd turns are O's turns
      else {
        player = 'O';
      }
      // Check if col or row is less than 1 or greater than 3
      while (col < 1 || col > 3 || row < 1 || row > 3) {
        System.out.print(player + " - Select row (1 - 3) & select column (1 - 3) ");
        System.out.print("separated by a space: ");
        row = input.nextInt();
        col = input.nextInt();
      }
      if (board[row - 1][col - 1].equals(" - ")) {
        // Use player to provide character (X or O)
        board[row - 1][col - 1] = " " + player + " ";
        System.out.println("\t" + Arrays.toString(board[0]));
        System.out.println("\t" + Arrays.toString(board[1]));
        System.out.println("\t" + Arrays.toString(board[2]) + "\n");
      } else {
        // If position already taken, print message
        System.out.println("Sorry, that spot is taken.");
        // Roll loop var back by 1 so that the turn repeats
        turn--;
      }
      // Reset col and row so that validation loop runs correctly
      col = 0;
      row = 0;
    }
  }
}
