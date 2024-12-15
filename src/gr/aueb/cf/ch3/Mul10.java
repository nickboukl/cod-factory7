package gr.aueb.cf.ch3;


/**
 *
 * Calculates the multiplication of the 10 first
 * integers
 *
 */


public class Mul10 {
    public static void main(String[] args) {
        // 1 is the starting value of the multiply
        int result = 1;
        int i = 1;

        while (i <= 10) {
            result *= i;
            i++;
        }

        System.out.println("Result: " + result);
    }
}
