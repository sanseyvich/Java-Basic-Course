package ua.artcode.basic.week3.homework;

import ua.artcode.basic.utils.MatrixUtils;

import java.util.Arrays;

/**
 * Created by olsas on 3/16/2016.
 * <p>
 * 3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
 * b) Поменять наибольший и наименьший столбик в двухмерном массиве.
 */
public class ArrayElementsReorder {
    public static void changeBiggestAndLeastStrings(int[][] arr) {
        int bigIndex = returnIndexOfBiggestStringSumInMatrix(arr);
        int smallIndex = returnIndexOfLeastStringSumInMatrix(arr);
        int[] biggestTemp = arr[bigIndex];
        arr[bigIndex] = arr[smallIndex];
        arr[smallIndex] = biggestTemp;
    }

    public static int returnIndexOfBiggestStringSumInMatrix(int[][] arr) {
        int index = 0;
        int genSum = sumArrayElements(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int curSum = sumArrayElements(arr[i]);
            if (curSum > genSum) {
                index = i;
                genSum = curSum;
            }
        }
        return index;
    }

    public static int returnIndexOfLeastStringSumInMatrix(int[][] arr) {
        int index = 0;
        int genSum = sumArrayElements(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int curSum = sumArrayElements(arr[i]);
            if (curSum < genSum) {
                index = i;
                genSum = curSum;
            }
        }
        return index;
    }

    public static int sumArrayElements(int[] arr) {
        int curSum = 0;
        for (int j = 0; j < arr.length; j++) {
            curSum += arr[j];
        }
        return curSum;
    }

    public static void changeBiggestAndLeastRows(int[][] arr) {
        int bigIndex = returnIndexOfBiggestRowSumInMatrix(arr);
        int smallIndex = returnIndexOfLeastRowSumInMatrix(arr);
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i][bigIndex];
            arr[i][bigIndex] = arr[i][smallIndex];
            arr[i][smallIndex] = temp;
        }
    }

    public static int returnIndexOfBiggestRowSumInMatrix(int[][] arr) {
        int index = 0;
        int sum = sumRowInMatrix(arr, 0);
        for (int i = 1; i < arr[0].length; i++) {
            int curSum = sumRowInMatrix(arr, i);
            if (curSum > sum){
                sum = curSum;
                index = i;
            }
        }
        return index;
    }

    public static int returnIndexOfLeastRowSumInMatrix(int[][] arr) {
        int index = 0;
        int sum = sumRowInMatrix(arr, 0);
        for (int i = 1; i < arr[0].length; i++) {
            int curSum = sumRowInMatrix(arr, i);
            if (curSum < sum){
                sum = curSum;
                index = i;
            }
        }
        return index;
    }

    public static int sumRowInMatrix(int[][] mat, int row) {
        int curSum = 0;
        for (int i = 0; i < mat.length; i++) {
            curSum += mat[i][row];
        }
        return curSum;
    }

    public static void main(String[] args) {
        int[][] matrix = MatrixUtils.generateRandomIntMatrix(4, 2);
        System.out.println("Before changeBiggestAndLeastStrings " + Arrays.deepToString(matrix));
        changeBiggestAndLeastStrings(matrix);
        System.out.println("After changeBiggestAndLeastStrings " + Arrays.deepToString(matrix));

        int[][] newMatrix = MatrixUtils.generateRandomIntMatrix(2, 4);
        System.out.println("Before changeBiggestAndLeastRows " + Arrays.deepToString(newMatrix));
        changeBiggestAndLeastRows(newMatrix);
        System.out.println("After changeBiggestAndLeastRows " + Arrays.deepToString(newMatrix));
    }
}