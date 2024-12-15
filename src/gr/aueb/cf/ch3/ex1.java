package gr.aueb.cf.ch3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int year = 0;
        Scanner in = new Scanner(System.in);
        boolean isLeapYear = false;

        while (true) {


            System.out.println("Παρακαλώ εισάγετε ένα έτος:");
            year = in.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            } else {
                isLeapYear = false;
            }

            // Εμφάνιση του αποτελέσματος
            if (isLeapYear) {
                System.out.println("Το έτος " + year + " είναι δίσεκτο.");
            } else {
                System.out.println("Το έτος " + year + " δεν είναι δίσεκτο.");
            }
        }
    }
}
