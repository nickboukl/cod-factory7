package gr.aueb.cf.ch3;

import java.util.Scanner;

public class NumDenom {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int result = 0;
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Please insert numerator");
            numerator = in.nextInt();
            System.out.println("Please insert denominator");
            denominator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0");
                break;
            }


            if (denominator == 0) {
                System.out.println("Denominator is 0");
                break;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d  = %d", numerator, denominator, result);
        }
    }
}
