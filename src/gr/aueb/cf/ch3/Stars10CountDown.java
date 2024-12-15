package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Prints 10 stars (10 times
 * from one star)
 *
 *
 */

public class Stars10CountDown {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 1;
        int n = 0;

        System.out.println("Insert number of interations");
        n = in.nextInt();

        while (i <= n) {
            System.out.println("*");
            i++;
        }
    }
}
