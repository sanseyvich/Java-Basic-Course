package ua.artcode.oop.week3;

import java.util.Arrays;

/**
 * Created by olsas on 4/5/2016.
 */
public class test {
    public static void main(String[] args) {
        int [] tst = {1,2,3};

        for (int it :
                tst) {
            it = 21;
        }

        System.out.println(Arrays.toString(tst));
    }
}
