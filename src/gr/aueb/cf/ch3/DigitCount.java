package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Calculates the count
 * of thedgits from a number
 *
 *
 */

public class DigitCount {
    public static void main(String[] args) {
        int inputNum = 0;
        int num = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please inser a number");
        inputNum = in.nextInt();

        num = inputNum;
        do {
            count++;
            num = num / 10;
        } while (num != 0);

        System.out.printf("Num %d consists of %d digits", inputNum, count);
    }
}
