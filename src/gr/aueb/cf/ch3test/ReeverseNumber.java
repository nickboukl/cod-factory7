package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 * Reverse
 */

public class ReeverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int reversed = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer");
        num = in.nextInt();

        tempNum = num;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            reversed = reversed * 10 +rightDigit;
            tempNum /= 10;
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
