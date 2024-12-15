package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Γράψτε ένα πρόγραμμα που διαβάζει από τον χρήστη 3 ακέραιους αριθμούς που αναπαριστούν ημέρα, μήνα, έτος και την εμφανίζει σε μορφή:
 * ΗΗ/ΜΜ/ΕΕ
 * Π.χ. αν δώσουμε 5 12 2022 θα εμφανίσει 05/12/22
 *
 *
 */

public class DateManipulation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;


        System.out.println("Please insert day, month, year");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        // Print results

        System.out.printf("Date %02d/%02d/%02d\n", day, month, year % 100);
    }
}
