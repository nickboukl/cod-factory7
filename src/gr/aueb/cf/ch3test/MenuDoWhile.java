package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 * Show a menu at least once.
 */

public class MenuDoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Quit");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the menu");
    }
}
