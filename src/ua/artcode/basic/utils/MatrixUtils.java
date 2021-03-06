package ua.artcode.basic.utils;

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

    public static int[][] generateRandomIntMatrix(int lineAmount, int rowAmount) {
        int[][] matrix = new int[lineAmount][rowAmount];
        for (int i = 0; i < lineAmount; i++) {
            for (int j = 0; j < rowAmount; j++) {
                matrix[i][j] = ArrayUtils.getRandomNum(100);
            }
        }
        return matrix;
    }

    public static int[][] replaceEvenlyDivisibleByFiveToEightInMatrix(int[][] originalMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                originalMatrix[i][j] = originalMatrix[i][j] % 5 == 0 ? 8 : originalMatrix[i][j];
            }
        }
        return originalMatrix;
    }

    public static boolean[][] createMatrixWhereEqualRowAndLineElementsWouldBeTrue(int lineAmount, int rowAmount) {
        boolean[][] matrix = new boolean[lineAmount][rowAmount];
        for (int i = 0; i < lineAmount; i++) {
            for (int j = 0; j < rowAmount; j++) {
                matrix[i][j] = i == j ? true : false;
            }
        }
        return matrix;
    }
}
