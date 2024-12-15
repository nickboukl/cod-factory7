package gr.aueb.cf.ch3test;

import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET = 12;
        int num = 0;
        boolean isSuccess = false;

        while (true) {
            System.out.println("Insert a number");
            num = in.nextInt();


            if (num != SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Bingo");
            break;
        }
    }
}
