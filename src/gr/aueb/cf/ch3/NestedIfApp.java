package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Takes as input 1) total marks,
 * 2) count of lessons and calculates the average grade
 * The result is based on ranges of average grade
 *
 *
 */


public class NestedIfApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int modulesCount = 0;
        int totalMarks = 0;
        int average = 0;

        System.out.println("Please insert the sum of grades");
        totalMarks = in.nextInt();

        System.out.println("Please insert the modules count");
        modulesCount = in.nextInt();

        if (modulesCount == 0) {
            System.out.println("Modules count cannot be a zero");
            System.exit(1);
        }

        average = totalMarks / modulesCount;

        if (average < 0 || average > 10) {
            System.out.println("Error in input data");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent: " + average);
        } else if (average >=7) {
            System.out.println("Very Good: " + average);
        } else if (average >= 5) {
            System.out.println("Good: " + average);
        } else {
            System.out.println("Fail: " + average);
        }
    }
}
