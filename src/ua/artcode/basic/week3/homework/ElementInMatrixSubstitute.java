package ua.artcode.basic.week3.homework;

import ua.artcode.basic.utils.MatrixUtils;

import java.util.Arrays;

/**
 * Created by olsas on 3/14/2016.
 * <p>
 * 3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8
 */
public class ElementInMatrixSubstitute {
    public static int[][] replaceEvenlyDivisibleByFiveToEight(int[][] originalMatrix) {
        for (int i = 0; i < originalMatrix.length; i++) {
            for (int j = 0; j < originalMatrix[i].length; j++) {
                originalMatrix[i][j] = originalMatrix[i][j] % 5 == 0 ? 8 : originalMatrix[i][j];
            }
        }
        return originalMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateRandomIntMatrix(8,7);
        System.out.println("Original matrix \n" + Arrays.deepToString(matrix));
        replaceEvenlyDivisibleByFiveToEight(matrix);
        System.out.println("Edited matrix \n" + Arrays.deepToString(matrix));
    }
}
