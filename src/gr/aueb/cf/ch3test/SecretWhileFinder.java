package gr.aueb.cf.ch3test;

import java.util.Scanner;

public class SecretWhileFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isSuccess = false;

        do {
            System.out.println("Insert a number");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                isSuccess = true;
            } else {
                System.out.println("Please try again");
            }
        } while (!isSuccess);


    }
}
