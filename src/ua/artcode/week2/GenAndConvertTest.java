package ua.artcode.week2;

import ua.artcode.week2.util.ArrayUtils;

/**
 * Created by olsas on 2/28/2016.
 */
public class GenAndConvertTest {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.generateEvenArr(100, 10);
        String res = ArrayUtils.convertIntArrayToString(arr);
        System.out.println(res);
    }
}
