package gr.aueb.cf.ch6test;

import java.util.Arrays;

public class ArrayDeepCopy {

    public static void main(String[] args) {

        // Step 1: Create a source array
        int[] source = {1, 2, 3, 4, 5};

        // Step 2: Perform a deep copy
        int[] copiedArray = arrDeepCopy(source);

        // Step 3: Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(source));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Step 4: Modify the copied array to ensure it's independent
        copiedArray[0] = 99;
        System.out.println("After modifying copied array:");
        System.out.println("Original Array: " + Arrays.toString(source));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }





    public static int[] arrDeepCopy(int[] source) {
        int[] destination = new int [source.length];

         for (int i = 0; i < source.length; i++) {
             destination[i] = source[i];
         }

         System.arraycopy(source, 0, destination, 0, source.length);
        destination = Arrays.copyOf(source, source.length);
        destination = Arrays.copyOfRange(source, 0, source.length);

         return destination;
    }
}
