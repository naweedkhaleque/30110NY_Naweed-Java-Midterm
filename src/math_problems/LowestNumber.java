package math_problems;

import java.util.Arrays;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};

        System.out.println(getLowestNum(array));

    }

    public static int getLowestNum(int[] array) {
        //sorting using Arrays class
        Arrays.sort(array);
        //returning first element of sorted int array (smallest value)
        return array[0];
    }

}
