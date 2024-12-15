package gr.aueb.cf.ch7test;

import java.util.Scanner;

public class IOStrApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "";
        String s2 = "";

        s1 = in.nextLine();
        s2 = in.nextLine();

        System.out.printf("s1 %s\n", s1);
        System.out.printf("s2: %s\n", s2);


    }
}
