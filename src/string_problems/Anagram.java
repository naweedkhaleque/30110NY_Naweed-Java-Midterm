package string_problems;

import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        isAnagram("CAT", "ACT");
    }
    public static void isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length()) {

            char[] arrayOne = a.toCharArray();
            char[] arrayTwo = b.toCharArray();

            Arrays.sort(arrayOne);
            Arrays.sort(arrayTwo);

            if (Arrays.equals(arrayOne, arrayTwo)) {
                System.out.println("is Anagram.");
                return;
            }
        }
        System.out.println("is not Anagram.");
    }
}
