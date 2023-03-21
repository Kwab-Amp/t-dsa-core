package arrays;

import models.GameEntry;
import models.ScoreBoard;

import java.util.List;

public class ScoreBoardImpl {
    public static void main(String[] args) {
        var entries = List.of(new GameEntry("James", 20), new GameEntry("Ama", 30));
        var board = new ScoreBoard(entries.size());
        entries.forEach(board::add);
        var scoreBoard = board.toString();
        board.add(new GameEntry("Kwabena", 100));
        var scoreBoard2 = board.toString();
        System.out.println(scoreBoard);
        System.out.println(scoreBoard2);
    }
}
