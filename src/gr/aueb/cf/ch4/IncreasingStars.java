package gr.aueb.cf.ch4;

import java.util.Scanner;

public class IncreasingStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Δώσε τον αριθμό n: ");
        int n = scanner.nextInt();

        // Εκτυπώνουμε αυξανόμενο πλήθος αστεριών
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
