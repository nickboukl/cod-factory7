package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Converts Euro to usd by taking
 * 99 USD cents =1 euro
 * one input in euro, execute the convert and
 * print the amount
 *
 */
public class EuroUsdConverter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Conversion rate: 99 cents (0.99 USD) per 1 Euro
        double conversionRate = 0.99;

        // Prompt the user to enter an amount in Euros
        System.out.print("Enter amount in Euros: ");
        double euros = scanner.nextDouble();

        // Convert Euros to USD
        double usd = euros * conversionRate;

        // Display the result
        System.out.printf("%.2f Euros is equivalent to %.2f USD.%n", euros, usd);
    }
}
