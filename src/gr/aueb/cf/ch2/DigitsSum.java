package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * Nα λαμβάνει ως input απο τον χρήστη ε΄να
 * διψήφιο ακέραιο και να υπολογίιζει και να
 * εκτυπώνει το άθροισμα των ψηφίων του.
 * Για παράδειγμα, αν ο χρήστης δώσει εκέραιο 15,
 * θα πρέπει το αποτέλεσμα να είναι
 * 1 + 5 =6.
 */
public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum = 0;
        int sum = 0;

        System.out.println("Please insert a two-digit interger");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum %10;
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d", inputNum, leftDigit, rightDigit, sum);
    }
}
