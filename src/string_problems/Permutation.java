package string_problems;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {
        System.out.println(getPermutations("ABC"));
    }
    // Implement Here
    public static Set<String> getPermutations(String str) {

        Set<String> permutationSet = new HashSet<>();

        if (str == null) {
            return null;
        }
        else if (str.length() == 0) {
            permutationSet.add("");
            return permutationSet;
        }

        char c = str.charAt(0);
        String substring = str.substring(1);

        Set<String> words = getPermutations(substring);

        for (String string: words) {
            for (int i = 0; i <= string.length(); i++) {
                permutationSet.add(string.substring(0, i) + c + string.substring(i));
            }
        }
        return permutationSet;
    }
}
