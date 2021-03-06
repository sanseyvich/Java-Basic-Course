package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 3/2/2016.
 * <p>
 * Given an array of ints, return true if 6 appears as either the first or last element in the array.
 * The array will be length 1 or more.
 * firstLast6({1, 2, 6}) → true
 * firstLast6({6, 1, 2, 3}) → true
 * firstLast6({13, 6, 1, 2, 3}) → false
 */
public class _10CodingBatArray1_1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6 ? true : false;
    }
}
