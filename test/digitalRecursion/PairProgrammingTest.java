package digitalRecursion;

import codewars_carmelCasing.PairProgramming;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PairProgrammingTest {
    PairProgramming pairProgramming;
    @BeforeEach
    void setUp() {
        pairProgramming = new PairProgramming();
    }

    @Test
    void digitalRootRecursive() {
        var number = generateNumbers();
        assertEquals(solveDigitalRecursion(number), pairProgramming.digitalRootRecursive(number));
    }

    @Test
    void digitalRoot() {
        var number = generateNumbers();
        assertEquals(solveDigitalRecursion(number), pairProgramming.digitalRoot(number));
    }

    @Test
    void digitalRootCharArray() {
    }

    private int generateNumbers() {
        Random random = new Random();
        int number = 0;
        for (int i = 0; i < random.nextInt(10)+1; i++) {
            number = random.nextInt();
        }
        return Math.abs(number);
    }

    private int solveDigitalRecursion(int n) {
        System.out.println(n);
        return (1 + (n - 1) % 9);
    }
}