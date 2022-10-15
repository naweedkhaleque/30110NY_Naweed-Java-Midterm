package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {
        System.out.println(recursion(5));
        System.out.println(iteration(5));

    }
    //Factorial using Recursion
    public static int recursion(int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return (n * recursion(n - 1));
        }
    }

    //Factorial using Iteration
    public static int iteration(int n) {
        int result = 1;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
        return result;
    }

}
