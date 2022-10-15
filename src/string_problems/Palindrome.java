package string_problems;

public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome("MOM"));
    }

    // Implement here
    public static boolean isPalindrome(String str) {
        //String builder for String modifications
        StringBuilder reversedStr = new StringBuilder();
        str = str.toLowerCase();
        char[] strCharArray = str.toCharArray();

        // reverse string operation with for-loop
        for (int i = strCharArray.length - 1; i >= 0; i--) {
            reversedStr.append(strCharArray[i]);
        }
        // if it's a Palindrome then true, else it returns false;
        return (reversedStr.toString()).equals(str);
    }
}
