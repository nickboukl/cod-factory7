package gr.aueb.cf.ch7test;

public class ImmutableStr {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Fatory";
        s1 = "Athens"; // remains unchangeable

    }
}
