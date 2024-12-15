package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Calculates the n multiplication
 *
 *
 *
 *
 */


public class FactorialApp {
    public static void main(String[] args) {
        int i = 1;
        int facto = 1;
        int n = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert n");
        n = in.nextInt();

        while (i <= n) {
            i++;
            facto = facto * i; // facto *= i;
        }

        System.out.printf("%d! = %d", n, facto);
    }
}
