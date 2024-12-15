package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 * Secret number
 *
 */

public class SecretFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;

        System.out.println("Insert a number");
        num = in.nextInt();

        if (num == SECRET) {
            System.out.println("Bingo");
        } else {
            System.out.println("Please try again");
        }

    }
}
