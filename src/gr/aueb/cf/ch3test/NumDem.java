package gr.aueb.cf.ch3test;

import java.util.Scanner;

public class NumDem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert numerator");
            numerator = in.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is 0");
                break;
            }

            System.out.println("Please insert denominator");
            denominator = in.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator is zero");
                continue;
            }

            result = numerator / denominator;
            System.out.println("Result " + result);
        }
    }
}
