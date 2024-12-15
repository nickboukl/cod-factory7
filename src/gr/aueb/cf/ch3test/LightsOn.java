package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *
 *Turn lights on, if it is raining AND car is running ( > 100) OR is dark
 */

public class LightsOn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isDark = false;
        boolean isCarRunning = false;
        boolean isRaining = false;
        boolean areLightsOn = false;
        int cardSpeed;
        final int MAX_CAR_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dar");
        isDark = in.nextBoolean();

        System.out.println("Please insert if the car is running");
        cardSpeed = in.nextInt();

        isCarRunning = cardSpeed > MAX_CAR_SPEED;
        areLightsOn = isRaining && (isDark || isCarRunning);

        System.out.println("Lights are on: " + areLightsOn);
    }
}
