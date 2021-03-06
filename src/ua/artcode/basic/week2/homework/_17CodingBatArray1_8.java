package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/5/2016.
 * <p>
 * Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
 * and set all the other elements to be that value. Return the changed array.
 * <p>
 * maxEnd3({1, 2, 3}) → {3, 3, 3}
 * maxEnd3({11, 5, 9}) → {11, 11, 11}
 * maxEnd3({2, 11, 3}) → {3, 3, 3}
 */
public class _17CodingBatArray1_8 {
    public int[] maxEnd3(int[] nums) {
        int[] newNums = new int[3];
        newNums[0] = newNums[1] = newNums[2] = (nums[0] > nums[2]) ? nums[0] : nums[2];
        return newNums;
    }
}
