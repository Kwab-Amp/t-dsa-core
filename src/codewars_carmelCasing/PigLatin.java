package codewars_carmelCasing;

import java.util.Arrays;

public class PigLatin {
    /**
     * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
     *
     * Examples
     * pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
     * pigIt('Hello world !');     // elloHay orldway !
     */
    public String pigLatin(String input) {
        var pigLatin ="";
        var words = input.split(" ");
        Arrays.stream(words).forEach(System.out::println);
        return "";
    }

    public static void main(String[] args) {
        PigLatin p = new PigLatin();
        p.pigLatin("Hello World");
    }
}
