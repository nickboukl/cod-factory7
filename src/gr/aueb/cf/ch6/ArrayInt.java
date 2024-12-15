package gr.aueb.cf.ch6;

public class ArrayInt {
    public static void main(String[] args) {
        int[] arr = new int[3];                       // declare and init
        int[] arr2 = {1, 2, 3, 4, 5};                 // unsized init

//      int[] arr3 = new int[] {1, 2, 3, 4 ,5};     // array initialization
        int[] arr3;
        arr3 = new int[] {1, 2, 3, 4 ,5};

        // Populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse = διασχιση του πίνακα

        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // η κατω μορφή λέγεται enhanced for
        for ( int el : arr3) {
            System.out.println(el + " ");
        }
    }

}
