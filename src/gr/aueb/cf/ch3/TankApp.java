package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Gets input from the user true / false
 * for the two tanks if they are below < 1/4
 * If only one of the two tanks is belo 1<4
 * an orange lights is triggered and if both
 * tanks are below 1/4 a red light is triggered
 *
 */


public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEmptyTank1 = false;
        boolean isEmptyTank2 = false;
        boolean isOrange = false;
        boolean isRed = false;

        System.out.println("Please insert tank status (true/false)");
        System.out.println("Please insert tank 1 status");
        isEmptyTank1 = in.nextBoolean();

        System.out.println("Please insert tank 2 status");
        isEmptyTank2 = in.nextBoolean();

        isOrange = isEmptyTank1 ^ isEmptyTank2;
        isRed = isEmptyTank1 && isEmptyTank2;

        System.out.println("Orange: " + isOrange + "," + "Red: " + isRed);

    }
}
