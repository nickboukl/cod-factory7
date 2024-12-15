package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 * Calculates the sum of even numbers from 2
 * to an upper limit provided by user
 *
 *
 */

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = in.nextInt();

        //sum

        while (i <= inputNum) {
            sum += i;
            i += 2;
        }

        System.out.println("The sum of evenmbers up to " + inputNum + "is: " + sum);

    }
}
