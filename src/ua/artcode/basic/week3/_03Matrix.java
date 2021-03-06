package ua.artcode.basic.week3;

import ua.artcode.basic.utils.MatrixUtils;

import java.util.Arrays;

/**
 * Created by olsas on 3/5/2016.
 */
public class _03Matrix {
    int[] row1 = {1, 2, 3};
    int[] row2 = {1, 2, 3};
    int[] row3 = {1, 2, 3};

    // matrix is the same as array of arrays
    int[][] matrix = {row1, row2, row3};

    int[][] mat3 = new int[4][3];
    //such initialization means that four pointers would be created to arrays
    //each array than would be defined as int array with 3 elements using for loop

    int[] r1 = mat3[0];
    int el = mat3[1][0];

    static int[][] table = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};

    public static void main(String[] args) {
        //it is possible to create matrix with different sized arrays in it
        int [][] triangle = new int[3][];
        for (int n = 0; n < 3; n++){
            triangle[n] = new int[n+1];
            for (int k = 0; k < triangle[n].length; k++) {
                triangle[n][k] = k;
            }
        }
        System.out.println("triangle = " + Arrays.deepToString(triangle));

        String a = MatrixUtils.toString(table);
        System.out.println(a);
    }
}
