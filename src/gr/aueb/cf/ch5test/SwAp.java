package gr.aueb.cf.ch5test;

public class SwAp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.printf("a=%d, b =%d\n", a, b);
        swap(a, b);
        System.out.printf("a=%d, b =%d", a, b);
    }

    /**
     *Mutually excchnages the values of two vairables
     */

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
}
