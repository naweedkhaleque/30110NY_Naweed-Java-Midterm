package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        getPrimeNumber(2, 1_000_000);
    }

    public static void getPrimeNumber(int a, int b) {
        // an int variable flag to keep track if i is prime number or not
        // 0 = not, 1 = is prime
        int flag;

        for (int i = a; i <= b; i++) {
            // 1 and 0 not prime numbers
            if (i == 1 || i == 0) {
                continue;
            }
            flag = 1;

            for (int j = 2; j <=  i/2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}


