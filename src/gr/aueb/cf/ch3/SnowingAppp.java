package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Decides if its is gonna snow or not, based on the temperature
 * and also if it is raining. If it is raining and the temperature
 * is <0, then its is snowing otherwise not
 *
 *
 */


public class SnowingAppp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please inser if it is raining (true or false)");
        isRaining = in.nextBoolean();
        System.out.println("Please insert the temperature");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing: " +isSnowing);
    }
}
