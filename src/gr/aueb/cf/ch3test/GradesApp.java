package gr.aueb.cf.ch3test;

import java.util.Scanner;

/**
 *  avg mark for total courses
 *
 *
 */

public class GradesApp {
    public static void main(String[] args) {
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Insert total marks");
        totalMarks = in.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = in.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error");
            System.exit(1);
        }

        System.out.println("");
    }


}
