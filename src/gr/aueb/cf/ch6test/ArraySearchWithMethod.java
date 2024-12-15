package gr.aueb.cf.ch6test;

/**
 * Array search with method
 *
 *
 */


public class ArraySearchWithMethod {

    public static void main(String[] args) {
        int [] arr = {1, 2 ,3 ,4 ,7};
        int position;

        position = getPosition(arr, 7);

        if (position == -1) {
            System.out.println("Το στοιχείο δεν βρέθηκε");
        } else

            System.out.printf("Value: %d, Postion: %d", arr[position], (position));


    }

    public static int getPosition(int [] arr, int value) {
        int positionToReturn = -1;

        for (int i =0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }

        return positionToReturn;
    }

}
