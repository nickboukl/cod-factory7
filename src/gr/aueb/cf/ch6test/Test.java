package gr.aueb.cf.ch6test;

public class Test {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

        if (s.contains("Economics")) System.out.println("Bingo");

        index = s.indexOf("Uni");
        System.out.println("Start Index of Uni: " + index);
    }
}
