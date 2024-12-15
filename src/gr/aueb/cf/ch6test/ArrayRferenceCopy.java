package gr.aueb.cf.ch6test;

/**
 *
 *  Copies the refertence of the array.
 *
 *
 **/



public class ArrayRferenceCopy {


    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrRefCopy = arr; //Shallow Copy

        for (int el : arrRefCopy) {
            System.out.print(el + " ");
        }


        arrRefCopy[4] = 100;

        for (int el : arr) {
            System.out.println(el + " ");
        }

    }
}
