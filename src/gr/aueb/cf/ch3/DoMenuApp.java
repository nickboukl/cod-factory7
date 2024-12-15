package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Displays a menu, until the user
 * chooses exit
 *
 */

public class DoMenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Choose one of the following");
            System.out.println("1. Insert product");
            System.out.println("2. Delete product");
            System.out.println("3. Exit");
            choice = in.nextInt();
        } while (choice != 3);

        System.out.println("Thanks for using the app");
    }
}
