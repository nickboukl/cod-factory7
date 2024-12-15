package gr.aueb.cf.ch2test;

import java.util.Scanner;

/**
* lambanei thermokrasia
 * kai emfnaizei katallilo minima
*
**/

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean isTempBelowZero;

        System.out.println("Please insert the curent temperature");
        temp = in.nextInt();

        isTempBelowZero = temp < 0;

        System.out.println("Temperature is below zero: " + isTempBelowZero);
    }
}
