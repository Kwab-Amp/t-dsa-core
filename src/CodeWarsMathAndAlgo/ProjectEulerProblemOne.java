package CodeWarsMathAndAlgo;

import java.util.ArrayList;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 * Additionally, if the number is negative, return 0 (for languages that do have them).
 *
 * Note: If the number is a multiple of both 3 and 5, only count it once.
 *
 * Courtesy of projecteuler.net (https://projecteuler.net/problem=1)
 */
public class ProjectEulerProblemOne {

    public static int Solution(int n) {
        ArrayList<Integer> grandTotal = new ArrayList<>();
        if (n <= 0){
            return 0;
        }

        for (int i = 1; i < n; i++) {
            if ((i % 3 == 0) ||(i % 5 == 0)) {
                grandTotal.add(i);
            }
        }

        int result = grandTotal.stream().distinct().reduce(0, Integer::sum);
        System.out.println(n + " => " +result);
        return result;
    }

    public static int SolutionOptimized(int n) {
        int sum=0;

        for (int i=0; i < n; i++){
            if (i%3==0 || i%5==0){
                sum+=i;
            }
        }
        return sum;
    }

    public static int StrangerSolun(int n) {
        int sum = 0;
        for(int i = 3; i < n; i++) if(i % 3 == 0 || i % 5 == 0) sum += i;
        return sum;
    }

}
