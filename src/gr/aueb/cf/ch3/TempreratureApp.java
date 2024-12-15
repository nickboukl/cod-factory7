package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * If temperature is <0, then isTempBelowZero,
 * becomes true, else becomes false. User inputs
 * the temperature
 *
 *
 */

public class TempreratureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTempBelowZero = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = in.nextInt();

        isTempBelowZero = (temp < 0);

        System.out.println("Tempeture is bewlo zero:" + isTempBelowZero);




    }
}
