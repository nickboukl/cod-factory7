package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            // Εμφάνιση μενού
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");

            // Ανάγνωση επιλογής χρήστη
            choice = in.nextInt();

            // Έλεγχος επιλογής χρήστη
            if (choice == 1) {
                System.out.println("Επιλέξατε Εισαγωγή.");
            } else if (choice == 2) {
                System.out.println("Επιλέξατε Διαγραφή.");
            } else if (choice == 3) {
                System.out.println("Επιλέξατε Ενημέρωση.");
            } else if (choice == 4) {
                System.out.println("Επιλέξατε Αναζήτηση.");
            } else if (choice == 5) {
                System.out.println("Έξοδος από το πρόγραμμα.");
                break; // Έξοδος από τον βρόχο
            } else if (choice < 1 || choice > 5) {
                System.out.println("Λανθασμένη επιλογή! Παρακαλώ δώστε αριθμό από 1 έως 5.");
            }
        }
    }
}
