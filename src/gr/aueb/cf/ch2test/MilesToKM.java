package gr.aueb.cf.ch2test;

import java.util.Scanner;

/**
 *Convert
 *
 **/

public class MilesToKM {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        Scanner in = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometers = 0.0;

        System.out.println("Please insert miles");
        inputMiles = in.nextDouble();

        kilometers = inputMiles * KM_PER_MILE;

        System.out.println("Miles: " + inputMiles + ", KM: " + kilometers);
    }
}
