package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * User gives a Fahrenheit temperatures. Those
 * are being converted into Celsium temperatures.
 * The calculation is 5 * (F-32)/9
 *
 *
 */



public class FahreToCel {
    public static void main(String[] args) {
        int fahrenheit;
        int celsium;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert Fahrenheit temperature");
        fahrenheit = in.nextInt();

        // Calculations
        celsium = 5 * (fahrenheit-32) / 9;

        System.out.printf("The Fahreneheit temperature is %d Celsium degrees.\n", celsium);
    }
}
