package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Bingo when the user finds
 * the secret key
 *
 */

public class BingoApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final  int SECRET = 11;

        while (true) {
            System.out.println("Please provide me a secret num");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!");
                break;
            } else {
                System.out.println("Try again");
            }
        }

    }
}
