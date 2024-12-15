package gr.aueb.cf.ch2test;

import java.util.Scanner;

/**
 * Ypologizei to tetragwno kai ton kyvo enos arithmou
 * pou dinei o xrhsths, Xrhsimopoiei thn etoimh methodo
 * Math.pow () ths klashs Math.
 *
 *
 */

public class MathPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Παρακαλώ δώστε αριθμό");
        num = sc.nextInt();

        System.out.printf("Square: %d, Cube %d", (int) Math.pow(num, 2), (int) Math.pow(num, 3));


    }
}
