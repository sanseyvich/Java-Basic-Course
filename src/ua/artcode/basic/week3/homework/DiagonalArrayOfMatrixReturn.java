package ua.artcode.basic.week3.homework;

import ua.artcode.basic.utils.MatrixUtils;

import java.util.Arrays;

/**
 * Created by olsas on 3/14/2016.
 * <p>
 * 3.4. Создать массив, который будет состоять из диагонали матрици
 */
public class DiagonalArrayOfMatrixReturn {
    public static int[] returnDiagonalArrayOfMatrix(int[][] matrix) {
        int[] output = new int[matrix.length];
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            output[count] = matrix[i][count];
            count++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[][] testMatrix = MatrixUtils.generateRandomIntMatrix(4, 4);
        System.out.println("Matrix: \n" + Arrays.deepToString(testMatrix));
        System.out.println("Diagonal array of it: \n" + Arrays.toString(returnDiagonalArrayOfMatrix(testMatrix)));
    }
}
