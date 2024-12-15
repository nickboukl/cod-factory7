package gr.aueb.cf.ch6;

public class ArrayMinandMax {
    public static void main(String[] args) {

    }

    public static int getMinPoistion(int[] arr) {
        if (arr == null || arr.length < 1) return - 1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }

        return maxPosition;
    }
}
