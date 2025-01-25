package gr.aueb.cf.projects;

import java.util.Scanner;

/**
 *A theater management program for a seating arrangement with 30 rows and 12 columns.
 * Each seat is identified by a column letter (e.g., A-L) and a row number (1-30)
 *
 */

public class Theater {

    static boolean[][] seats = new boolean[30][12];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        char column;
        int row;
        boolean booking = true;
        while (booking) {
            if (seatsAvailable()) {
                printMenu();
            } else {
                System.out.println("All seats are booked. Please choose another date");
            }

            choice = in.nextInt();
            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid");
                continue;
            }

            System.out.println("Enter column (A-L) and row (1-30): ");

            column = in.next().charAt(0);
            row = in.nextInt();

            if (column < 'A' || column > 'L' || row < 1 || row > 30) {
                System.out.println("Invalid input!");
                continue;
            }

            int colIndex = column - 'A';
            int rowIndex = row - 1;

            if (choice == 1) {
                book(colIndex, rowIndex);
            } else if (choice == 2) {
                cancel(colIndex, rowIndex);
            }

        }
    }


    /*Prints the menu to allow the user to make a selection*/
    public static void  printMenu() {
        System.out.println("Choose one of the following: ");
        System.out.println("1. Book seat");
        System.out.println("2. Cancel seat");
        System.out.println("3. Exit");
    }

    /*Checks if there are available seats*/
    static boolean seatsAvailable() {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /*Checks if the user's choice is among the available choices*/
    public static  boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <=3;
    }

    /*
    * Checks if a seat is available.
    * If available, it marks the seat as booked and informs the user with Seat booked.
    * Else informs the user with Seat already booked.
    */
    static void book(int col, int row) {
        if (!seats[row][col]) {
            seats[row][col] = true;
            System.out.println("Seat booked.");
        } else {
            System.out.println("Seat already booked.");
        }
    }

    /*
    * Checks if a seat is already booked.
    * If booked, it cancels the booking and informs the user and previously marks the seat as available.
    * Else informs that the Seat is not booked.
     */
    static void cancel(int col, int row) {
        if (seats[row][col]) {
            seats[row][col] = false;
            System.out.println("Booking cancelled.");
        } else {
            System.out.println("Seat is not booked.");
        }
    }


}
