package gr.aueb.cf.ch6test;

public class TwoDimArrayApp {

    public static void main(String[] args) {

        //Rows and columns
        int [][] grid = new int[2][2];


        grid[0][0] = 5;
        grid[0][1] = 7;
        grid[0][2] = 10;
        grid[1][0] = 2;
        grid[1][1] = 6;
        grid[1][2] = 8;

        // traverse
        for (int[] row : grid) {
            for (int el : row) {
                System.out.print(el);
            }

            System.out.println();
        }

    }




}
