package gr.aueb.cf.ch9test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamMethod {

    public static void main(String[] args) {

//       try (PrintStream ps = new PrintStream("C:/tmp/file7-os.txt", StandardCharsets.UTF_8)) {

        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/file7-ps.txt")) ) {
           printMessage(ps, "Hello Coding Factory");
           printMessage(System.out, "Hello CF!");
        } catch (IOException e) {
           e.printStackTrace();
       }
    }

    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }


}
