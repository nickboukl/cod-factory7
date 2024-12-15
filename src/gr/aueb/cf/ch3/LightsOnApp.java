package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 * Decides if the lights of a car need to be activated
 * based on three parameters:
 * if it rains AND one of the following is true:
 * it is dark OR the car runs with speed > 100.
 * The values are inputed from the user (stdin)
 *
 *
 */



public class LightsOnApp {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true or false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true or false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert the car speed (int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);
    }
}
