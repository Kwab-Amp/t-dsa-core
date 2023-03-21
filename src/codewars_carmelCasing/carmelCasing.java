package codewars_carmelCasing;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Complete the solution so that the function will break up camel casing, using a space between words.
 * Example
 * "camelCasing"  =>  "camel Casing"
 * "identifier"   =>  "identifier"
 * ""             =>  ""
 */
public class carmelCasing {
    public String camelCase(@NotNull String input) {
        String otherHalf= "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                otherHalf += " ";
            }
            otherHalf += input.charAt(i);
        }
        return otherHalf.toString();
    }

    public String camelCaseRegex(String input) {
        System.out.println(input.replaceAll("([A-Z]+)", "\\ $1"));
        return input.replaceAll("([A-Z]+)", "\\ $1");
    }
}

