package gr.aueb.cf.ch4;

import java.util.Scanner;

public class HorizontalStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Δώσε αριθμό n");
        int n = scanner.nextInt();

        for (int i = 0; i <=n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
