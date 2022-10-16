package math_problems;

public class FindMissingNumber {

    /** INSTRUCTIONS
     * Write a method to find the missing number from the array.
     */

    public static void main(String[] args) {
        int[] array = new int[] {10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println(missingNumber(array));
    }

    public static int missingNumber(int[] myArray) {
        // sum total = N * (N+1) / 2
        int sum = ((myArray.length + 1) * (myArray.length + 2)) / 2;
        //iterate through with for-loop and decrease the value of sum by the values in array throughout loop
        for (int i = 0; i < myArray.length; i++)
            sum -= myArray[i];
        return sum;
    }
}
