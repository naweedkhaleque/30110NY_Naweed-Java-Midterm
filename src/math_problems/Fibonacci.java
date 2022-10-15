package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
       getFibonacci(42);
    }

    public static void getFibonacci(int n) {
        int count = 0;
        int number1 = 0;
        int number2 = 1;

        while (count < n) {

            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
            count += 1;

            System.out.print(number1 + " ");
        }
    }
}
