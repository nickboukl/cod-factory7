package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Guess repeatedly until the key will eventually
 * be found
 *
 *
 *
 */


public class BingoWhileApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int key = 10;
        int inputNum = 0;
        boolean bingo = false;

        do {
            System.out.println("Please guess the key number");
            inputNum = in.nextInt();

            if (inputNum == key) {
                bingo = true;
                System.out.println("Bingo Great guess");
            } else {
                System.out.println("Please try again!");
            }

        } while (!bingo);
    }
}
