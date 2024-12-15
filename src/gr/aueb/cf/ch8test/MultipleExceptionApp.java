package gr.aueb.cf.ch8test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionApp {
    public static void main(String[] args) throws IOException {
        File file = new File("C:/tmp/file.txt");

        try (Scanner in = new Scanner(file)) {
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {
                System.err.println("IO exception");
                throw e;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
