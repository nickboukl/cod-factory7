package gr.aueb.cf.ch6test;

public class ArrayMinAndMax {

    public static void main(String[] args) {

        // Step 1: Create a sample array
        int[] arr = {7, 2, 10, 4, 1, 6};

        // Step 2: Find the minimum and maximum positions
        int minPosition = getMinPosition(arr);
        int maxPosition = getMaxPosition(arr);

        // Step 3: Print the results
        if (minPosition != -1) {
            System.out.printf("The smallest value is %d at position %d%n", arr[minPosition], minPosition);
        } else {
            System.out.println("Array is empty or null.");
        }

        if (maxPosition != -1) {
            System.out.printf("The largest value is %d at position %d%n", arr[maxPosition], maxPosition);
        } else {
            System.out.println("Array is empty or null.");
        }
    }



    public static int getMinPosition(int[] arr) {


        if(arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int min = arr[minPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }

        return minPosition;
    }


    public static int getMaxPosition(int[] arr) {


        if(arr == null || arr.length < 1) return -1;
        int maxPosition = 0;
        int max = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxPosition = i;
                max = arr[i];
            }
        }

        return maxPosition;
    }

}
