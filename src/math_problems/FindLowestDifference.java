package math_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindLowestDifference {

    /**
     * INSTRUCTIONS
     * Write a method to return the lowest number, that is not shared between the 2 arrays below
     * HINT: The lowest number that isn't shared between these arrays is 1
     */

    public static void main(String[] args) {


        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1, -15};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19, -15};
        lowestDifferenceNumber(array1, array2);
    }

    public static void lowestDifferenceNumber(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                myList.add(arr1[i]);
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[j] != arr2[j]) {
                    myList.add(arr2[j]);
                }
            }
        }
        Collections.sort(myList);
        System.out.println(myList.get(0));
    }
}
