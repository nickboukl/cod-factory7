//package gr.aueb.cf.ch9;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//public class PdfCopyApp {
//
//    public static void main(String[] args) {
//        int b;
//        int counter = 0;
//        long start;
//        long end;
//        double elapsedTime = 0.0;
//
//        try (FileInputStream fis = new FileInputStream("C:/tmp/dummy.pdf");
//        FileOutputStream fos = new FileOutputStream("C:/tmp/dummy-out.pdf")) {
//
//            while ((b = fis.read()) != -1) {
//                fos.write(b);
//                counter++;
//            }
//
//            end = System.currentTimeMillis();
//            elapsedTime = (end - start) / 1000.0;
//
//            System.out.printf("TThe file with size %.1fKB (%d bytes) was copied succesfully\n", counter / 1024.0);
//            System.out.println("Elapsed Time: " + elapsedTime + " seconds");
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }
//}
