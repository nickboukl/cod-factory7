package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει ευρώ και τα μετατρέπει σε δολλάρια
 * 1 ευρώ = 99 σεντσ δολλάρια
 * και δινει το αποτέλεσμα
 *
 *
 */
public class EuroUsdConv {
    public static void main(String[] args) {
        int inPutEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an interger amoun (Euro)");
        inPutEuros = in.nextInt();

        totalUsaCents = inPutEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d \u20AC = %d \u0024 , %d usa scents", inPutEuros, usaDollars, usaCents);
    }
}
