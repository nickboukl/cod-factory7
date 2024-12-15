package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the sum of 10 first
 * numbers, from one 1-10
 *
 *
 */

public class SumNApp {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum: " + sum);
    }
}
