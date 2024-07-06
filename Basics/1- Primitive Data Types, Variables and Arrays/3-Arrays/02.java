// 2d array

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] matrix= {
                {1, 2, 4},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matrix[0][2]);

        int[][] matrix2 = new int[10][];
        System.out.println(matrix2[0]);     // array[0] points on null in memory

        int[][] matrix3 = new int[10][10];
        System.out.println(matrix3[0]);

    }
}
