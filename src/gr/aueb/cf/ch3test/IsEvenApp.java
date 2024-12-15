package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 * Elegxei an enas akeraios eina iartios
 */

public class IsEvenApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isEven = false;
        System.out.println("Please insert a number");
        num = in.nextInt();

        isEven = num % 2 == 0;

        System.out.printf("%d is even: %b: ", num, isEven);
    }
}
