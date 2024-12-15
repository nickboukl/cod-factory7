package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Calculates a^b
 *
 */

public class PoweApp {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int result = 1;
        int i = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("PLease insert a,b");
        a = in.nextInt();;
        b = in.nextInt();

        while (i <= b) {
            result = result * a;
            i++;
        }
        System.out.printf("%d^%d = %d", a, b, result);
    }
}
