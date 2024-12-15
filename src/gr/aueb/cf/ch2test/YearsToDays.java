package gr.aueb.cf.ch2test;

import java.util.Scanner;

/**
 * years to days
 *
 */

public class YearsToDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        System.out.println("Please insert your age");
        age = in.nextInt();

        days = age *DAYS_PER_YEAR;

        System.out.println("Age in years:" + age + ",Age in days: " + days);
    }
}
