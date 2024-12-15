package gr.aueb.cf.ch5test;

import java.util.Scanner;

/**
 *  Εμφανίζει ένα μενού επιλο΄γων και ο χρηστησ επιλέγει ένα menu item
 *  και ο χρήστης κάνει επιλογές
 *
 * */


public class Ma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();;
            choice = scanner.nextInt();
            if (!isChoicevalid(choice)) {
                System.out.println("Error. Choice is not valid.");
            } continue;

//            doOnChoice(choice);

        } while (choice != 5);
    }

    public static void printMenu () {
        System.out.println("Επιλέξτε ένα απο τα παρακάτω:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Αναζήτηση");
        System.out.println("4. Ενημέρωση");
        System.out.println("5. Έξοδος");

    }

    public static boolean isChoicevalid(int choice) {
        return choice >= 1 && choice <=5;
    }

    public static void doOnChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Εισαγωγή process");
                break;
            case 2:
                System.out.println("Διαγραφή process");
                break;
            case 3:
                System.out.println("Αναζήτηση process");
                break;
            case 4:
                System.out.println("Ενημέρωση process");
                break;
            case 5:
                System.out.println("Έξοδος");
                break;
            default:
                System.out.println("Λάθος επιλογή");
                break;
        }
    }
}
