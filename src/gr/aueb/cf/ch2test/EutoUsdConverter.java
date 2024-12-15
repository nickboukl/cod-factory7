package gr.aueb.cf.ch2test;

import java.util.Scanner;


/**
 * Μετατρέπει Ευρώ σε USD και cents.
 * Η ισοτιμία 99 cents = 1 Ευρώ.
 */



public class EutoUsdConverter {
    public static void main(String[] args) {
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an amount (Euro)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa dollars, %d usa cents", inputEuros, usaDollars, usaCents);
    }

}
