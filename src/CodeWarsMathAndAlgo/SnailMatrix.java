package CodeWarsMathAndAlgo;

import java.util.ArrayList;
import java.util.List;

public class SnailMatrix {
    public static int[] snail(int[][] array) {
        List<Integer> result = new ArrayList<>();

        int rows = array.length;
        int cols = array[0].length;

        int leftCol = 0, rightCol = cols - 1, topRow = 0, bottomRow = rows - 1; // matrix sections
        char direction = 'r';

        while(leftCol <= rightCol && topRow <= bottomRow) {
            if(direction == 'r') {
                for(int i = leftCol; i <= rightCol; i++){
                    result.add(array[topRow][i]);
                }
                direction = 'd';
                topRow++;
            } else if (direction == 'd') {
                for(int i = topRow; i <= bottomRow; i++) {
                    result.add(array[i][rightCol]);
                }
                rightCol--;
                direction = 'l';
            } else if (direction == 'l') {
                for(int i = rightCol; i >= leftCol; i--) {
                    result.add(array[bottomRow][i]);
                }
                direction = 'u';
                bottomRow--;
            } else {
                for(int i = bottomRow; i >= topRow; i--) {
                    result.add(array[i][leftCol]);
                }
                direction = 'r';
                leftCol++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
