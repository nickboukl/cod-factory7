package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *Snowinf if raining
 *
 */


public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert the temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
