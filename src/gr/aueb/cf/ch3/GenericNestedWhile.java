package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Generic nested version of while
 *
 */


public class GenericNestedWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int i = 1;
        final int TIMES = 2;
        int count = 0;

        while (i <= TIMES) {
            count = 0;
            System.out.println("Please insert start value, end value, step");
            start = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();


            while (start <= endValue) {
                start += step;
                count++;
            }

            System.out.println("Count = " + count);
            i++;
        }
    }
}
