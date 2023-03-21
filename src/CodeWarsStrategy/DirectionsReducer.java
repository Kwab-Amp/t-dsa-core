package CodeWarsStrategy;

import java.util.*;

/**
 * Once upon a time, on a way through the old wild mountainous west,…
 * … a man was given directions to go from one point to another. The directions were "NORTH", "SOUTH", "WEST", "EAST". Clearly "NORTH" and "SOUTH" are opposite, "WEST" and "EAST" too.
 *
 * Going to one direction and coming back the opposite direction right away is a needless effort. Since this is the wild west, with dreadful weather and not much water, it's important to save yourself some energy, otherwise you might die of thirst!
 *
 * How I crossed a mountainous desert the smart way.
 * The directions given to the man are, for example, the following (depending on the language):
 * <p>
 *     <code>
 *         ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
 *    </code>
 * </p>
 * <p>You can immediately see that going "NORTH" and immediately "SOUTH" is not reasonable,
 * better stay to the same place! So the task is to give to the man a simplified version of the plan.
 * A better plan in this case is simply:</p>
 *
 */
public class DirectionsReducer {
    public static String[] dirReduc(String[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (("NORTH".equals(arr[i]) && "SOUTH".equals(arr[i + 1])) ||
                    ("SOUTH".equals(arr[i]) && "NORTH".equals(arr[i + 1])) ||
                    ("EAST".equals(arr[i]) && "WEST".equals(arr[i + 1])) ||
                    ("WEST".equals(arr[i]) && "EAST".equals(arr[i + 1]))) {
                arr[i] = null;
                arr[i + 1] = null;
            }
        }
        final String[] newArr = Arrays.stream(arr)
                .filter(Objects::nonNull)
                .toArray(String[]::new);

        if (newArr.length == arr.length) {
            return arr;
        } else {
            return dirReduc(newArr);
        }
    }

    public static void main(String[] args) {
        var input = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH"};
        var inputW = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        var result = DirectionsReducer.dirReduc(input);
        System.out.println(Arrays.toString(result));
    }
}
