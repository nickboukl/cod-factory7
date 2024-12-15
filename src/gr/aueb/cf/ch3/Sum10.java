package gr.aueb.cf.ch3;

/**
 * Identifies the sum of 10
 * first numbers, from 1 to 10;
 *
 *
 */

public class Sum10 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum =" + sum);
    }
}
