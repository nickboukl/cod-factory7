package gr.aueb.cf.ch6test;

public class ArrayMinMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr) {

        if(arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int min = Integer.MAX_VALUE;

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
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxPosition = i;
                max = arr[i];
            }
        }

        return maxPosition;
    }

    public static int getMinPosition(int[] arr, int low, int high) {

        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr. length -1) return -1;
        if (low > high) return -1;

        if(arr == null || arr.length < 1) return -1;
        int minPosition = low;
        int min = arr[low];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                minPosition = i;
                min = arr[i];
            }
        }

        return minPosition;


    }

}
