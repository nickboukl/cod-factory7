package gr.aueb.cf.ch3;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int SECRET = 12;

        while (true) {
            System.out.println("Please insert ");
            inputNum = in.nextInt();

            if (inputNum != SECRET) {
                System.out.println("Not very lucky! Try again");
                continue;
            }

            System.out.println("You are lucky");
            break;
        }
    }
}
