package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ypologizei to athroisma twn psifiwn
 * enos akeraiou. Gia paradeigma to
 * athoisma tvn psifiwn tou 123 einai 6.
 *
 *
 */

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        inputNum = scanner.nextInt();

        // toDo
        /*while (inputNum > 0) {
            sum += inputNum % 10; // Get the last digit and add to sum
            inputNum = inputNum / 10; // Remove the last digit
        }*/

        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum += rightDigit;; // sum = sum + rightDigit
            tempNum /= 10;    // tempNum = tempNUm / 10;
        }

        System.out.println("The sum of digits of " + inputNum + "is" + sum);
    }
}
