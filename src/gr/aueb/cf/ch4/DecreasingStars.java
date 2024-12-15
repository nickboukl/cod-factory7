package gr.aueb.cf.ch4;

import java.util.Scanner;

public class DecreasingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Διαβάζουμε το πλήθος των αστεριών από τον χρήστη
        System.out.print("Δώσε τον αριθμό n: ");
        int n = scanner.nextInt();

        // Εκτυπώνουμε φθίνουσα πλήθος αστεριών
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
