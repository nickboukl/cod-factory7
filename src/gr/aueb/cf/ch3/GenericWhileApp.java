package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user inputs begin value, end value,
 * and the step. The program calculates how many times
 * a while fuction is triggered
 *
 *
 *
 */


public class GenericWhileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;

        System.out.println("Please insert begin value, end value, step");
        start = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        while (start <= endValue) {
            counter += 1;
            start += step;
        }
        System.out.println("Count" + counter);
    }
}
