package gr.aueb.cf.ch3test;

/**
 * Calculate the sum and mul of
 * 10 first int
 *
 */

public class SumMul {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int j = 1;
        int mul = 1;

        while (i <= 10) {
           sum += i;
           i++;
        }

        while (i <= 10) {
            mul *= j;
            j++;
        }
    }
}
