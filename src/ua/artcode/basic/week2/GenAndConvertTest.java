package ua.artcode.basic.week2;

import ua.artcode.basic.utils.ArrayUtils;

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
