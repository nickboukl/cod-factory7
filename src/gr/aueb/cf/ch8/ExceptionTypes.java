//package gr.aueb.cf.ch8;
//
//import java.io.IOException;
//
//public class ExceptionTypes {
//
//    public static void main(String[] args) {
//
//
//    }
//
//    public static char readOneChar() throws IOException {
//        return(char) System.in.read();
//    }
//
//    public static char readAnotherCha() {
//        try {
//            return(char) System.in.read();
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            return ' ';
//        }
//
//    }
//
//    public static char readAnotherOneChar() {
//        try {
//            return (char) System.in.read();
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//            throw e;
//        }
//    }
//
//
//    public static char readAgainOneChar (char ch) throws IOException, IllegalArgumentException {
//        try {
//            char inputChar = (char) System.in.read();
//            if (inputChar != ch) throw new IllegalArgumentException("Char not fit");
//            return  inputChar;
//
//
//
//
//
//
//
//        } catch (IllegalArgumentException ex1) {
//            ex1.printStackTrace();
//            System.err.println(ex1.getMessage());
//            throw ex1;
//        } catch (IOException ex2) {
//            ex2.printStackTrace();
//            System.err.println((ex2.getMessage()));
//            throw ex2;
//        }
//    }
//}
