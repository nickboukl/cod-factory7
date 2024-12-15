package gr.aueb.cf.ch2test;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input απο τον χρήστη ένα
 * διψήφιο ακέραιο και να υπλογίζει και να
 * εκτυπώνει τ οάθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει τον
 * ακέραιο 15, θα π΄ρεπει το αποτέλεσμα να είναι
 * 1 + 5 = 6
 *
 */

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum = 0;
        int sum = 0;

        System.out.println("Please inser a two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", inputNum, leftDigit, rightDigit, sum);
    }
}
