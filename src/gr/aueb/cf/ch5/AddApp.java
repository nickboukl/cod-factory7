package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ypologizei to athroisma duo akeraiwn
 * me tin xrhsh methodwn
 *
 */
public class AddApp {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter two integers");
        a = in.nextInt();
        b = in.nextInt();

        sum = add(a, b);
        sub = sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     *  Add two integers
     *
     * param a
     * param b
     * add
     */

    public static int add(int a, int b) {
//        int result = 0;
//        result = a + b;
//
//        return result;

        return a + b;
    }

    /**
     * Subtract
     *
     *
     *
     */

    public static int sub(int a, int b) {
        return a - b;
    }
}
