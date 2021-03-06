package ua.artcode.basic.week2;

import java.util.Scanner;
import ua.artcode.basic.utils.ArrayUtils;

/**
 * Created by olsas on 2/28/2016.
 */
public class RandomPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input pass/array size!");
        int size = scanner.nextInt();

        System.out.println("Input range!");
        int range = scanner.nextInt();

        int[] yourArr = ArrayUtils.generateArr(size, range);
        ArrayUtils.printArr(yourArr);

        System.out.println("Are you pleasured? true/false");
        boolean isGoodPass = scanner.nextBoolean();
        if (isGoodPass) {
            System.out.println("**********************");
            ArrayUtils.printArr(yourArr);
            System.out.println("\n**********************");
        } else {
            System.out.println("Repeating action!");
            int[] newArr = ArrayUtils.generateArr(size, range);
            ArrayUtils.printArr(newArr);
        }
    }
}
