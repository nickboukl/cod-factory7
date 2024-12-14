package gr.aueb.cf.ch10test;

import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Please enter a number (integer)");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length();
        originalNum = num;

        while (num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        System.out.printf("%d%s Armstrong", originalNum, (sum == originalNum) ? " is " : " is not ");
    }
}
