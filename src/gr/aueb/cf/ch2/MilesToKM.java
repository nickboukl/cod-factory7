package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 *
 *Convert miles to km.
 */


public class MilesToKM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double KM_PER_MILE = 1.6;
        double inpuTMiles = 0.0;
        double kilometers = 0.0;

        System.out.println("Please insert miles");
        inpuTMiles = in.nextDouble();
        kilometers = inpuTMiles * KM_PER_MILE;

        System.out.println("Miles: " + inpuTMiles + ", KM: " + kilometers);

    }
}
