package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the absolute of an int
 * that is abs(num) = num if num is positive,
 * or n-num if num is negative
 *
 */

public class TernaryApp {
    public static void main(String[] args) {
        int num1 = 0;
        int abs;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert a num");
        num1 = in.nextInt();

        abs = (num1 >= 0) ? num1 : -num1;

        System.out.printf("Abs of %d is %d", num1, abs);

    }
}
