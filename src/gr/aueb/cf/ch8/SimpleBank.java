//package gr.aueb.cf.ch8;
//
//import java.util.Scanner;
//
//public class SimpleBank {
//    static double balance = 500;
//    static Scanner in = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        try {
//            deposit(100);
//        } catch (Exception e) {
//
//        }
//        System.out.println("An erro happened. try again...");
//    }
//
//    public static void deposit(double amount) throws IllegalArgumentException {
//        try {
//            if (amount < = 0) {
//                throw new IllegalArgumentException("Amount must be positive.")
//            }
//            balance += amount;
//            System.out.println("Succesfully deposited amount" + amount); // log
//        } catch (IllegalArgumentException e) {
//            System.err.println("Error. " + e.getMessage()); // log
//            throw e;
//        }
//    }
//}
