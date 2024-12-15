package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Counts the total of
 * the positive numbers that the user provides
 *
 *
 */

public class PositivesCountApp {
    public static void main(String[] args) {
        int num;
        int positivesCount = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please give a num (int)");
        num = in.nextInt();
        while (num >= 0) {
            positivesCount++;
            System.out.println("Please give a num (int)");
            num = in.nextInt();
        }
        System.out.println("Positive-count: " + positivesCount);
    }
}
