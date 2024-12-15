package gr.aueb.cf.ch8test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryWithResourcesApp {

    public static void main(String[] args) {
        int num = 0;

        try (Scanner in = new Scanner(System.in))  {
            System.out.println("Please insert a num");
            num = in.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
