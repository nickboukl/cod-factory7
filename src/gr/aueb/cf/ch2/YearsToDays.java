package gr.aueb.cf.ch2;

/**
 *
 * Convert years (ages) to days.
 *
 */

import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        // Declaration and values of variables
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age = 0;
        int days = 0;

        // Command
        System.out.println("Please insert your age");
        age = scanner.nextInt();

        days = age * DAYS_PER_YEAR;

        // Print of results
        System.out.println("Age in years: " + age + ", Age in days: " + days);

    }
}
