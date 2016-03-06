package ua.artcode.week3.util3;

import ua.artcode.week2.util.ArrayUtils;

/**
 * Created by olsas on 3/5/2016.
 */
public class MatrixUtils {
    public static String toString(int[][] mat) {
        if (mat == null) {
            return "Wrong argument";
        }

        if (mat.length == 0) {
            return "Empty matrix";
        }

        String matRes = "";
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            for (int j = 0; j < row.length; j++) {
                int col = mat[i][j];
                matRes += col + " ";
            }
            matRes += "\n";
        }

        return matRes;
    }

    public static int[][] randomOddEvenMatrixCreate(int rows, int columns) {
        int[][] output = new int[rows][columns];
        for (int row = 0; row < output.length; row++) {
            if (row % 2 == 0) {
                output[row] = ArrayUtils.generateEvenArr(10, columns);
            } else {
                output[row] = ArrayUtils.generateOddArr(10, columns);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] testMatrix = randomOddEvenMatrixCreate(11, 15);
        System.out.println(MatrixUtils.toString(testMatrix));
    }
}
