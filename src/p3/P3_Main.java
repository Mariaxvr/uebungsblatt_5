package p3;

import java.util.Arrays;

public class P3_Main {
    public static void main(String[] args) {

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        //a jedes element +1 und ausgeben
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] += 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //b summe der werte aller elemente ausgeben



    }
}
