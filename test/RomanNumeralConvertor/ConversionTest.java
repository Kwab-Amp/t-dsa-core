package RomanNumeralConvertor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    Conversion conversion;
    Random random;
    Long systemTimeNow = System.currentTimeMillis();
    @BeforeEach
    void setUp() {
        conversion = new Conversion();
        random = new Random();
    }

    @Test
    void findRomanNumeralIndex() {
//        var number = numberGenerator();
        assertEquals(roman(2022),conversion.findRomanNumeralIndex(2022));
        var totalTime = System.currentTimeMillis() - systemTimeNow;
        System.out.println("Time findRomanNumeralIndex Took: " + totalTime);
    }

    @Test
    void hashMapSolution() {
//        var number = numberGenerator();
        assertEquals(roman(2022),conversion.treeMapSolution(2022));
        var totalTime = System.currentTimeMillis() - systemTimeNow;
        System.out.println("Time treeMapSolution Took: " + totalTime);
    }

    private int numberGenerator() {
        System.out.println(random.nextInt(3888) + 1);
        return  random.nextInt(3888) + 1;
    }

    private String roman(int n) {
        int[] ints = new int[]{1000, 900,  500, 400, 100,  90, 50,  40, 10,  9,   5,  4,   1};
        String[] nums = new String[]{"M",  "CM", "D", "CD","C", "XC","L","XL","X","IX","V","IV","I"};
        String result = "";
        for (int i = 0; i < ints.length; i++) {
            int count = n / ints[i];
            result += new String(new char[count]).replace("\0", nums[i]);
            n -= ints[i] * count;
        }
        return result;
    }
}