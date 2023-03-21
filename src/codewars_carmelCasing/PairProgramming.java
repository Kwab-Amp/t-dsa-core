package codewars_carmelCasing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PairProgramming {
    /**
     * Digital root is the recursive sum of all the digits in a number.
     * Given n, take the sum of the digits of n. If that value has more than one digit,
     * continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
     * Examples    16  -->  1 + 6 = 7
     * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
     * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
     * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
     */
    public int digitalRootRecursive(int n) {
        return 1 + (n - 1) % 9;
    }

    public int digitalRoot(int n) {
        int sum = 0;
        int result = 0;
        int digitalSum = 0;

        while (n != 0) {
            var rightMostValue = n % 10;
            n = n / 10;
            sum += rightMostValue;
        }

        if (sum % 10 != 0) {
            while (sum > 0) {
                var right = sum % 10;
                sum = sum / 10;
                result += right;
            }
        }

        if (result % 10 != 0) {
            while (result > 0) {
                var rightMost = result % 10;
                result = result / 10;
                digitalSum += rightMost;
            }
        }
        System.out.println(digitalSum);
        return digitalSum;
    }

    public int digitalRootCharArray(int input) {
        var numberArray = String.valueOf(input).toCharArray();
        int sum = 0;
        int result = 0;
        //boolean breakOut = true;
        for (char c : numberArray) {
            System.out.print(c);
            sum += Character.getNumericValue(c);
        }
        System.out.println("Last step: " +sum);
        if (sum % 10 !=0)
            while (sum > 0){
                var right = sum % 10;
                sum = sum / 10;
                result += right;
            }
        System.out.println("Final answer "+result);
        return 0;
    }

    public static void main(String[] args) {
        PairProgramming pairProgramming = new PairProgramming();
        var n = pairProgramming.digitalRootRecursive(69);
        System.out.println(n);
    }
}
