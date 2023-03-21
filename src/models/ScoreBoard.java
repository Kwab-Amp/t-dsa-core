package models;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ScoreBoard {
    private final GameEntry[] board;
    private int numEntries = 0;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    /**
     * attempt to add a new score to the collection if it is high enough
     * */
    public void add(@NotNull GameEntry e) {
        int newScore = e.getScore();
        //check if new score is really a high score or not
        if (numEntries < board.length || newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length)
                numEntries++; // increase number of entries on the board
            int j = numEntries - 1; //shift lower scores to the right
            while (j > 0 && board[j-1].getScore() < newScore) {
                board[j] = board[j-1];
                j--;
            }
            board[j] = e;
        }
    }

    /**
     * remove and return game entry high score
     * at index i
     * @param i index to remove game entry high score
     * @return GameEntry
     */
    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        // check if i is within range of scores
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid Index: " + i);
        GameEntry temp = board[i]; // find and save object to be removed
        for (int j = i; j < numEntries - 1 ; j++)
            board[j] = board[j + 1];
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }

    @Override
    public String toString() {
        return "ScoreBoard{" +
                "board=" + Arrays.toString(board) +
                ", numEntries=" + numEntries +
                '}';
    }
}
