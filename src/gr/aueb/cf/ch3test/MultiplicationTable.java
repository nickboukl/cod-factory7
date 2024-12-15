package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 * Gives as output the multiplication of an intenger
 *
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer");
        num = in.nextInt();

        while (i <= 10) {
            System.out.println(num + "*" + i + "=" + (num*i));
            i++;
        }

    }
}
