package gr.aueb.cf.ch7test;

public class Index {

    public static void main(String[] args) {

        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        int positionOfSecondo = cf.indexOf("o", 2); //1
        int lastpositionOfSecondo = cf.lastIndexOf("o"); //1

        String cf2 = cf.substring(0);
        String slice = cf.substring(1, 3); //od


    }
}
