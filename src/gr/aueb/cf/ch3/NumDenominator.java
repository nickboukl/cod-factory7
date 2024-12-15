package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenominator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("please insert numerator (Quit with numerator = 0)");
            numerator = scanner.nextInt();

            System.out.println("Please insert denominator");

            if (denominator != 0); {
                if (numerator != 0 ) {
                    result = numerator / denominator;
                    break;
                }
            else {
                    System.out.println("Denominator is zero");
                    continue;
                }

            }
        }

    }
}
