package arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 *   Given two arrays of strings a1 and a2 return a sorted array r in lexicographical order of the strings of a1 which are substrings of strings of a2.
 * </p>
 * <p> Example 1:
 *  <li>a1 = ["arp", "live", "strong"]</li>
 *  <li>a2 = ["lively", "alive", "harp", "sharp", "armstrong"]</li>
 *  <li>returns ["arp", "live", "strong"]</li>
 * </p>
 *
 * <p> Example 2:
 *   <li>a1 = ["tarp", "mice", "bull"]</li>
 *   <li>a2 = ["lively", "alive", "harp", "sharp", "armstrong"]</li>
 *   <li>returns []</li>
 * </p>
 * <hr>
 * <strong>
 *   Notes:
 *   <li> Arrays are written in "general" notation. See "Your Test Cases" for examples in your language. </li>
 *  <li>In Shell bash a1 and a2 are strings. The return is a string where words are separated by commas. </li>
 *  <li>Beware: r must be without duplicates.</li>
 * </strong>
 *
 */
public class LexicoOrdering {
    public void lexicoOrder() {
        var a1 = List.of("arp", "live", "strong");
        var a2 = List.of("lively", "alive", "harp", "sharp", "armstrong");

        var res = a1.stream().filter(a -> a2.stream().anyMatch(s -> s.contains(a))).distinct().sorted().collect(Collectors.toList());
        System.out.println(res);
    }

    public static void main(String[] args) {
        String[] a1 = {"arp", "live", "strong"};
        String[] a2 = {"lively", "alive", "harp", "sharp", "armstrong"};
        List<String> res = new java.util.ArrayList<>();

        for (String c : a1) {
            for (String s : a2) {
                if (c.contains(s))
                    res.add(s);
            }
        }
        var items = res.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(items);
    }

    public String[] inArray(String[] array1, String[] array2) {
        List<String> res = new ArrayList<>();
        for (String a1 : array1) {
            for (String a2: array2) {
                if (a2.contains(a1))
                    res.add(a1);
            }
        }
        return res.stream().distinct().sorted().toArray(String[]::new);
    }

    public String[] inArraySetImpl(String[] array1, String[] array2) {
        Set<String> res = new HashSet<>();
        for (String a1 : array1) {
            for (String a2: array2) {
                if (a2.contains(a1))
                    res.add(a1);
            }
        }
        var arraySet =  res.toArray(String[]::new);
        Arrays.sort(arraySet);
        return arraySet;
    }

    public String[] inArrayStreamsOnly(String[] array1, String[] array2) {
        return Arrays.stream(array1)
                .filter(s1 ->
                        Arrays.stream(array2).anyMatch(s2 -> s2.contains(s1)))
                .distinct()
                .sorted()
                .toArray(String[]::new);
    }
}
