package ua.artcode.week3;

import ua.artcode.week3.util3.MatrixUtils;

/**
 * Created by olsas on 3/5/2016.
 */
public class _03Matrix {
    int[] row1 = {1, 2, 3};
    int[] row2 = {1, 2, 3};
    int[] row3 = {1, 2, 3};

    int[][] matrix = {row1, row2, row3};

    int[][] mat3 = new int[4][3];

    int[] r1 = mat3[0];
    int el = mat3[1][0];

    static int[][] table = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

    public static void main(String[] args) {

        String a = MatrixUtils.toString(table);
        System.out.println(a);
    }
}
