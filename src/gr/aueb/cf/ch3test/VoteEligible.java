package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 * Validates if an age is eligible to vote
 *
 */

public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Please insert age");
        age = in.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " + isEligible);
    }
}
