package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 * Demo of ternary
 *
 */

public class Tern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num = scanner.nextInt();


//        if (num >= 0) abs = num;
//        else abs = -num;

        abs = (num >= 0) ? num : -num;

        System.out.println("abs: " + abs);
    }
}
