package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Dikaio psifou se ilikies > 18
 * elegxei an mia ilikia exei dikawma
 * na psifisiei.
 *
 */



public class VoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isEligible = false;
        final int VOTING_AGE = 18;
        int age = 0;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible " + isEligible);
    }
}
