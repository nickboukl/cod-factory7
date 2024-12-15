package gr.aueb.cf.ch8test;

public class NullPointerExceptionApp {

    public static void main(String[] args) {
        String s = null;

        if (s != null && s.equals("Athens")) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT EQUALS");
        }
    }
}
