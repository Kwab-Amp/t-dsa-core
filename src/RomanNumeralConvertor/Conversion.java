package RomanNumeralConvertor;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.
 *
 * Modern Roman numerals are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 *
 * Example:
 * conversion.solution(1000); // should return "M"
 */
public class Conversion {
    public String findRomanNumeralIndex(int n) {
       int[] romanValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
       String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

       StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < romanValues.length; i++) {
            while (n >= romanValues[i]) {
                n = n - romanValues[i];
                romanNumeral.append(romanLetters[i]);
            }
        }
        System.out.println(romanNumeral.toString());
       return romanNumeral.toString();
    }

    private static final TreeMap<Integer, String> MAP;
    static {
        MAP = new TreeMap<Integer, String>(Collections.reverseOrder());
        MAP.put( 1, "I" );
        MAP.put( 4, "IV" );
        MAP.put( 5, "V" );
        MAP.put( 9, "IX" );
        MAP.put( 10, "X" );
        MAP.put( 40, "XL" );
        MAP.put( 50, "L" );
        MAP.put( 90, "XC" );
        MAP.put( 100, "C" );
        MAP.put( 400, "CD" );
        MAP.put( 500, "D" );
        MAP.put( 900, "CM" );
        MAP.put( 1000, "M" );
    }

    public String treeMapSolution(int n) {
        StringBuilder builder = new StringBuilder();
        for( Map.Entry<Integer, String> entry: MAP.entrySet() ){
            int i = entry.getKey();
            String s = entry.getValue();
            while( n>=i ){
                builder.append(s);
                n -= i;
            }
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}
