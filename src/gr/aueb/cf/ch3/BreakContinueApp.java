package gr.aueb.cf.ch3;


import java.util.Scanner;

/**
 * Shows the use of break and continue
 *
 *
 */


public class BreakContinueApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while (true) {
            System.out.println("Please provide a num");
            num = in.nextInt();

            // if the number is 5, ignore it
            // and immediately continue to next loop.
            if (num == 5) {
                continue;
            }
            sum += sum;
                //if the number equals 10 then
                //stop immediately the loop
                //and get out of while
                if (num == 10) {
                    break;
                }

        }
        System.out.println("Sum: " + sum);
    }
}
