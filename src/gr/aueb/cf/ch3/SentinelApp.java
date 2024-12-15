package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Keeps reading until
 *a sentinel value is provided
 *
 */

public class SentinelApp {
    public static void main(String[] args) {
        int num = 0;
        int interations = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please provide a num (-1 for Quit)");
        num = in.nextInt();
        while (num >= -1) {
            interations++;
            System.out.println("Please provide a num (-1 for Quit)");
            num = in.nextInt();
        }
        System.out.printf("%d interations", interations);
    }
}
