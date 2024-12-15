package gr.aueb.cf.ch4test;

import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Read a char as a byte
 *
 */

public class CharInApp {
    public static void main(String[] args) throws IOException {
        char ch = ' ';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
//        ch = (char) System.in.read();
        ch = scanner.nextLine().charAt(0);

        System.out.printf("%c", ch);
    }
}
